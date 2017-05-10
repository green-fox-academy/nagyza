package com.greenfoxacademy.restbackendfrontendexercise.model;

import org.springframework.stereotype.Service;

@Service
public class Greeter {
  private String name;
  private String title;
  private String welcome_message;

  public String getWelcome_message() {
    this.welcome_message = "Oh, hi there " + this.name + ", my dear " + this.title + "!";
    return welcome_message;
  }

  public Greeter() {
  }

  public Greeter(String name, String title) {
    this.name = name;
    this.title = title;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
