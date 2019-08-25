package org.java.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019-08-20 20:37
 * @Description：shrio的拦截后会进此类
 */
@Controller
public class ShiroLoginController {

    /**
     * 只有未登录或者登录失败会进此方法
     *
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/shiro")
    public String login(HttpServletRequest request) throws Exception {
        System.out.println("shiro---------------------------");
        //获得错误信息shiroLoginFailure,如果是由于没有登录，进入控制器，该值为null
        String err = (String) request.getAttribute("shiroLoginFailure");
        //判断消息是否为空
        if (err != null) {
            if (err.endsWith("UnknownAccountException")) {
                throw new Exception("用户名不存在");
            }
            if (err.endsWith("IncorrectCredentialsException")) {
                throw new Exception("密码错误");
            }
        }
        return "redirect:/oa/login";
    }

    /**
     * 登录失败后返回
     * @param session
     * @return
     */
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String first(HttpSession session) {
        System.out.println("--------first-------------");
        //获得认证成功的主体
        Subject subject = SecurityUtils.getSubject();
        //从主体获得用户的主要凭证（就是认证方法，返回的SimpleAuthencationInfo对象的第一个参数，map）
        Map map = (Map) subject.getPrincipal();
        //获得用户名与菜单，存放在session中
        String username = (String) map.get("username");
        //获得菜单
      //  List<Map> menus = (List<Map>) map.get("menus");
      //  session.setAttribute("user", username);
      //  session.setAttribute("menus", menus);
        return "/background/index";
    }
}
