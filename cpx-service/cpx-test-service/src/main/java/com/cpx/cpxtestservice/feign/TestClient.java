package com.cpx.cpxtestservice.feign;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：pengxiang chen
 * @date ：Created in 2023-05-16
 * @description ：
 * @version: 1.0
 */
@RestController
public class TestClient  {
    @GetMapping("/test/findById/{id}")
    public String findById(@PathVariable("id") String id) {
        return id;
    }
}
