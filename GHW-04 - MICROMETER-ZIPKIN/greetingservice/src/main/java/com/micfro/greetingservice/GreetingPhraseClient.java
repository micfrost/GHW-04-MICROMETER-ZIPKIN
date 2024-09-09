package com.micfro.greetingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greeting-phrase-api")
public interface GreetingPhraseClient {

  @GetMapping("/greetingword")
  String getGreetingPhrase();
}