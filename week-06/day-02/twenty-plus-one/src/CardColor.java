
public enum CardColor {
  RED(0), BLACK(1);

  private int value;
  private static final int SIZE = values().length;

  CardColor(int value) {
    this.value = value;
  }

  public static CardColor getRandomColor() {
    return values()[(int) (Math.random() * SIZE)];
  }

  public int getValue() {
    return value;
  }
}
