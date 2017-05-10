package com.greenfoxacademy.restbackendfrontendexercise.model;

import org.springframework.stereotype.Service;

@Service
public class AppendA {
  private String appended;

  public AppendA() {
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

  public String getAppended() {
    return appended + "a";
  }
}
