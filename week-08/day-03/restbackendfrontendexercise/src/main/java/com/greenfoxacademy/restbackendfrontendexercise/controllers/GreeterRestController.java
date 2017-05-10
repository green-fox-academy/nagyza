package com.greenfoxacademy.restbackendfrontendexercise.controllers;

import com.greenfoxacademy.restbackendfrontendexercise.model.ErrorMessage;
import com.greenfoxacademy.restbackendfrontendexercise.model.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterRestController {

  @Autowired
  Greeter greeter;

  @Autowired
  ErrorMessage errorMessage;

  @GetMapping("/greeter")
  public Greeter getGreeter(@RequestParam(value = "name") String name, @RequestParam("title") String title) {
    greeter.setName(name);
    greeter.setTitle(title);
    return greeter;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage errorMessageSender(MissingServletRequestParameterException e) {
    String paramName = e.getParameterName();
    errorMessage.setError("Please provide a " + paramName + "!");
    return errorMessage;
  }
}
