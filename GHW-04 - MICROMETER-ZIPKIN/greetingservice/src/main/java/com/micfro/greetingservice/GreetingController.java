package com.micfro.greetingservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@RestController
public class GreetingController {

  @Autowired
  private GreetingPhraseClient greetingPhraseClient;

  @Autowired
  private GuestPersonClient guestPersonClient;

  @GetMapping("/greeting-full")
  public String getFullGreeting() {
    log.info("Request received for full greeting");

    String greetingPhrase = greetingPhraseClient.getGreetingPhrase();
    log.info("Greeting phrase received successfully: {}", greetingPhrase);

    String guestPerson = guestPersonClient.getGuestPerson();
    log.info("Guest person received successfully: {}", guestPerson);

    String fullGreeting = greetingPhrase + " " + guestPerson;
    log.info("Full greeting composed successfully: {}", fullGreeting);

    return fullGreeting;
  }
}