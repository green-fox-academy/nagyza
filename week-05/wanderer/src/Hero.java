
public class Hero extends GameCharacter {

  public Hero() {
    level = 1;
    maxHealthPoint = 20 + 3 * getDieRoll();
    currentHealthPoint = maxHealthPoint;
    defendPoint = 2 * getDieRoll();
    strikePoint = 5 + getDieRoll();
    imageName = "assets/hero-down.png";
    positionX = 0;
    positionY = 0;
    imageDraw = new PositionedImage(imageName, positionX, positionY);
  }

  @Override
  public void moveUp(int[][] tilesOrder) {
    imageName = "assets/hero-up.png";
    whereToGo("up", tilesOrder);
  }

  @Override
  public void moveDown(int[][] tilesOrder) {
    imageName = "assets/hero-down.png";
    whereToGo("down", tilesOrder);
  }

  @Override
  public void moveLeft(int[][] tilesOrder) {
    imageName = "assets/hero-left.png";
    whereToGo("left", tilesOrder);
  }

  @Override
  public void moveRight(int[][] tilesOrder) {
    imageName = "assets/hero-right.png";
    whereToGo("right", tilesOrder);
  }
}