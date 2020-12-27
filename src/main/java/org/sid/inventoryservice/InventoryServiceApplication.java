package org.sid.inventoryservice;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner Start(ProductRepository productRepository) {

        return args -> {

            productRepository.save(new Product(null, "telephone", 20, 9000));
            productRepository.save(new Product(null, "dellXPS", 20, 15000));
            productRepository.save(new Product(null, "ZX10R", 20, 120000));
            productRepository.findAll().forEach(p -> {

                System.out.println(p.getName());
            });


        };

    }


}
