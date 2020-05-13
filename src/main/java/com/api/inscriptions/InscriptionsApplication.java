package com.api.inscriptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@RibbonClient(name = "school-service")
@EnableFeignClients
@SpringBootApplication
public class InscriptionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(InscriptionsApplication.class, args);
    }

}
