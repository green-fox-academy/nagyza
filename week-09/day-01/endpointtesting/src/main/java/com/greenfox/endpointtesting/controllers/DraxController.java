package com.greenfox.endpointtesting.controllers;

import com.greenfox.endpointtesting.repository.DraxRepository;
import com.greenfox.endpointtesting.services.CalorieTable;
import com.greenfox.endpointtesting.services.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/addfood")
  public Food addFoodToCalorieTable(@RequestBody Food food) {
    this.food = food;
    draxRepository.save(this.food);
    return this.food;
  }

  @PutMapping("/update/{id}")
  public Food updateFoodById(@PathVariable long id, @RequestParam int amount) {
    Food f = draxRepository.findOne(id);
    f.setAmount(amount);
    draxRepository.save(f);
    return f;
  }

  @DeleteMapping("/delete")
  public void deleteFoodById(@RequestParam long id) {
    draxRepository.delete(id);
  }
}
