
public class GameCharacter {
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

  public GameCharacter(String type, int level, int positionX, int positionY) {
    this.type = type;
    this.level = level;
    if (this.type.equals("hero")) {
      this.maxHealthPoint = 20 + 3 * getDieRoll();
      this.currentHealthPoint = this.maxHealthPoint;
      this.defendPoint = 2 * getDieRoll();
      this.strikePoint = 5 + getDieRoll();
      this.imageName = "assets/hero-down.png";
      this.positionX = positionX;
      this.positionY = positionY;
      this.imageDraw = new PositionedImage(this.imageName, this.positionX, this.positionY);
    } else if (this.type.equals("monster")) {
      this.maxHealthPoint = 2 * this.level * getDieRoll();
      this.currentHealthPoint = this.maxHealthPoint;
      this.defendPoint = this.level * getDieRoll(); // todo It isn't definitive
      this.strikePoint = this.level + getDieRoll();
    } // todo create a boss
  }

  public void turnLeft() {
    this.imageName = "assets/hero-left.png";
  }

  public void turnRight() {
    this.imageName = "assets/hero-right.png";
  }

  public void turnUp() {
    this.imageName = "assets/hero-up.png";
  }

  public void turnDown() {
    this.imageName = "assets/hero-down.png";
  }

  public void setPosition(int posX, int posY) {
    this.positionX = posX;
    this.positionY = posY;
  }

  PositionedImage getImageDraw() {
    return new PositionedImage(this.imageName, this.positionX, this.positionY);
  }

  int getDieRoll() {
    this.dieRoll = (int) (Math.random() * 6) + 1;
    return this.dieRoll;
  }
}