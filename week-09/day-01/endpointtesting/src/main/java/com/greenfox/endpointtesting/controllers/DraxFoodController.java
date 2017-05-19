package com.greenfox.endpointtesting.controllers;

import com.greenfox.endpointtesting.repository.FoodDataRepository;
import com.greenfox.endpointtesting.repository.FoodRepository;
import com.greenfox.endpointtesting.services.ErrorMessage;
import com.greenfox.endpointtesting.services.FoodData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DraxFoodController {

  @Autowired
  private FoodRepository foodRepository;

  @Autowired
  private FoodDataRepository foodDataRepository;

  @Autowired
  ErrorMessage errorMessage;

  @PostMapping("/addfooddata")
  public FoodData addFoodData(@RequestBody FoodData foodData) {
    foodDataRepository.save(foodData);
    return foodData;
  }
}
