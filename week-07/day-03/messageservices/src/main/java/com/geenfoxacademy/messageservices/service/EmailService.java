package com.geenfoxacademy.messageservices.service;

public class EmailService implements MessageService {

  private String message;

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String sendMessage() {
    return this.message;
  }
}
