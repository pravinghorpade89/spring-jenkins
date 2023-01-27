package com.javatech.spring.jenkins.springjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	
	@Test
	void contextLoads() {
		logger.info("Executing test");
		logger.info("Executing test second time");
		assertEquals(true, true);
	}

}
