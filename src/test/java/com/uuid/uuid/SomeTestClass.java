package com.uuid.uuid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles("test")
@SpringBootTest
class SomeTestClass {

	@Test
	void contextLoads() {
		System.out.println(1);
	}

	@Test
	void someTest(){
		System.out.println(2);



	}

}
