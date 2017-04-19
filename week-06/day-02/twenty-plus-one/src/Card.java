
public class Card {

  CardColor color;
  CardSuit suit;
  CardRank rank;

  public Card() {
    this.color = CardColor.getRandomColor();
    this.suit = CardSuit.getRandomSuite();
    this.rank = CardRank.getRandomRank();
  }

  public Card(CardColor color, CardSuit suit, CardRank rank) {
    this.color = color;
    this.suit = suit;
    this.rank = rank;
  }

  @Override
  public String toString() {
    return "Rank " + this.rank + ", Value " + this.rank.getValue();
  }
}
