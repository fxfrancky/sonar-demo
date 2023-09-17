package com.fxfrancky.sonardemo;

import com.fxfrancky.sonardemo.controller.MessageController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarDemoApplicationTests {

	@Autowired
	private MessageController controller;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetMessage(){
		String message = controller.getMessage();
		Assertions.assertNotNull(message);
	}

}
