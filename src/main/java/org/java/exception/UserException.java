package org.java.exception;

/**
 * @title: UserException
 * @author: xiaobing
 * @Description: TODO
 * @Date: Created in 2019-07-16 17:04
 */
public class UserException extends RuntimeException {

    private Integer code;

    public UserException() {
        super();
    }

    public UserException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
