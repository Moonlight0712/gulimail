package com.jay.gulimail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 想要远程调用其他的微服务就要引入我们的openfeign
 * 编写一个接口用来告诉springCloud这个接口需要调用远程微服务
 */
@EnableFeignClients(basePackages = "com.jay.gulimail.member.fegin")
@SpringBootApplication
public class GulimailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailMemberApplication.class, args);
    }

}
