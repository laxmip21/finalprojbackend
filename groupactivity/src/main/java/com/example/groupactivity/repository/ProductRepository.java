package com.example.groupactivity.repository;

import com.example.groupactivity.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
