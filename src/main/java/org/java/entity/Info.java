package org.java.entity;

import java.io.Serializable;

/**
 * @Author 秒度
 * @Date 2019/8/1 0001 15:07
 */

public class Info implements Serializable {
    //聊天类型，群聊或私聊
    private Integer type = 1;
    //消息内容
    private String msg;
    //消息发送哪一个用户----------如果选择群聊，该值为空
    private String toUser;

    @Override
    public String toString() {
        return "Info{" +
                "type=" + type +
                ", msg='" + msg + '\'' +
                ", toUser='" + toUser + '\'' +
                '}';
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }
}
