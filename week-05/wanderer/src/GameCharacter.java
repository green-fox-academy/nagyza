public class GameCharacter {
  int maxHealthPoint;
  int currentHealthPoint;
  int defendPoint;
  int strikePoint;
  int level;
  int positionX;
  int positionY;
  int strikeValue;
  String imageName;
  PositionedImage imageDraw;

  public int getStrikePoint() {
    return strikePoint;
  }

  public int getStrikeValue() {
    strikeValue = strikePoint * getDieRoll() * 2;
    return strikeValue;
  }

  public int getDefendPoint() {
    return defendPoint;
  }

  public int getCurrentHealthPoint() {
    return currentHealthPoint;
  }

  public void setCurrentHealthPoint(int currentHealthPoint) {
    this.currentHealthPoint = currentHealthPoint;
  }

  public void moveUp(int[][] tilesOrder) {
    whereToGo("up", tilesOrder);
  }

  public void moveDown(int[][] tilesOrder) {
    whereToGo("down", tilesOrder);
  }

  public void moveLeft(int[][] tilesOrder) {
    whereToGo("left", tilesOrder);
  }

  public void moveRight(int[][] tilesOrder) {
    whereToGo("right", tilesOrder);
  }

  public void setPositionX(int newX) {
    positionX = newX;
  }

  public void setPositionY(int newY) {
    positionY = newY;
  }

  public void whereToGo(String direction, int[][] tilesOrder) {
    if (direction.equals("up")) {
      if (positionY > 0 && tilesOrder[positionY - 1][positionX] != 1) {
        positionY -= 1;
      }
    } else if (direction.equals("down")) {
      if (positionY < 9 && tilesOrder[positionY + 1][positionX] != 1) {
        positionY += 1;
      }
    } else if (direction.equals("left")) {
      if (positionX > 0 && tilesOrder[positionY][positionX - 1] != 1) {
        positionX -= 1;
      }
    } else if (direction.equals("right")) {
      if (positionX < 9 && tilesOrder[positionY][positionX + 1] != 1) {
        positionX += 1;
      }
    }
  }

  public int getPositionX() {
    return positionX;
  }

  public int getPositionY() {
    return positionY;
  }

  PositionedImage getImageDraw() {
    return new PositionedImage(imageName, positionX, positionY);
  }

  int getDieRoll() {
    int dieRoll = (int) (Math.random() * 6) + 1;
    return dieRoll;
  }
}