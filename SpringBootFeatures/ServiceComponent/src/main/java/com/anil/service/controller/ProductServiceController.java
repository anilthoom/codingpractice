package com.anil.service.controller;

import com.anil.service.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {

    @Autowired
    ProductService productService;
}
