public class Monster extends GameCharacter {
  boolean key;

  public Monster(int[] positionXY, String image, int level) {
    positionX = positionXY[0];
    positionY = positionXY[1];
    imageName = image;
    this.level = level;
    if (image.equals("assets/boss.png")) {
      maxHealthPoint = level * 2 * getDieRoll() + getDieRoll();
      currentHealthPoint = maxHealthPoint;
      defendPoint = (int) Math.ceil((double)level / 2 ) * getDieRoll() + (int)Math.ceil((double)getDieRoll() / 2);
      strikePoint = level * getDieRoll() + level;
      key = false;
    } else {
      maxHealthPoint = level * 2 * getDieRoll();
      currentHealthPoint = maxHealthPoint;
      defendPoint = (int) Math.ceil((double)level / 2 ) * getDieRoll();
      strikePoint = level * getDieRoll();
      key = false;
    }
  }

  public Monster(int positionX, int positionY) {
    this.positionX = positionX;
    this.positionY = positionY;
  }

  public void setKeyTrue() {
    key = true;
    imageName = "assets/skeletonKey.png";
  }

  public boolean isKey() {
    return key;
  }

  @Override
  public String toString() {
    return imageName.substring(7, 10) + ":" + maxHealthPoint + ":" + currentHealthPoint + " DP" + defendPoint + " SP" + strikePoint
            + "x" + getPositionX() + "y" + getPositionY();
  }
}
