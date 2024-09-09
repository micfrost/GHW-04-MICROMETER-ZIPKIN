package com.micfro.guestpersonapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GuestPersonApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(GuestPersonApiApplication.class, args);
  }
}

@Slf4j
@RestController
class GuestPersonController {

  @GetMapping("/guestperson")
  public String getGuestPerson() {
    log.info("Received request for guest person");
    String guestPerson = "Michal Frost";
    log.info("Responding with guest person: {}", guestPerson);
    return guestPerson;
  }
}