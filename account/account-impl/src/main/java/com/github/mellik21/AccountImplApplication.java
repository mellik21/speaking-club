package com.github.mellik21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@EnableCircuitBreaker
@EnableSwagger2
//@EnableKafka
@SpringBootApplication
public class AccountImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountImplApplication.class, args);
    }
}
