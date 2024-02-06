package com.cpx.encrypt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: pengxiang chen
 * @date: 2024/2/5 14:48
 * @description: 国密技术的学习
 */
@MapperScan("com.cpx.encrypt.mapper")
@SpringBootApplication
public class CpxBaseEncryptApplication {
    public static void main(String[] args) {
        SpringApplication.run(CpxBaseEncryptApplication.class, args);
    }
}