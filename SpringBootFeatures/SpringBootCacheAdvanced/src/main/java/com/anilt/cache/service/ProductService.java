package com.anilt.cache.service;

import com.anilt.cache.model.Product;

import java.util.Collection;

public interface ProductService {
    public abstract Collection<Product> getAllProducts();
    public abstract Product getProductById(String id);
    public abstract void createProduct(Product product);
    public abstract void updateProduct(String id, Product product);
    public abstract void deleteProduct(String id);
}
