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
  private GameCharacter gameHeroCharacter;
  private int monsterToKillIndex;
  private ArrayList<Monster> allMonsters;

  public BoardCreator() {
    allMonsters = new ArrayList<>();
    gameHero = new Hero();
    gameHeroCharacter = gameHero;
    level = 1;
    fillAllMonsters();
  }

  public void fight() {
    Monster monsterToKill = allMonsters.get(monsterToKillIndex);
    int counter = 0;
    while (gameHero.currentHealthPoint > 0 && monsterToKill.currentHealthPoint > 0) {
      if (counter % 2 == 0) {
        if (gameHero.getStrikeValue() > monsterToKill.getDefendPoint()) {
          monsterToKill.setCurrentHealthPoint(monsterToKill.getCurrentHealthPoint() - gameHero.getStrikePoint());
        }
      } else {
        if (monsterToKill.getStrikeValue() > gameHero.getDefendPoint()) {
          gameHero.setCurrentHealthPoint((gameHero.getCurrentHealthPoint()) - (monsterToKill.getStrikePoint()));
        }
      }
      counter++;
    }
    if (monsterToKill.currentHealthPoint <= 0) {
      if (monsterToKill.isKey()) {
        for (int i = allMonsters.size() - 1; i > -1; i--) {
          allMonsters.remove(i);
        }
      } else {
        allMonsters.remove(monsterToKillIndex);
        gameHero.setLevel();
      }
    } else {
      gameHero.setImageName("assets/hero-dead.png");
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
      Monster createdMonster = createMonster("assets/skeleton.png");
      int counter = 0;
      for (Monster actualMonster : allMonsters) {
        if (isNotOnMonstersPlace(actualMonster, createdMonster)
                && isNotOnHerosPlace(createdMonster) && isNotOnWall(createdMonster)) {
          counter++;
          if (allMonsters.size() == 1) {
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

  private boolean isNotOnHerosPlace(Monster checkedMonster) {
    if (checkedMonster.getPositionX() != gameHeroCharacter.getPositionX()
            || checkedMonster.getPositionY() != gameHeroCharacter.getPositionY()) {
      return true;
    } else {
      return false;
    }
  }

  private boolean isNotOnWall(Monster checkedMonster) {
    if (tilesOrder[checkedMonster.getPositionY()][checkedMonster.getPositionX()] != 1) {
      return true;
    } else {
      return false;
    }
  }

  private Monster createMonster(String image) {
    return new Monster(randomCoord(), image);
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

  private int getRandomDirection() {
    int random = (int) (Math.random() * 2);
    if (random == 0) {
      return -1;
    } else {
      return 1;
    }
  }
}