package com.cpx.agent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：pengxiang chen
 * @date ：Created in 2023-06-20
 * @description ：
 * @version: 1.0
 */
@RestController
@RequestMapping("/dubbo")
public class DubboController {

    @RequestMapping("/test")
    public String test() {
        return "hello world   3333";
    }
}
