package com.geenfoxacademy.messageservices.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

  @Autowired
  MessageService messageService;

  public void processMessage(String message, String address) {
    System.out.println(messageService.sendMessage(message, address));
  }
}
