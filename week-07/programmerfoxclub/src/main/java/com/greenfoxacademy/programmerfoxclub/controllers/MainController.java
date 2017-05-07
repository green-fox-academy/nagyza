package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("fox", fox);
    return "index";
  }

  @RequestMapping("/nutrition_store")
  public String nutritionStore(Model model) {
    model.addAttribute("fox", fox);
    return "nutrition_store";
  }

  @RequestMapping("/changefood")
  public String changeFood(@RequestParam("food") String food, @RequestParam("drink") String drink) throws Exception {
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:/";
  }

  @RequestMapping("/trick_center")
  public String trickCenter(Model model) {
    model.addAttribute("fox", fox);
    return "trick_center";
  }
}
