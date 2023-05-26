package com.cpx.agent.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author ：pengxiang chen
 * @date ：Created in 2023-05-16
 * @description ：
 * @version: 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient  //开启注册中心
public class AgentGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(AgentGatewayApplication.class, args);
    }
}
