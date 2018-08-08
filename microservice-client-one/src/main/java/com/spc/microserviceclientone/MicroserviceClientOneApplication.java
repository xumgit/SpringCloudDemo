package com.spc.microserviceclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceClientOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceClientOneApplication.class, args);
    }
}
