package com.example.demo;

import com.example.demo.DBModel.ShoppingItem;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Data
@Service
public class ServiceClass {

    private DB db;

    @Autowired
    public ServiceClass(DB db) {
        this.db = db;
    }
    
    public void generateDefaultItems(){
        db.save(new ShoppingItem("Milk", 20.0f, LocalDate.now()));
        db.save(new ShoppingItem("Bread", 15.5f, LocalDate.now()));
        db.save(new ShoppingItem("Eggs (dozen)", 45.0f, LocalDate.now()));
        db.save(new ShoppingItem("Cheese", 80.0f, LocalDate.now()));
        db.save(new ShoppingItem("Apples (kg)", 50.0f, LocalDate.now()));
        db.save(new ShoppingItem("Chicken Breast (kg)", 150.0f, LocalDate.now()));
        db.save(new ShoppingItem("Rice (kg)", 60.0f, LocalDate.now()));
        db.save(new ShoppingItem("Pasta (pack)", 25.0f, LocalDate.now()));
        db.save(new ShoppingItem("Tomatoes (kg)", 40.0f, LocalDate.now()));
        db.save(new ShoppingItem("Butter", 70.0f, LocalDate.now()));
        db.flush();
    }

    public List<ShoppingItem> getItemsSortedByPrice(){
        Sort sort = Sort.by(Sort.Order.asc("price"));

        return db.findAll(sort);
    }
}
