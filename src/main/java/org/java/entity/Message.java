package org.java.entity;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author 秒度
 * @Date 2019/7/31 0031 21:04
 */

public class Message implements Serializable {
    //欢迎或者欢送信息
    private String welcome;
    //所有已登录的用户名称
    private List<String> names;
    //private String msg;//聊天的内容
    private String msg;
    //标识，当前消息是群聊消息，还是私聊消息  1:群聊  2：私聊
    private int type=1;
    //标识，当前消息，来自至哪一个用户
    private String fromUser;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Message{" +
                "welcome='" + welcome + '\'' +
                ", names=" + names +
                ", msg='" + msg + '\'' +
                ", fromUser='" + fromUser + '\'' +
                '}';
    }


    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }


    public String toJson() {
        return JSON.toJSONString(this);
    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setMsg(String msg, String username) {

        this.msg = "<b style='color:blue'>【" + username + "】说:</b>" + msg + " " + new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
}
