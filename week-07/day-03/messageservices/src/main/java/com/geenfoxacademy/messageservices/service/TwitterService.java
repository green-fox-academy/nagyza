package com.geenfoxacademy.messageservices.service;

public class TwitterService implements MessageService {

  private String message;

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String sendMessage() {
    return this.message;
  }
}
