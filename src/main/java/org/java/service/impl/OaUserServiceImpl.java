package org.java.service.impl;

import org.java.dao.StaffMapper;
import org.java.service.OaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019-08-20 18:24
 * @Description：后台用户控制中心
 */
@Service("oaUserService")
public class OaUserServiceImpl implements OaUserService {
    @Autowired
    private StaffMapper staffMapper;


    @Override
    public Map<String, Object> oaLogin(String username ) {
        return staffMapper.oaLogin(username);
    }
}
