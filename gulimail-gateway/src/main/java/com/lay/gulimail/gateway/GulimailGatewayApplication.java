package com.lay.gulimail.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 1.开启服务注册发现
 * （配置nacos的注册中心地址）
 */
@RefreshScope
@EnableDiscoveryClient
//由于网管启动需要加载数据源，可以先排除掉url数据源以达到正常启动。或者直接排除mybatisplus
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GulimailGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimailGatewayApplication.class, args);
    }
}
