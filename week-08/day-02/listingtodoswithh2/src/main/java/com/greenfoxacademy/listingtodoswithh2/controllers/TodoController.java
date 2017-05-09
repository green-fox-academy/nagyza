package com.greenfoxacademy.listingtodoswithh2.controllers;

import com.greenfoxacademy.listingtodoswithh2.model.Todo;
import com.greenfoxacademy.listingtodoswithh2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping({"/", "/list"})
  public String index(Model model) {
    return "index";
  }

  @RequestMapping("/todo")
  public String list(Model model) {
    model.addAttribute("notes", todoRepository.findAll());
    return "todo";
  }

  @RequestMapping("/addTodo")
  public String addTodo(Model model, @RequestParam("title") String param) {
    todoRepository.save(new Todo(param));
    model.addAttribute("notes", todoRepository.findAll());
    return "redirect:/todo";
  }
}
