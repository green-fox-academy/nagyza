package com.greenfoxacademy.restbackendfrontendexercise.controllers;

import com.greenfoxacademy.restbackendfrontendexercise.model.DoUntil;
import com.greenfoxacademy.restbackendfrontendexercise.model.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilRestController {

  @Autowired
  DoUntil doUntil;

  @Autowired
  ErrorMessage errorMessage;

  @PostMapping("/dountil/{what}")
  public DoUntil doUntilNum(@PathVariable("what") String what, @RequestBody DoUntil until) {
    doUntil = until;
    doUntil.setWhat(what);
    return doUntil;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage errorMessageSender(Exception e) {
    errorMessage.setError("Please provide a number!");
    return errorMessage;
  }
}
