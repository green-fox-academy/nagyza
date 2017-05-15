package com.greenfox.endpointtesting.services;

import org.springframework.stereotype.Service;

@Service
public class Arrow {

  private double distance;
  private double time;
  private double speed;

  public Arrow() {
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public double getSpeed() {
    return this.distance / this.time;
  }
}
