package com.anil.product.service;

import com.anil.product.model.Category;
import com.anil.product.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository repository;

    public Category add(Category category) {
        return repository.save(category);
    }
}
