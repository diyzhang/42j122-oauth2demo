package cn.toj.oauth2demoresources;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.toj.oauth2demoresources")
public class Oauth2demoResourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2demoResourcesApplication.class, args);
    }

}
