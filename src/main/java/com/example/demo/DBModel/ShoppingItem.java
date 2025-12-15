package com.example.demo.DBModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@Table(name="shopping_items")
@Entity
public class ShoppingItem {
    public ShoppingItem(String name, float price, LocalDate expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false, scale = 2)
    float price;

    @Column(nullable = false)
    LocalDate expiryDate;
}
