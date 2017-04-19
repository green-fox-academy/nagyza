import java.util.ArrayList;
import java.util.List;

public class Deck {
  List<Card> deckOfCards;

  public Deck() {
    deckOfCards = new ArrayList<>();
    for (CardSuit suit : CardSuit.values()) {
      for (CardRank rank : CardRank.values()) {
        deckOfCards.add(new Card(suit, rank));
      }
    }
  }

  public Card getCardAtIndex(int index) {
    return deckOfCards.get(index);
  }
}
