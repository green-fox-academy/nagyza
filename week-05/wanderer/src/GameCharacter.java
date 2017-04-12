
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
    this.whereToGo("up", tilesOrder);
  }

  public void moveDown(int[][] tilesOrder) {
    this.whereToGo("down", tilesOrder);
  }

  public void moveLeft(int[][] tilesOrder) {
    this.whereToGo("left", tilesOrder);
  }

  public void moveRight(int[][] tilesOrder) {
    this.whereToGo("right", tilesOrder);
  }


  public void whereToGo(String direction, int[][] tilesOrder) {
    if (direction.equals("up")) {
      if (this.positionY > 0 && tilesOrder[positionY - 1][positionX] != 1) {
        this.positionY -= 1;
      }
    } else if (direction.equals("down")) {
      if (this.positionY < 9 && tilesOrder[positionY + 1][positionX] != 1) {
        this.positionY += 1;
      }
    } else if (direction.equals("left")) {
      if (this.positionX > 0 && tilesOrder[positionY][positionX - 1] != 1) {
        this.positionX -= 1;
      }
    } else if (direction.equals("right")) {
      if (this.positionX < 9 && tilesOrder[positionY][positionX + 1] != 1) {
        this.positionX += 1;
      }
    }
  }

  PositionedImage getImageDraw() {
    return new PositionedImage(this.imageName, this.positionX, this.positionY);
  }

  int getDieRoll() {
    this.dieRoll = (int) (Math.random() * 6) + 1;
    return this.dieRoll;
  }
}