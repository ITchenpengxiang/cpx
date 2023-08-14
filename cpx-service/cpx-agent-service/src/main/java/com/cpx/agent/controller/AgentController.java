package com.cpx.agent.controller;

import com.cpx.apis.tes.ITestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：pengxiang chen
 * @date ：Created in 2023-05-16
 * @description ：
 * @version: 1.0
 */
@RestController
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    private ITestClient iTestClient;

    @GetMapping("/test")
    public String test() {
        return "hello world   3333";
    }


    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") String id) {
        return iTestClient.findById(id);
    }



}
