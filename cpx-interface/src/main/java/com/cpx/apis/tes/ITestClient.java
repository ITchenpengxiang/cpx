package com.cpx.apis.tes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "test-service")
public interface ITestClient {

    @GetMapping("/test/findById/{id}")
    String findById(@PathVariable("id") String id);
}
