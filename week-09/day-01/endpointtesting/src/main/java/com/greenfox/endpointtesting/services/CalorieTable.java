package com.greenfox.endpointtesting.services;

import org.springframework.stereotype.Service;

@Service
public class CalorieTable {

  private Iterable<Food> allFood;

  public CalorieTable() {
  }

  public Iterable<Food> getAllFood() {
    return allFood;
  }

  public void setAllFood(Iterable<Food> allFood) {
    this.allFood = allFood;
  }
}
