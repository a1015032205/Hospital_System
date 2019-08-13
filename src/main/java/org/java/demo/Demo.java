package org.java.demo;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @Author 秒度
 * @Date 2019-08-12 18:42
 * @Description：demo
 */

public class Demo {
    public static void main(String[] args) {
        String algorithmName = "md5";
        int hashIterations = 3;
        SimpleHash hash = new SimpleHash(algorithmName, "123", "d102", hashIterations);
        System.out.println(hash);
    }
}
