package com.greenfox.endpointtesting.services;

public class Food {

  private String name;
  private int amount;
  private double calorie;

  public Food() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public double getCalorie() {
    return calorie;
  }

  public void setCalorie(double calorie) {
    this.calorie = calorie;
  }
}
