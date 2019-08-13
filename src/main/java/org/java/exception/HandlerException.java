package org.java.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @title: GlobalDefaultHandlerException
 * @author: xiaobing
 * @Description:
 * @Date: Created in 2019-07-16 16:55
 */
@ControllerAdvice
public class HandlerException {

   // private static final Logger LOGGER = LoggerFactory.getLogger(HandlerException.class);

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception ex, HttpServletRequest request){
            return "/error/404";
    }

/*    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof UserException){
            UserException userException = (UserException)e;
            return ResultUtil.error(userException.getCode(),userException.getMessage());
        }else {
            LOGGER.error("【系统异常】 {}",e);
            return ResultUtil.error(-1,"未知错误");
        }
    }*/

    /*@ExceptionHandler
    @ResponseBody
    public Result unknownAccount(UnknownAccountException e) {
        LOGGER.error("账号不存在", e);
        return ResultUtil.error(1, "账号不存在");
    }

    @ExceptionHandler
    @ResponseBody
    public Result incorrectCredentials(IncorrectCredentialsException e) {
        LOGGER.error("密码错误", e);
        return ResultUtil.error(-2, "密码错误");
    }

    @ExceptionHandler
    @ResponseBody
    public Result unknownException(Exception e) {
        LOGGER.error("发生了未知异常", e);
        // 发送邮件通知技术人员
        return ResultUtil.error(-99, "系统出现错误, 请联系网站管理员!");
    }*/

}
