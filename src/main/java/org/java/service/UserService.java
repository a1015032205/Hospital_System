package org.java.service;

import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019-08-14 17:28
 * @Description：前端用户操作
 */

public interface UserService {

    /**
     * 登录
     *
     * @param map
     * @return
     */
    Map<String, Object> userLogin(Map<String, Object> map);
}
