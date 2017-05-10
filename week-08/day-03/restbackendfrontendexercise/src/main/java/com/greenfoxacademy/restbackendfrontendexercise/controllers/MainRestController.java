package com.greenfoxacademy.restbackendfrontendexercise.controllers;

import com.greenfoxacademy.restbackendfrontendexercise.model.Doubling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired
  Doubling doubling;

  @GetMapping("/doubling")
  public Doubling doubler(@RequestParam(value = "input") int input) {
    doubling.setReceived(input);
    return doubling;
  }

}
