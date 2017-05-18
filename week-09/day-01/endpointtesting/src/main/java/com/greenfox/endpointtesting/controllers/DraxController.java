package com.greenfox.endpointtesting.controllers;

import com.greenfox.endpointtesting.repository.DraxRepository;
import com.greenfox.endpointtesting.services.CalorieTable;
import com.greenfox.endpointtesting.services.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DraxController {

  @Autowired
  private CalorieTable calorieTable;

  @Autowired
  private DraxRepository draxRepository;

  @GetMapping("/drax")
  public CalorieTable getCalorieTable() {
    calorieTable.setAllFood(draxRepository.findAll());
    return calorieTable;
  }

  @PostMapping("/addfood")
  public Food addFoodToCalorieTable(@RequestBody Food food) {
    long indexOfFood = 0;
    for (Food f : draxRepository.findAll()) {
      if (f.getName().equals(food.getName())) {
        indexOfFood = f.getId();
      }
    }
    if (indexOfFood > 0) {
      Food foodToChange = draxRepository.findOne(indexOfFood);
      foodToChange.changeAmount(foodToChange.getAmount() + food.getAmount());
      draxRepository.save(foodToChange);
      return draxRepository.findOne(indexOfFood);
    } else {
      draxRepository.save(food);
      return food;
    }
  }

  @PutMapping("/update/{id}")
  public Food updateFoodById(@PathVariable long id, @RequestParam int amount) {
    Food f = draxRepository.findOne(id);
    f.changeAmount(amount);
    draxRepository.save(f);
    return f;
  }

  @DeleteMapping("/delete")
  public void deleteFoodById(@RequestParam long id) {
    draxRepository.delete(id);
  }
}
