package com.greenfox.endpointtesting.controllers;

import com.greenfox.endpointtesting.repository.DraxRepository;
import com.greenfox.endpointtesting.services.CalorieTable;
import com.greenfox.endpointtesting.services.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DraxController {

  @Autowired
  CalorieTable calorieTable;

  @Autowired
  Food food;

  @Autowired
  DraxRepository draxRepository;

  @GetMapping("/drax")
  public CalorieTable getCalorieTable() {
    calorieTable.setAllFood(draxRepository.findAll());
    return calorieTable;
  }



}
