package com.micfro.greetingphraseapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GreetingPhraseApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(GreetingPhraseApiApplication.class, args);
  }

}

@Slf4j
@RestController
class GreetingPhraseController {

  @GetMapping("/greetingword")
  public String greetingPhrase() {
    log.info("Received request for greeting phrase");
    String greetingPhrase = "Hello to you: ";
    log.info("Responding with greeting phrase: {}", greetingPhrase);
    return greetingPhrase;
  }
}

