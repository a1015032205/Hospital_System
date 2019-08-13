package org.java.webSocket;

import com.alibaba.fastjson.JSON;
import org.java.entity.Info;
import org.java.entity.Message;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author 秒度
 * @Date 2019/7/31 0031 21:07
 */
//访问地址:  ws://localhost:9999/chat
@ServerEndpoint("/chat")
@Component
public class ChatSocketServer {
    //把所有的管道都存放到集合中//加上static的目的，防止集合重复初始化
    private static List<Session> sesList = new ArrayList<>();
    //存放所有用户的名称
    private static List<String> names = new ArrayList<>();
    //用于保存当前用户名称
    private String username;
    //存放每一个用户，对应管道
    private static Map<String, Session> map = new HashMap<>();

    @OnOpen
    public void open(Session session) throws IOException {
        //System.out.println("连接通道已建立，通道编号是:"+session.getId());
        //获得当前管道对应的用户名 user=jack
        String queryString = session.getQueryString();
        //把姓名取出来，赋值给uname
        // username = queryString.split("=")[1];
        username = URLDecoder.decode(queryString.split("=")[1], "UTF-8");
        //当有一个用户登录时，就把它的名称，存放到集合中
        names.add(username);
        //把每一个管道，存放到集合中
        sesList.add(session);
        //创建一个Message对象，用于封装：1、欢迎信息 2、用户列表  3、聊天内容
        //创建一条欢迎信息,提示用新用户登录
        //把每个用户的管道，以key值对存放到集合中
        map.put(username, session);
        String welcome = "<b style='color:blue'>欢迎<span style='color:Red'>" + username + "</span>来到聊天室</b>";
        Message message = new Message();
        message.setWelcome(welcome);
        message.setNames(names);
        broadcast(message.toJson());
    }

    /**
     * 向每一个连接管道，分别一条欢迎信息
     * 注意:如果在广播时，不仅要返回欢迎信息，还要同时返回所有的用户列表，就返回一个json格式的对象
     */
    private void broadcast(String json) throws IOException {
        for (Session session : sesList) {
            session.getBasicRemote().sendText(json);
        }
    }

    /**
     * session即为当前退出的管道
     *
     * @param session
     */
    @OnClose
    public void exit(Session session) throws IOException {
        sesList.remove(session);
        names.remove(username);
        Message message = new Message();
        String welcome = "<b style='color:green'><span style='color:Red'>" + username + "</span>离开了聊天室</b>";
        message.setWelcome(welcome);
        message.setNames(names);

        broadcast(message.toJson());
    }

    /**
     * 处理来自至客户端的消息
     *
     * @param session 当前管道，是自己的管道 哪一个管道发送的消息
     * @param json    消息的内容
     */
    @OnMessage
    public void showMessage(Session session, String json) throws IOException {
        //将json转换成 Info对象
        Info info = JSON.parseObject(json, Info.class);
        System.out.println(info);
        if (info.getType() == 1) {
            //封装一个Message,将消息封装在里面，然后将Message转换成json,向每一个管道进行广播
            Message message = new Message();
            //只需要设置聊天内容，欢迎信息，用户无需处理
            message.setMsg(info.getMsg(), username);
            System.out.println(info.getMsg());
            broadcast(message.toJson());
        } else {
            //私聊： 向对方的管道发送消息，也同时向自己的管道发送消息
            String toUser = info.getToUser();
            //把多个名称，按,分割成数组
            String[] users = toUser.split(",");
            Message message = new Message();
            //消息类型：私聊
            message.setType(2);
            //发消息的人员名称
            message.setFromUser(username);
            message.setMsg("【悄悄话】<B style='color:green'>" + username + "</>说:" + info.getMsg() + " " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            System.out.println(message.toJson());
            for (String user : users) {
                //通过用户名，获得对方的管道
                Session toSession = map.get(user);
                System.out.println(toSession);

                toSession.getBasicRemote().sendText(message.toJson());
            }
            //向自己的管道发送
            session.getBasicRemote().sendText(message.toJson());
        }
    }
}
