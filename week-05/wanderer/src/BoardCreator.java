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
  private int monsterToKillIndex;
  private ArrayList<Monster> allMonsters;

  public BoardCreator() {
    allMonsters = new ArrayList<>();
    gameHero = new Hero();
    level = 1;
    fillAllMonsters();
  }

  public void fight() {
    Monster monsterToKill = allMonsters.get(monsterToKillIndex);
    int counter = 0;
    while (gameHero.currentHealthPoint > 0 && monsterToKill.currentHealthPoint > 0) {
      if (counter % 2 == 0) {
        monsterToKill.setCurrentHealthPoint(monsterToKill.getCurrentHealthPoint() - gameHero.getStrikeValue());
      } else {
        gameHero.setCurrentHealthPoint(gameHero.getCurrentHealthPoint() - monsterToKill.getStrikeValue());
      }
      counter++;
    }
    if (monsterToKill.currentHealthPoint < 0) {
      allMonsters.remove(monsterToKillIndex);
      gameHero.setLevel();
    } else {
      System.out.println("Game Over!");
    }
  }

  public Monster getMonsterToKill() { // only for test reasons
    return allMonsters.get(monsterToKillIndex);
  }

  public boolean isFightSituation(Hero hero) {
    int counter = 0;
    for (Monster monster : allMonsters) {
      if (!isNotOnMonstersPlace(hero, monster)) {
        counter++;
        monsterToKillIndex = allMonsters.indexOf(monster);
      }
    }
    if (counter > 0) {
      return true;
    } else {
      return false;
    }
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
          if (counter == 1) {
            createdMonster.setKeyTrue();
          }
        }
      }
      if (allMonsters.size() == counter) {
        allMonsters.add(createdMonster);
      }
    }
  }

  private boolean isNotOnMonstersPlace(GameCharacter actualCharacter, Monster createdMonster) {
    if (actualCharacter.getPositionX() != createdMonster.getPositionX()
            || actualCharacter.getPositionY() != createdMonster.getPositionY()) {
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
    Monster createdMonster = new Monster(randomCoord(), image, false);
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