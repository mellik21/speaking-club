package com.github.mellik21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
//@EnableSwagger2
@EnableKafka
public class AccountImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountImplApplication.class, args);
    }
}
