package com.example.catservice.controller;

import com.example.catservice.model.Product;
import com.example.catservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;
    private final ProductService productService;

    public ProductController(ProductService service, ProductService productService) {
        this.service = service;
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    @GetMapping("/min-price")
        public List<Product>getByMinimumPrice(@RequestParam("price") BigDecimal price){
            return productService.getByMinimumPrice(price);
        }
    }
}