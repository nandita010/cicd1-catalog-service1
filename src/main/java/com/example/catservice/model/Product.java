package com.example.catservice.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Entity
@Table(name = "products")

public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;
    private BigDecimal price;
    private Long id;

    public Product() {
    }

    public Product(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}



