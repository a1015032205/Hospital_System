package org.java;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalApplicationTests {

    @Test
    public void contextLoads() {
        String algorithmName = "md5";
        int hashIterations = 3;
        SimpleHash hash = new SimpleHash(algorithmName, "123", "d102", hashIterations);
        System.out.println(hash);
    }

}
