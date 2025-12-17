package com.example.demo;

import com.example.demo.DBModel.ShoppingItem;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Scanner;

@Data
@SpringBootApplication
public class GroupProjectShopApplication {
    public static void main(String[] args) {
        org.springframework.context.ApplicationContext context = SpringApplication.run(GroupProjectShopApplication.class, args);

        ServiceClass service = context.getBean(ServiceClass.class);

        service.generateDefaultItems();

        boolean running = true;
        while (running) {
            IO.println("Please select an option:\n" +"1. Add an item\n" +
                    "2. Item list\n" +
                    "3. Delete an item\n" +
                    "4. Delete all items\n" +
                    "5. List of expired items\n" +
                    "6. List of items sorted by price\n" +
                    "7. Exit");

            Scanner input = new Scanner(System.in);
            switch (input.nextLine()) {
                case "1":
                    continue;
                case "2":
                    continue;
                case "3":
                    continue;
                case "4":
                    continue;
                case "5":
                    continue;
                case "6":
                    for(ShoppingItem item:service.getItemsSortedByPrice()){
                        System.out.println(item);
                    }
                    continue;
                case "7":
                    IO.println("Thank you for shopping!, Shutting down...");
                    running = false;
                    break;
            }
        }

    }
}
