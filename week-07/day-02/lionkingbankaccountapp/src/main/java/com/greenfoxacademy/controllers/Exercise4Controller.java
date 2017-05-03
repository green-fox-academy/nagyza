package com.greenfoxacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercise4Controller {

  @RequestMapping("/exercise4")
  public String exercise4(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "exercise4";
  }
}
