import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  List<Card> deckOfCards;

  public Deck() {
    this.deckOfCards = new ArrayList<>();
    for (CardSuit suit : CardSuit.values()) {
      for (CardRank rank : CardRank.values()) {
        deckOfCards.add(new Card(suit, rank));
      }
    }
  }

  public Deck(Card card1, Card card2) {
    this.deckOfCards = new ArrayList<>();
    this.deckOfCards.add(card1);
    this.deckOfCards.add(card2);
  }

  public void addCard(Card card) {
    this.deckOfCards.add(card);
  }

  public int getValueOfDeck() {
    int valueOfDeck = 0;
    for (Card card : deckOfCards) {
      valueOfDeck += card.getValueOfCard();
    }
    return valueOfDeck;
  }

  public int getSizeOfDeck() {
    return this.deckOfCards.size();
  }

  public Card getCardAtIndex(int index) {
    return deckOfCards.get(index);
  }

  public void shuffleDeck() {
    Collections.shuffle(this.deckOfCards);
  }

  public Card pullFirst() {
    Card cardToPull = deckOfCards.get(0);
    deckOfCards.remove(0);
    return cardToPull;
  }

  public Card pullLast() {
    Card cardToPull = deckOfCards.get(deckOfCards.size() - 1);
    deckOfCards.remove(deckOfCards.size() - 1);
    return cardToPull;
  }

  public Card pullRandom() {
    int indexToPull = (int)(Math.random() * deckOfCards.size());
    Card cardToPull = deckOfCards.get(indexToPull);
    deckOfCards.remove(indexToPull);
    return cardToPull;
  }

  @Override
  public String toString() {
    String cards = "";
    for (Card card : this.deckOfCards) {
      cards += card.toString();
    }
    return "There are " + this.getSizeOfDeck() + " cards in the deal. It's value: " + this.getValueOfDeck()
            + "\nThe following cards are in the deal: \n" + cards;
  }
}
