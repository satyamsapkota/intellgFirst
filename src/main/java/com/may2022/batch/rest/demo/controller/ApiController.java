package com.may2022.batch.rest.demo.controller;


import com.may2022.batch.rest.demo.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/api")
public class ApiController {
    @RequestMapping(value ="product/{product-id}",method = RequestMethod.GET)
    public Product getProductDetails(@PathVariable("product-id")String ProductId){
    return new Product(ProductId,"testname");

    }
    @RequestMapping(value ="product1/{product-id}",method = RequestMethod.GET)
    public Product getProductDetails(@RequestParam ("product-id")String ProductId){
    return new Product(ProductId,"testname");
}
}
