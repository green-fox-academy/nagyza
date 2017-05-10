package com.greenfoxacademy.restbackendfrontendexercise.controllers;

import com.greenfoxacademy.restbackendfrontendexercise.model.Doubling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.greenfoxacademy.restbackendfrontendexercise.model.ErrorMessage;

@RestController
public class DoublingRestController {

  @Autowired
  Doubling doubling;

  @Autowired
  ErrorMessage errorMessage;

  @GetMapping("/doubling")
  public Doubling doubler(@RequestParam(value = "input") int input) {
    doubling.setReceived(input);
    return doubling;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage errorMessageSender(Exception e) {
    errorMessage.setError("Please provide an input!");
    return errorMessage;
  }
}
