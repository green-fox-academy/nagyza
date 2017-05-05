package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping("/")
  public String index(Model model) {
    fox.setName("Karak");
    fox.setFood("tas");
    fox.setDrink("blood");
    fox.addTrick("Lick his ...");
    model.addAttribute("fox", fox);
    return "index";
  }

  @RequestMapping("/nutrition_store")
  public String nutritionStore() {
    return "nutrition_store";
  }
}
