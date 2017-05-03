package com.greenfoxacademy;

public class BankAccount {
  private String name;
  private long balance;
  private String animalType;

  public BankAccount(String name, long balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
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
}
