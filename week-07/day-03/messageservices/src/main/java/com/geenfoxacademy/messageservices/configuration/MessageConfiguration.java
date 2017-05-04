package com.geenfoxacademy.messageservices.configuration;

import com.geenfoxacademy.messageservices.service.EmailService;
import com.geenfoxacademy.messageservices.service.MessageService;
import com.geenfoxacademy.messageservices.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {


  public MessageService myEmailService() {
    return new EmailService();
  }

  @Bean
  public MessageService myTwitterService() {
    return new TwitterService();
  }
}
