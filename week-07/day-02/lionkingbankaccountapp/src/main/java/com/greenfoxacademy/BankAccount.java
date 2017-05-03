package com.greenfoxacademy;

public class BankAccount {
  private String name;
  private long balance;
  String animalType;
  boolean goodGuy;

  public BankAccount(String name, long balance, String animalType, boolean goodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.goodGuy = goodGuy;
  }

  public String getName() {
    return name;
  }

  public long getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean getIntention() {
    return goodGuy;
  }
}
