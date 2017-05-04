package com.geenfoxacademy.messageservices.service;

public class EmailService implements MessageService {

  @Override
  public String sendMessage(String message, String address) {
    return "Email Sent to " + address + " with Message=" + message;
  }
}
