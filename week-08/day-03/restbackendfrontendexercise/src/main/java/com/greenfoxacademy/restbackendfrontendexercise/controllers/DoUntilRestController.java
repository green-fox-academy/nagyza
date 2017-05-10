package com.greenfoxacademy.restbackendfrontendexercise.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilRestController {

  @PostMapping("/dountil/{what}")
  public String doUntilNum(@PathVariable("what") String what) {
    return what;
  }
}
