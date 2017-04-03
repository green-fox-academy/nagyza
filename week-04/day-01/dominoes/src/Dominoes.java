import java.util.ArrayList;
import java.util.List;

/**
 * Created by nagyza on 2017.04.03..
 */
public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    initializeDominoes();
    System.out.println(dominoes);
    System.out.println(sortDominoes(initializeDominoes()));
  }

  public static List<Domino> sortDominoes(List<Domino> dominoes) {
    for (int j = 1; j < dominoes.size(); j++) {
      for (int i = 1; i < dominoes.size(); i++) {
        if (dominoes.get(i - 1).getValues()[1] != dominoes.get(i).getValues()[0]) {
          Domino keepDomino = dominoes.get(i);
          dominoes.remove(i);
          dominoes.add(keepDomino);
        }
      }
    }
    return dominoes;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
