package com.greenfox.endpointtesting.services;

import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@Table(name = "food_data")
@Service
public class FoodData {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private int priceOfPiece;
  private long foodId;

  public FoodData() {
  }

  public long getId() {
    return id;
  }

  public int getPriceOfPiece() {
    return priceOfPiece;
  }

  public void setPriceOfPiece(int priceOfPiece) {
    this.priceOfPiece = priceOfPiece;
  }

  public long getFoodId() {
    return foodId;
  }

  public void setFoodId(long foodId) {
    this.foodId = foodId;
  }
}
