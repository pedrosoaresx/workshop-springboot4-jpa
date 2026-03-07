package com.pedrodev.course.service;

import com.pedrodev.course.entities.Product;
import com.pedrodev.course.repository.OrderRepository;
import com.pedrodev.course.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){
        List<Product> list = productRepository.findAll();
        return list;
    }

    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }

}
