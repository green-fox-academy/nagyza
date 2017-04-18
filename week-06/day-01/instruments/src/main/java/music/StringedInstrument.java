package main.java.music;

public abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";
}
