package com.siriusacm.mail.services.web.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class MailController {

  @Value("${profile}")
  private String profile;

  @GetMapping("/profiles/1")
  public Mono<String> getMails() {
    return Mono.just(String.format("Getting mail for profile from config=%s", profile));
  }
}
