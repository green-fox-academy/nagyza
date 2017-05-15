package com.greenfox.endpointtesting.services;

import org.springframework.stereotype.Service;

@Service
public class Guardian {

  private String message;
  private String translated;

  public Guardian() {
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
