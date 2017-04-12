
public class Hero {
  private int maxHealthPoint;
  private int currentHealthPoint;
  private int defendPoint;
  private int strikePoint;
  private int dieRoll;
  private String type;
  private int level;
  private int positionX;
  private int positionY;
  private String imageName;
  private PositionedImage imageDraw;
  private BoardCreator board;

  public Hero(int level) {
    this.level = level;
    this.maxHealthPoint = 20 + 3 * getDieRoll();
    this.currentHealthPoint = this.maxHealthPoint;
    this.defendPoint = 2 * getDieRoll();
    this.strikePoint = 5 + getDieRoll();
    this.imageName = "assets/hero-down.png";
    this.positionX = 0;
    this.positionY = 0;
    this.imageDraw = new PositionedImage(this.imageName, this.positionX, this.positionY);
  }

  public void whereToGo(String direction, int[][] tilesOrder) {
    if (direction.equals("up")) {
      this.imageName = "assets/hero-up.png";
      if (this.positionY > 0 && tilesOrder[positionY - 1][positionX] != 1) {
        this.positionY -= 1;
      }
    } else if (direction.equals("down")) {
      this.imageName = "assets/hero-down.png";
      if (this.positionY < 9 && tilesOrder[positionY + 1][positionX] != 1) {
        this.positionY += 1;
      }
    } else if (direction.equals("left")) {
      this.imageName = "assets/hero-left.png";
      if (this.positionX > 0 && tilesOrder[positionY][positionX - 1] != 1) {
        this.positionX -= 1;
      }
    } else if (direction.equals("right")) {
      this.imageName = "assets/hero-right.png";
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