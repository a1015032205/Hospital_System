package org.java.util;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @title: MD5Utils
 * @projectName logistics
 * @author: xiaobing
 * @Description: TODO
 * @Date: Created in 2019-08-06 22:08
 */
public class MD5Utils {

    /**
     * 获取加密后的密码
     * @param password 未加密的密码
     * @param salt 盐值
     * @return
     */
    public static String getPassword(String password){
        String algorithmName = "md5";
        String salt = "d102";
        int hashIterations = 3;
        SimpleHash hash = new SimpleHash(algorithmName, password, salt, hashIterations);
        return hash.toString();
    }


}
