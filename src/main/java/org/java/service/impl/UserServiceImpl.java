package org.java.service.impl;

import org.java.dao.PatientMapper;
import org.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019-08-14 17:29
 * @Description：前端用户操作
 */
@Service("userSerive")
public class UserServiceImpl implements UserService {
    @Autowired
    private PatientMapper patientMapper;

    /**
     * 用户登录
     * @param map
     * @return
     */
    public Map<String, Object> userLogin(Map<String, Object> map) {
        return patientMapper.userLogin(map);
    }
}
