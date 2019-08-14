package org.java.controller;

import org.java.service.UserService;
import org.java.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019-08-12 13:45
 * @Description：前台用户操作控制器
 */
@RequestMapping(value = {"/user"})
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 前台用户登录
     *
     * @return
     */
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(@RequestParam Map<String, Object> map, HttpServletRequest request) {
        String password = map.get("patient_pwd").toString();
        String patient_pwd = MD5Utils.getPassword(password);
        System.out.println(patient_pwd);
        map.remove("patient_pwd");
        map.put("patient_pwd", patient_pwd);
        Map<String, Object> user = userService.userLogin(map);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            return "/index";
        } else {
            request.setAttribute("error","用户名或密码错误");
            return "/login";
        }
    }
}
