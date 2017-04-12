
public class Hero extends GameCharacter {

  public Hero() {
    this.level = 1;
    this.maxHealthPoint = 20 + 3 * getDieRoll();
    this.currentHealthPoint = this.maxHealthPoint;
    this.defendPoint = 2 * getDieRoll();
    this.strikePoint = 5 + getDieRoll();
    this.imageName = "assets/hero-down.png";
    this.positionX = 0;
    this.positionY = 0;
    this.imageDraw = new PositionedImage(this.imageName, this.positionX, this.positionY);
  }

  @Override
  public void moveUp(int[][] tilesOrder) {
    this.imageName = "assets/hero-up.png";
    this.whereToGo("up", tilesOrder);
  }

  @Override
  public void moveDown(int[][] tilesOrder) {
    this.imageName = "assets/hero-down.png";
    this.whereToGo("down", tilesOrder);
  }

  @Override
  public void moveLeft(int[][] tilesOrder) {
    this.imageName = "assets/hero-left.png";
    this.whereToGo("left", tilesOrder);
  }

  @Override
  public void moveRight(int[][] tilesOrder) {
    this.imageName = "assets/hero-right.png";
    this.whereToGo("right", tilesOrder);
  }
}