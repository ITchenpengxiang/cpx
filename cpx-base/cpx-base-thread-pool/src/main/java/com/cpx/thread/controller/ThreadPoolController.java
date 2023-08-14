package com.cpx.thread.controller;

import com.cpx.thread.service.ThreadPoolAsynchronization;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @author ：pengxiang chen
 * @date ：Created in 2023-05-30
 * @description ：
 * @version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/threadPool")
public class ThreadPoolController {

    @Autowired
    private ThreadPoolAsynchronization threadPoolAsynchronization;

    @GetMapping("/test/{no}")
    public void test(@PathVariable("no") String no){
        String number = threadPoolAsynchronization.getNumber(no);
        log.info("线程池外面number:{}",number);
        BigDecimal bigDecimal = new BigDecimal(number);
     log.info("线程池外面{}",bigDecimal);
    }

}
