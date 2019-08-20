package org.java.service;

import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019-08-20 18:24
 * @Description：后台用户控制中心
 */

public interface OaUserService {
    /**
     * 后台登录
     *
     * @param map
     * @return
     */
    Map<String, Object> oaLogin(String username);
}
