package com.greenfox.endpointtesting.services;

import org.springframework.stereotype.Service;

@Service
public class Arrow {

  private Double distance;
  private Double time;
  private Double speed;

  public Arrow() {
  }

  public Double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public Double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public Double getSpeed() {
    return this.distance / this.time;
  }
}
