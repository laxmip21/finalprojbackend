package com.example.groupactivity.service;

import com.example.groupactivity.entity.Product;

import java.util.List;

public interface ProductService {

         Product save(Product product);

        void delete(Integer id);

        List<Product> all();

        Product findById( Integer id );

    }

