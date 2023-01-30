package com.vinicius.strproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class StrProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrProducerApplication.class, args);
    }

}
