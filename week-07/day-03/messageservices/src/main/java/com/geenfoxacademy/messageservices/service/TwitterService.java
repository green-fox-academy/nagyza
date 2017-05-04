package com.geenfoxacademy.messageservices.service;

public class TwitterService implements MessageService {

  @Override
  public String sendMessage(String message, String address) {
    return "Tweet Sent to " + address + "with Message=" + message;
  }
}
