package com.may2022.batch.rest.demo.service;

import com.may2022.batch.rest.demo.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ECommerceService {

    public List<Category> listCategories() {
        List<Category> categories = new ArrayList<>();
        for (int count = 0; count < 5; count++) {
            categories.add(new Category("cat-" + count, "name-" + count));
        }
        return categories;
    }
}
