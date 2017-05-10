package com.greenfoxacademy.restbackendfrontendexercise.controllers;

import com.greenfoxacademy.restbackendfrontendexercise.model.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterRestController {

  @Autowired
  ErrorMessage errorMessage;

  @GetMapping("/greeter")
  public String greeter(@RequestParam(value = "name") String input) {
    return "OK ";
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage errorMessageSender(Exception e) {
    errorMessage.setError("Please provide a name!");
    return errorMessage;
  }
}
