package com.greenfox.endpointtesting.controllers;

import com.greenfox.endpointtesting.repository.FoodRepository;
import com.greenfox.endpointtesting.services.CalorieTable;
import com.greenfox.endpointtesting.services.ErrorMessage;
import com.greenfox.endpointtesting.services.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DraxController {

  @Autowired
  private CalorieTable calorieTable;

  @Autowired
  private FoodRepository foodRepository;

  @Autowired
  ErrorMessage errorMessage;

  @GetMapping("/drax")
  public CalorieTable getCalorieTable() {
    calorieTable.setAllFood(foodRepository.findAll());
    return calorieTable;
  }

  @PostMapping("/addfood")
  public Food addFoodToCalorieTable(@RequestBody Food food) {
    long indexOfFood = 0;
    for (Food f : foodRepository.findAll()) {
      if (f.getName().equals(food.getName())) {
        indexOfFood = f.getId();
      }
    }
    if (indexOfFood > 0) {
      Food foodToChange = foodRepository.findOne(indexOfFood);
      foodToChange.changeAmount(foodToChange.getAmount() + food.getAmount());
      foodRepository.save(foodToChange);
      return foodRepository.findOne(indexOfFood);
    } else {
      foodRepository.save(food);
      return food;
    }
  }

  @PutMapping("/update/{id}")
  public Food updateFoodById(@PathVariable long id, @RequestParam int amount) {
    Food f = foodRepository.findOne(id);
    f.changeAmount(amount);
    foodRepository.save(f);
    return f;
  }

  @DeleteMapping("/delete")
  public void deleteFoodById(@RequestParam long id) {
    foodRepository.delete(id);
  }

  @GetMapping("/querybyamount")
  public List<Food> queryGreaterByAmount(@RequestParam String smallerOrGreater, @RequestParam int amount) {
    if (smallerOrGreater.equals("g")) {
      return foodRepository.queryFoodByAmountGreaterThan(amount);
    } else if (smallerOrGreater.equals("s")){
      return foodRepository.queryFoodByAmountLessThan(amount);
    } else if (smallerOrGreater.equals("e")) {
      return foodRepository.queryFoodByAmountEquals(amount);
    }
    return foodRepository.queryFoodByAmountGreaterThan(0);
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage errorMessageSender(MissingServletRequestParameterException e) {
    String paramName = e.getParameterName();
    errorMessage.setError("Hello! Something wrong with the " + paramName + " parameter.");
    return errorMessage;
  }
}
