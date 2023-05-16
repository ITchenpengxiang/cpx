package com.cpx.base.cpxbase;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;


@SpringBootTest
class CpxBaseApplicationTests {

	@Test
	void contextLoads() {
		BigDecimal one = new BigDecimal("10.01");
		BigDecimal two = new BigDecimal("0.6871");
		System.out.println(one.multiply(two));
	}

}
