
public enum CardColor {
  RED(0), BLACK(1);

  private int value;
  private static final int SIZE = values().length;

  CardColor(int value) {
    this.value = value;
  }
}
