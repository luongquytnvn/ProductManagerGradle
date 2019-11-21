package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> products;
    static {
        products =new HashMap<>();
        products.put(1,new Product(1,"Iphone 5","https://cdn.tgdd.vn/Products/Images/42/57240/iPhone-5-l.jpg"));
        products.put(2,new Product(2,"Iphone 6","https://cdn.tgdd.vn/Products/Images/42/87846/iphone-6s-plus-32gb-rose-gold-400x460.png"));
        products.put(3,new Product(3,"Iphone 7","https://cdn.tgdd.vn/Products/Images/42/74110/iphone-7-gold-400x460.png"));
        products.put(4,new Product(4,"Iphone 8","https://cdn.tgdd.vn/Products/Images/42/114110/iphone-8-plus-1-400x460.png"));
    }
    @Override
    public List findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void create(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void remote(int id) {
        products.remove(id);
    }
}
