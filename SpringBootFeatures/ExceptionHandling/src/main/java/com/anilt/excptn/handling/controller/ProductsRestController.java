package com.anilt.excptn.handling.controller;

import com.anilt.excptn.handling.exceptions.ProductNotFoundException;
import com.anilt.excptn.handling.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductsRestController {
    public static Map<String, Product> productRepo = new HashMap<>();
    static {
        Product lens = new Product();
        lens.setId("1");
        lens.setName("Canon");

        Product tripod = new Product();
        tripod.setId("2");
        tripod.setName("Manfrotto");

        productRepo.put(lens.getId(), lens);
        productRepo.put(tripod.getId(), tripod);
    }

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getAllProducts(){
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}")
    public ResponseEntity<Object> getProductById(@PathVariable("id") String id){
        return new ResponseEntity<>(productRepo.get(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product){
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>("Product created successfully.", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product){
        if(!productRepo.containsKey(id))
            throw new ProductNotFoundException();
        productRepo.remove(id);
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>("Product updated successfully.", HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") String id){
        productRepo.remove(id);
        return new ResponseEntity<>("Product deleted successfully.", HttpStatus.OK);
    }
}
