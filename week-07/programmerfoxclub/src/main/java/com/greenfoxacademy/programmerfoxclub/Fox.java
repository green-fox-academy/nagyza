package com.greenfoxacademy.programmerfoxclub;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@Setter
public class Fox {
  public String name;
  public String food;
  public String drink;
  public List<String> tricks = new ArrayList<>();

  public void addTrick(String trick) {
    tricks.add(trick);
  }
}
