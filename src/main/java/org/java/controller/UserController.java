package org.java.controller;

import com.aliyuncs.exceptions.ClientException;
import org.java.util.MsgUtil;
import org.java.service.UserService;
import org.java.util.GetPoint;
import org.java.util.MD5Utils;
import org.java.util.OcrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * @Author 秒度
 * @Date 2019-08-12 13:45
 * @Description：前台用户操作控制器
 */

@Controller
@RequestMapping(value = {"/user"})
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
        //获得前台输入的密码
        String password = map.get("patient_pwd").toString();
        //存入MD5加密后的密码,覆盖原始的值
        map.put("patient_pwd", MD5Utils.getPassword(password));
        Map<String, Object> user = userService.userLogin(map);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            return "/index";
        } else {
            request.setAttribute("error", "用户名或密码错误");
            return "/login";
        }
    }

    /**
     * 用户注册发送短信
     *
     * @return
     * @throws ClientException
     */
    @ResponseBody
    @RequestMapping(value = {"/code"})
    public Integer code(String patient_tel) throws ClientException {
        Integer code = MsgUtil.sendMsg(patient_tel);
        System.out.println("CODE:" + code);
        return code;
    }

    /**
     * 身份证扫描
     *
     * @param myfile
     * @param request
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = {"/ocr"})
    public Map<String, Object> code(@RequestParam(value = "myfile") MultipartFile myfile, HttpServletRequest request) throws Exception {
        return OcrUtil.getIdCard(myfile, request);
    }

    /**
     * 百度地图将地址解析为经纬度
     *
     * @param add
     * @return
     */
    @ResponseBody
    @RequestMapping(value = {"/point"})
    public Map<String, Object> getPoint(String patient_add) {
        Map<String, Object> position = GetPoint.getPosition(patient_add);
        if (position != null) {
            return position;
        } else {
            return null;
        }
    }
}

