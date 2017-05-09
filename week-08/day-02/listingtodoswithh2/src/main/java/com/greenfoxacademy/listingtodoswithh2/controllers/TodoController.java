package com.greenfoxacademy.listingtodoswithh2.controllers;

import com.greenfoxacademy.listingtodoswithh2.model.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping({"/", "/list"})
  @ResponseBody
  public String index(Model model) {
    return "index";
  }

  @RequestMapping("/todo")
  public String list(Model model) {
    return "index";
  }
}
