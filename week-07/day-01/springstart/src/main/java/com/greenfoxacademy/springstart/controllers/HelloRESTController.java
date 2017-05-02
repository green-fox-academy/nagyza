package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping
  public Greeting greeting() {
    return new Greeting(1, "Hello, World! Hello, hello!");
  }
}
