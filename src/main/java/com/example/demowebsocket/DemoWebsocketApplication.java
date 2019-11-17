package com.example.demowebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 测试链接：
 * http://localhost:8080/index.html
 * http://localhost:8080/socket/pushMessage?sid=zhangsan&message=xxx
 */
@SpringBootApplication
public class DemoWebsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoWebsocketApplication.class, args);
    }

}
