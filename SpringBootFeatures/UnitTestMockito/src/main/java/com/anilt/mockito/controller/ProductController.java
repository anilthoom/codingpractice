package com.anilt.mockito.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping("/products")
    public String getName(){
        return "Anil";
    }
}
