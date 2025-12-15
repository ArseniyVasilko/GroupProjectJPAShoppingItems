package com.example.demo;

import com.example.demo.DBModel.ShoppingItem;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@Data
@SpringBootApplication
public class GroupProjectShopApplication {
    public static void main(String[] args) {
        org.springframework.context.ApplicationContext context = SpringApplication.run(GroupProjectShopApplication.class, args);

        ServiceClass service = context.getBean(ServiceClass.class);

        service.generateDefaultItems();



    }
}
