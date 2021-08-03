package com.anilt.cache.service.impl;

import com.anilt.cache.model.Product;
import com.anilt.cache.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private static Map<String, Product> productMap = new HashMap<>();
    static {
        Product p1 = new Product();
        p1.setId("1");
        p1.setName("Canon");

        Product p2 = new Product();
        p2.setId("2");
        p2.setName("Nikon");

        Product p3 = new Product();
        p3.setId("3");
        p3.setName("Sony");

        productMap.put(p1.getId(), p1);
        productMap.put(p2.getId(), p2);
        productMap.put(p3.getId(), p3);
    }
    @Override
    public Collection<Product> getAllProducts() {
        return productMap.values();
    }

    @Override
    public Product getProductById(String id) {
        return productMap.get(id);
    }

    @Override
    public void createProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void updateProduct(String id, Product product) {
        productMap.remove(id);
        productMap.put(id, product);
    }

    @Override
    public void deleteProduct(String id) {
        productMap.remove(id);
    }
}
