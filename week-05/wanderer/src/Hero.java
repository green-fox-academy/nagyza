
public class Hero {
  private int maxHealthPoint;
  private int currentHealthPoint;
  private int defendPoint;
  private int strikePoint;
  private int dieRoll;
  private int level;
  private int positionX;
  private int positionY;
  private String imageName;
  private PositionedImage imageDraw;

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

  public void moveUp(int[][] tilesOrder) {
    this.imageName = "assets/hero-up.png";
    this.whereToGo("up", tilesOrder);
  }

  public void moveDown(int[][] tilesOrder) {
    this.imageName = "assets/hero-down.png";
    this.whereToGo("down", tilesOrder);
  }

  public void moveLeft(int[][] tilesOrder) {
    this.imageName = "assets/hero-left.png";
    this.whereToGo("left", tilesOrder);
  }

  public void moveRight(int[][] tilesOrder) {
    this.imageName = "assets/hero-right.png";
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