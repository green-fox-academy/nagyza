package com.greenfoxacademy.controllers;

import com.greenfoxacademy.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Exercise5Controller {

  @RequestMapping("/exercise5")
  public String exercise5(Model model) {
    ArrayList<BankAccount> accounts = new ArrayList<>();
    accounts.add(new BankAccount("Rex", 4000, "dog"));
    accounts.add(new BankAccount("Lampas", 300, "cattle"));
    accounts.add(new BankAccount("Cirmi", 1200, "cat"));
    accounts.add(new BankAccount("Sanyi", 100, "horse"));
    model.addAttribute("accounts", accounts);
    return "exercise5";
  }
}
