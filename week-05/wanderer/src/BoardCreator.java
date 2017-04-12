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
    this.allMonsters = new ArrayList<>();
    gameHero = new Hero();
    this.level = 1;
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