package org.java.controller;

import org.java.service.OaUserService;
import org.java.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019-08-20 18:15
 * @Description：后台用户中心控制器
 */
@Controller
@RequestMapping(value = {"/background"})
public class OaUserController {

    /**
     * 后台登录
     *
     * @param map
     * @return
     */
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(HttpServletRequest request) {
        return null;
    }
}
