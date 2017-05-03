package com.greenfoxacademy.springstart;

import java.awt.*;

public class Greets {
  public String greet;
  Color color;

  public Greets(String greet, Color color) {
    this.color = color;
    this.greet = greet;
  }

  public String getGreet() {
    return greet;
  }
}
