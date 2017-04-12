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
    fillAllMonsters();
  }

  private void fillAllMonsters() {
    while (allMonsters.isEmpty()) {
      Monster createdMonster = createMonster("assets/boss.png");
      if (allMonsters.isEmpty() && isNotOnHerosPlace(createdMonster) && isNotOnWall(createdMonster)) {
        allMonsters.add(createdMonster);
      }
    }
    while (allMonsters.size() < 4) {
      int counter = 0;
      Monster createdMonster = createMonster("assets/skeleton.png");
      for (Monster actualMonster : allMonsters) {
        if (isNotOnMonstersPlace(actualMonster, createdMonster)
                && isNotOnHerosPlace(createdMonster) && isNotOnWall(createdMonster)) {
          counter++;
        }
      }
      if (allMonsters.size() == counter) {
        allMonsters.add(createdMonster);
      }
    }
  }

  private boolean isNotOnMonstersPlace(Monster actualMonster, Monster createdMonster) {
    if (actualMonster.getPositionX() != createdMonster.getPositionX()
            || actualMonster.getPositionY() != createdMonster.getPositionY()) {
      return true;
    } else {
      return false;
    }
  }

  private boolean isNotOnHerosPlace(Monster createdMonster) {
    if (createdMonster.getPositionX() != gameHero.getPositionX()
            || createdMonster.getPositionY() != gameHero.getPositionY()) {
      return true;
    } else {
      return false;
    }
  }

  private boolean isNotOnWall(Monster createdMonster) {
    if (tilesOrder[createdMonster.getPositionY()][createdMonster.getPositionX()] != 1) {
      return true;
    } else {
      return false;
    }
  }

  private Monster createMonster(String image) {
    Monster createdMonster = new Monster(randomCoord(), image);
    return createdMonster;
  }

  private int[] randomCoord() {
    int[] place = {(int) (Math.random() * 9) + 1, (int) (Math.random() * 9) + 1};
    return place;
  }

  public ArrayList<Monster> getAllMonsters() {
    return allMonsters;
  }

  public Hero getGameHero() {
    return gameHero;
  }

  public int[][] getTilesOrder() {
    return tilesOrder;
  }
}