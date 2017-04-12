
public class GameCharacter {
  int maxHealthPoint;
  int currentHealthPoint;
  int defendPoint;
  int strikePoint;
  int level;
  int dieRoll;
  int positionX;
  int positionY;
  String imageName;
  PositionedImage imageDraw;

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

  public int getPositionX() {
    return positionX;
  }

  public int getPositionY() {
    return positionY;
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

  PositionedImage getImageDraw() {
    return new PositionedImage(imageName, positionX, positionY);
  }

  int getDieRoll() {
    this.dieRoll = (int) (Math.random() * 6) + 1;
    return this.dieRoll;
  }
}