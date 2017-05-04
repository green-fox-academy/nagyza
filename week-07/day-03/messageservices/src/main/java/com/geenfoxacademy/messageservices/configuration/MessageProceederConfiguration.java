package com.geenfoxacademy.messageservices.configuration;

import com.geenfoxacademy.messageservices.service.MessageProceeder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageProceederConfiguration {

  @Bean
  public MessageProceeder myMessageProceeder() {
    return new MessageProceeder();
  }
}
