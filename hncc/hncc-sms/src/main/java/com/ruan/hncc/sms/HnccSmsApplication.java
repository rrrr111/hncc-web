package com.ruan.hncc.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HnccSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HnccSmsApplication.class, args);
    }

}
