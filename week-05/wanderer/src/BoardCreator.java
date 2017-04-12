import java.util.ArrayList;

public class BoardCreator {

  private int[][] tilesOrder = {{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
          {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
          {0, 1, 0, 1, 0, 1, 1, 0, 0, 0},
          {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
          {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
          {0, 0, 0, 1, 0, 1, 1, 0, 1, 0}};
  int level;
  private Hero gameHero;
  private Monster skeleton1;
  private Monster skeleton2;
  private Monster skeleton3;
  private Monster boss;
  private ArrayList<Monster> allMonsters;

  public BoardCreator() {
    allMonsters = new ArrayList<>();
    gameHero = new Hero();
    level = 1;
  }

  private void fillAllMonsters() {
    for (int i = 0; i < 3; i++) {

    }
  }

  private Monster createMonster() {
    Monster actualMonster = new Monster(randomCoord());
    return actualMonster;
  }

  private int[] randomCoord() {
    int[] place = {(int) (Math.random() * 9) + 1, (int) (Math.random() * 9) + 1};
    return place;
  }

  public Hero getGameHero() {
    return gameHero;
  }

  public int[][] getTilesOrder() {
    return tilesOrder;
  }
}