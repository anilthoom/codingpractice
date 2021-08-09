package com.anilt.mockito;

import com.anilt.mockito.service.OrderService;
import com.anilt.mockito.service.ProductService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.security.RunAs;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
class UnitTestMockitoApplicationTests {

	@Autowired
	private OrderService orderService;

	@Autowired
	private ProductService productService;

	@Test
	public void whenUserIdIsProvided_thenRetrievedNameIsCorrect(){
		Mockito.when(productService.getProductName()).thenReturn("Mock Product Name");
		String testName = orderService.getProductName();
		Assert.assertEquals("Mock Product Name", testName);
	}
}
