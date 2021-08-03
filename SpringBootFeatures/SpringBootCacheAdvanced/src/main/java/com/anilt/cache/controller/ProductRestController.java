package com.anilt.cache.controller;

import com.anilt.cache.model.Product;
import com.anilt.cache.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductRestController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}")
    public ResponseEntity<Object> getProductById(@PathVariable("id") String id){
        return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product){
        productService.createProduct(product);
        return new ResponseEntity<>("Product created successfully.", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product){
        productService.updateProduct(id, product);
        return new ResponseEntity<>("Product updated successfully.", HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") String id){
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product deleted successfully.", HttpStatus.OK);
    }
}
