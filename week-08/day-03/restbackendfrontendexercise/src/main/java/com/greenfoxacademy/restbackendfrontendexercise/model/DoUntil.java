package com.greenfoxacademy.restbackendfrontendexercise.model;

import org.springframework.stereotype.Service;

@Service
public class DoUntil {

  private int until;
  private int result;
  private String what;

  public DoUntil() {
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    if (what.equals("sum")) {
      return summary(this.until);
    } else {
      return factorial(this.until);
    }
  }

  private int summary(int until) {
    for (int i = 0; i < until; i++) {
      this.result += i + 1;
    }
    return this.result;
  }

  private int factorial(int until) {
    this.result = 1;
    for (int i = 0; i < until; i++) {
      this.result *= (i + 1);
    }
    return this.result;
  }
}
