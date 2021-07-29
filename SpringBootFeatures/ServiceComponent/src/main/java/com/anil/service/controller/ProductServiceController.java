package com.anil.service.controller;

import com.anil.service.model.Product;
import com.anil.service.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductServiceController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProducts(){
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    @RequestMapping(value = "/products{id}", method = RequestMethod.PUT)
    public void updateProduct(@PathVariable("id") String id, @RequestBody Product product){
        productService.updateProduct(id, product);
    }
}
