package com.cpx.cpxtestservice;

import com.mysql.jdbc.log.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@SpringBootTest
class CpxTestServiceApplicationTests {

    @Test
    void contextLoads() {
        //创见map集合
        HashMap<String, String> hashMap = new HashMap<String, String>() {
            {
                put("1", "1");
                put("2", "2");
            }
        };
        log.info("hashMap:{}", hashMap);

    }

}
