package com.uuid.uuid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class UuidApplicationTests {

	@Test
	void contextLoads() {




	}

	@Test
	void contextLoad2s() {
		System.out.println(1);
	}

	@Test
	void someTest(){
		System.out.println(2);



	}

}
