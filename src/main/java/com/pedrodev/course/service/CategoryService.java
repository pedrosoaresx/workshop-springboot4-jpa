package com.pedrodev.course.service;

import com.pedrodev.course.entities.Category;
import com.pedrodev.course.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll(){
        List<Category> list = categoryRepository.findAll();
        return list;
    }

    public Optional<Category> findById(Long id){
        return categoryRepository.findById(id);
    }

}
