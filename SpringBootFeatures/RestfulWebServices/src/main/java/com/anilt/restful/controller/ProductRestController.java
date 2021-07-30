package com.anilt.restful.controller;

import com.anilt.restful.model.Product;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductRestController {
    private static Map<String, Product> productRepo = new HashMap<>();
    static {
        Product p1 = new Product();
        p1.setId("1");
        p1.setName("Hyndai");

        Product p2 = new Product();
        p2.setId("2");
        p2.setName("Rangerover");

        productRepo.put(p1.getId(), p1);
        productRepo.put(p2.getId(), p2);
    }
}
