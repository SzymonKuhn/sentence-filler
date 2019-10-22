package com.sda.javagda25.cloud.sentencefiller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SentenceFillerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentenceFillerApplication.class, args);
    }

}
