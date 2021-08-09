package com.anilt.mockito;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.security.RunAs;

@SpringBootTest
@ActiveProfiles("test")

class UnitTestMockitoApplicationTests {

	@Test
	void contextLoads() {
	}

}
