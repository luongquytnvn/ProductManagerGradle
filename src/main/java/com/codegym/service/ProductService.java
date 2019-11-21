package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List findAll();
    void create(Product product);
    void update(int id, Product product);
    Product findById(int id);
    void remote(int id);
}
