package com.greenfoxacademy.restbackendfrontendexercise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendaRestController {


  @GetMapping("/appenda/{appendable}")
  public String getApendA(@PathVariable("appendable") String appendTo) {
    return appendTo + "a";
  }

}
