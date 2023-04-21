package com.example.udemykurs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdemyKursApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdemyKursApplication.class, args);


        int a = 31;
        int b = a > 5 ? 3 : 99;

        System.out.println(b);
    }

}
