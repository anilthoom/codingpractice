package com.anil.rest.controller;

import com.anil.rest.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductServiceController {
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceController.class);
    private static Map<String, Product> productRepo = new HashMap<>();
    static {
        Product lens = new Product();
        lens.setId("1");
        lens.setName("Canon");
        productRepo.put(lens.getId(), lens);

        Product tripod = new Product();
        tripod.setId("2");
        tripod.setName("Monfratto");
        productRepo.put(tripod.getId(), tripod);
    }

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProducts(){
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/product/{id}")
    public ResponseEntity<Object> getProductById(@PathVariable("id") String id){
        return new ResponseEntity<>(productRepo.get(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product){
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.OK);
    }
}
