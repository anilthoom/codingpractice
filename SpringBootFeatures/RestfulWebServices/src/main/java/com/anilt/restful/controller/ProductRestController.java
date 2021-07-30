package com.anilt.restful.controller;

import com.anilt.restful.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProducts(){
        return new ResponseEntity<>(productRepo.values(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product){
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>("Product created successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product){
        productRepo.remove(id);
        productRepo.put(id, product);
        return new ResponseEntity<>("Product updated successfully", HttpStatus.OK);
    }
}
