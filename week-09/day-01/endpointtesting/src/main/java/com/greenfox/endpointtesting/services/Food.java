package com.greenfox.endpointtesting.services;

import javax.persistence.*;

@Entity
@Table(name = "pantry")
public class Food {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "foodid")
  private long id;

  private String name;
  private int amount;
  private double calorie;

  public Food() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public void setCalorie(double calorie) {
    this.calorie = calorie;
  }

  public void changeAmount(int amount) {
    int oldAmount = this.amount;
    this.amount = amount;
    int amountDifference = this.amount - oldAmount;
    changeCalorie(amountDifference, oldAmount);
  }

  public double getCalorie() {
    return calorie;
  }

  public void changeCalorie(int amountDifference, int oldAmount) {
    double calorieByPiece = this.calorie / oldAmount;
    this.calorie += amountDifference * calorieByPiece;
  }
}
