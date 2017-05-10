package com.greenfoxacademy.restbackendfrontendexercise.controllers;

import com.greenfoxacademy.restbackendfrontendexercise.model.DoUntil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilRestController {

  @Autowired
  DoUntil doUntil;

  @PostMapping("/dountil/{what}")
  public DoUntil doUntilNum(@PathVariable("what") String what, @RequestBody DoUntil until) {
    doUntil = until;
    doUntil.setWhat(what);
    return doUntil;
  }
}
