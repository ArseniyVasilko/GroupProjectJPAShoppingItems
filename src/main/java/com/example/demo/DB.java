package com.example.demo;

import com.example.demo.DBModel.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface DB extends JpaRepository<ShoppingItem, Integer> {
}
