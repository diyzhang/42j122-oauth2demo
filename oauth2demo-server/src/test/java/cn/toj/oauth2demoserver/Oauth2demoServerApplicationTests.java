package cn.toj.oauth2demoserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class Oauth2demoServerApplicationTests {

    @Test
    void contextLoads() {

        System.out.println(new BCryptPasswordEncoder().encode("123456"));

    }

}
