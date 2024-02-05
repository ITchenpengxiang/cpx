package com.cpx.thread;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenpengxiang
 */
@Slf4j
@SpringBootApplication
public class CpxThreadPoolApplication {
    public static void main(String[] args) {
        SpringApplication.run(CpxThreadPoolApplication.class,args);
    }

}