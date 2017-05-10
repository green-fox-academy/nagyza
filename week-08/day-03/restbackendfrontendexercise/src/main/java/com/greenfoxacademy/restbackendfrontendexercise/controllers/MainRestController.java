package com.greenfoxacademy.restbackendfrontendexercise.controllers;

import com.greenfoxacademy.restbackendfrontendexercise.model.Doubling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.greenfoxacademy.restbackendfrontendexercise.model.ErrorMessage;

@RestController
public class MainRestController {

  @Autowired
  Doubling doubling;

  @GetMapping("/doubling")
  public Doubling doubler(@RequestParam(value = "input") int input) {
    doubling.setReceived(input);
    return doubling;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage errorMessageSender(Exception e) {
    return new ErrorMessage("Please provide an input!");
  }
}
