package com.micfro.greetingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@EnableFeignClients
public class GreetingServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(GreetingServiceApplication.class, args);
  }
}