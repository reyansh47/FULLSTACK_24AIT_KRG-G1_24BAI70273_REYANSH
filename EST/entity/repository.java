package com.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner run(StudentRepository repo) {
        return args -> {
            repo.save(new Student("Alice", "alice@gmail.com", "Java"));
            repo.save(new Student("Bob",   "bob@gmail.com",   "Python"));

            System.out.println("\n\n" + "=".repeat(30));
            System.out.println("      STUDENT LIST      ");
            System.out.println("=".repeat(30));
            repo.findAll().forEach(s -> System.out.println(">> " + s));
            System.out.println("=".repeat(30) + "\n\n");
        };
    }
}
