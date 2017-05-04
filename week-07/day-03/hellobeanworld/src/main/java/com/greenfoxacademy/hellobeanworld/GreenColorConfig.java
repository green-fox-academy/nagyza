package com.greenfoxacademy.hellobeanworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreenColorConfig {
  @Bean
  public MyColor myColor() {
    return new GreenColor();
  }
}
