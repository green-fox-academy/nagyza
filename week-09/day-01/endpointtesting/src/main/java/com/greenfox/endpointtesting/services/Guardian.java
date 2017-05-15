package com.greenfox.endpointtesting.services;

import org.springframework.stereotype.Service;

@Service
public class Guardian {

  private String received;
  private String translated;

  public Guardian() {
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
