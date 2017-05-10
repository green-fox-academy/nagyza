package com.greenfoxacademy.restbackendfrontendexercise.controllers;

import com.greenfoxacademy.restbackendfrontendexercise.model.AppendA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendaRestController {

  @Autowired
  AppendA appendA;

  @GetMapping("/appenda/{appendable}")
  public AppendA getAppendA(@PathVariable("appendable") String appendTo) {
    appendA.setAppended(appendTo);
    return appendA;
  }
}
