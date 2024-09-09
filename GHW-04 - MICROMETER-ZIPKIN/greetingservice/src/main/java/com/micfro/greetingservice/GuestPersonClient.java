package com.micfro.greetingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "guest-person-api")
public interface GuestPersonClient {

  @GetMapping("/guestperson")
  String getGuestPerson();
}