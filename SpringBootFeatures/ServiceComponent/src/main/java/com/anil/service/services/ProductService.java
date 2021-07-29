package com.anil.service.services;

import com.anil.service.model.Product;

import java.util.Collection;

public interface ProductService {
    public abstract void createProduct(Product product);
    public abstract Collection<Product> getProducts();
    public abstract void updateProduct(String id, Product product);
    public abstract void deleteProduct(String id);
}
