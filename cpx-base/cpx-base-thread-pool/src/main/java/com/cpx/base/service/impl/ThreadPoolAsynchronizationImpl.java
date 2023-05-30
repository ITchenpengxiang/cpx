package com.cpx.base.service.impl;

import com.cpx.base.service.ThreadPoolAsynchronization;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author ：pengxiang chen
 * @date ：Created in 2023-05-30
 * @description ：
 * @version: 1.0
 */
@Slf4j
@Service
public class ThreadPoolAsynchronizationImpl implements ThreadPoolAsynchronization {
    @Override
    @Async("taskExecutor")
    public String getNumber(Object param) {
        log.info("线程池中的日志:{}",param);
        String res = param.toString();
        log.info("线程池中的res{}",res);
        return res;
    }
}
