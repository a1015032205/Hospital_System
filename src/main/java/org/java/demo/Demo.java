package org.java.demo;

import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.HashMap;
import java.util.Map;

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
        map();
    }

    public static void map() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("name","jack");
        map.put("name","andy");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
