package main.java.music;

public abstract class Instrument {

  protected String name;

  public Instrument() {
  }

  public Instrument(String name) {
    this.name = name;
  }

  abstract void play();

}
