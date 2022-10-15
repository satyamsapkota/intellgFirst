package com.may2022.batch.rest.demo.controller;

import com.may2022.batch.rest.demo.model.Category;
import com.may2022.batch.rest.demo.service.ECommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:8080/v1/api/category-list
//http://localhost:8080/v1/api/product-list

@RestController
@RequestMapping(value = "/v1/api")
public class EcommerceController {

    @Autowired
    private ECommerceService eCommerceService;

    @GetMapping("/abc")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        return "greetings";
    }

    @RequestMapping(value = "/category-list", method = RequestMethod.GET)
    public List<Category> listCategories() {
        return eCommerceService.listCategories();
    }
}
