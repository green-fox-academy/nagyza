import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BoardCreator {
  private int[][] tilesOrder = new int[10][10];
  int level;
  private Hero gameHero;
  private GameCharacter gameHeroCharacter;
  private int monsterToKillIndex;
  private ArrayList<Monster> allMonsters;
  List<GameCharacter> gameBoard;

  public BoardCreator() {
    allMonsters = new ArrayList<>();
    gameHero = new Hero();
    gameHeroCharacter = gameHero;
    level = 1;
    fillTilesOrder();
    fillAllMonsters();
  }

  public BoardCreator(Hero hero, int level) {
    allMonsters = new ArrayList<>();
    gameHero = hero;
    gameHeroCharacter = gameHero;
    this.level = level;
    fillTilesOrder();
    fillAllMonsters();
  }

  void fillTilesOrder() {
    List<String> allLines = readFile("assets/board-level" + level + ".csv");
    for (int i = 0; i < 10; i++) {
      String line[] = allLines.get(i).split(";");
      for (int j = 0; j < 10; j++) {
        tilesOrder[i][j] = Integer.parseInt(line[j]);
      }
    }
    System.out.println("lev:" + level);
  }

  List<String> readFile(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Something wrong with the files wich contain  maps for the game!");
    }
    return lines;
  }

  public void moveMonsters() {
    for (Monster actualMonster : allMonsters) {
      int actualX = actualMonster.getPositionX();
      int actualY = actualMonster.getPositionY();
      Monster movedMonster = new Monster(actualX, actualY);
      do {
        movedMonster.setPositionX(actualX);
        movedMonster.setPositionY(actualY);
        int direction = getRandomDirection();
        if (direction == 0) {
          movedMonster.moveUp(tilesOrder);
        } else if (direction == 1) {
          movedMonster.moveDown(tilesOrder);
        } else if (direction == 2) {
          movedMonster.moveRight(tilesOrder);
        } else if (direction == 3) {
          movedMonster.moveLeft(tilesOrder);
        }
      } while (!isNotOnMonstersPlace(movedMonster) || (actualX == movedMonster.getPositionX() && actualY == movedMonster.getPositionY()));
      actualMonster.setPositionX(movedMonster.getPositionX());
      actualMonster.setPositionY(movedMonster.getPositionY());
    }
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
        gameHero.incLevel();
      }
    } else {
      gameHero.setImageName("assets/hero-dead.png");
    }
  }

  public boolean isNotOnMonstersPlace(GameCharacter checkedCharacter) {
    int counter = 0;
    for (Monster actual : allMonsters) {
      if (actual.getPositionX() == checkedCharacter.getPositionX() && actual.getPositionY() == checkedCharacter.getPositionY()) {
        monsterToKillIndex = allMonsters.indexOf(actual);
        counter++;
      }
    }
    if (counter > 0) {
      return false;
    } else {
      return true;
    }
  }

  public String getMonsterToKillIndex() {
    return String.valueOf(monsterToKillIndex);
  }

  private void fillAllMonsters() {
    while (allMonsters.isEmpty()) {
      Monster createdMonster = createMonster("assets/boss.png");
      if (isNotOnHerosPlace(createdMonster) && isNotOnWall(createdMonster)) {
        allMonsters.add(createdMonster);
      }
    }
    while (allMonsters.size() < 4) {
      Monster createdMonster = createMonster("assets/skeleton.png");
      if (isNotOnMonstersPlace(createdMonster) && isNotOnHerosPlace(createdMonster) && isNotOnWall(createdMonster)) {
        if (allMonsters.size() == 1) {
          createdMonster.setKeyTrue();
        }
        allMonsters.add(createdMonster);
      }
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
    return new Monster(randomCoord(), image, level);
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
    return (int) (Math.random() * 4);
  }
}