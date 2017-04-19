
public enum  CardSuit {
  CLUBS(0), DIAMONDS(1), HEARTS(2), SPADES(3);

  private int value;
  private static final int SIZE = values().length;

  CardSuit(int value) {
    this.value = value;
  }

  public static CardSuit getRandomSuite() {
    return values()[(int) (Math.random() * SIZE)];
  }

  public int getValue() {
    return value;
  }
}
