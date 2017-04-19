import java.util.Scanner;

public class Game {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    Deck deck = new Deck();
    Deck cardsHouseHas = new Deck(deck.pullRandom(), deck.pullRandom());
    Deck cardsPlayerHas = new Deck(deck.pullRandom(), deck.pullRandom());
    while (cardsHouseHas.getValueOfDeck() < 17) {
      cardsHouseHas.addCard(deck.pullRandom());
    }
    System.out.println(cardsPlayerHas);
    while (getAnswer()) {
      Card pullCard = deck.pullRandom();
      cardsPlayerHas.addCard(pullCard);
      System.out.println("You got a " + pullCard.toString());
      message("Your hand is now: ", cardsPlayerHas);
      if (cardsPlayerHas.getValueOfDeck() > 21) {
        System.out.println("You busted!");
        return;
      }
    }
    if (cardsHouseHas.getValueOfDeck() > 21) {
      finalMessage(cardsPlayerHas, cardsHouseHas);
      System.out.println("You win! Dealer busted.");
    } else if (cardsPlayerHas.getValueOfDeck() > cardsHouseHas.getValueOfDeck()) {
      finalMessage(cardsPlayerHas, cardsHouseHas);
      System.out.println("You win!");
    } else if (cardsPlayerHas.getValueOfDeck() == cardsHouseHas.getValueOfDeck()) {
      finalMessage(cardsPlayerHas, cardsHouseHas);
      System.out.println("It's push.");
    }
  }

  public static boolean getAnswer() {
    System.out.println("Do you hit?");
    String answer = scanner.next();
    if (answer.equals("y") || answer.equals("Y")) {
      return true;
    } else {
      return false;
    }
  }

  public static void message(String text, Deck deck) {
    System.out.println(text+ " " + deck);
  }

  public static void finalMessage(Deck playerDeck, Deck houseDeck) {
    message("You have: ", playerDeck);
    message("Dealer has: ", houseDeck);
  }
}
