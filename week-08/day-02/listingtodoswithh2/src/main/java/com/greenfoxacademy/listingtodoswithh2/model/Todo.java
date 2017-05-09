package com.greenfoxacademy.listingtodoswithh2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TODOS")
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

  public Todo() {
  }


}
