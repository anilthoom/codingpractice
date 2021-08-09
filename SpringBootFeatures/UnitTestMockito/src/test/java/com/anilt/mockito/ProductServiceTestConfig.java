package com.anilt.mockito;

import com.anilt.mockito.service.ProductService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class ProductServiceTestConfig {
    @Bean
    @Primary
    public ProductService productService(){
        return Mockito.mock(ProductService.class);
    }
}
