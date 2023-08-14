package com.cpx.agent;




import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：pengxiang chen
 * @date ：Created in 2023-05-16
 * @description ：
 * @version: 1.0
 */

@SpringBootApplication
@EnableFeignClients(basePackages = "com.cpx.apis")
@MapperScan(basePackages = "com.cpx.agent.mapper")
public class CpxAgentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CpxAgentServiceApplication.class, args);
    }
}
