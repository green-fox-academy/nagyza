public class Monster extends GameCharacter {
  boolean key;

  public Monster(int[] positionXY, String image, boolean key) {
    positionX = positionXY[0];
    positionY = positionXY[1];
    imageName = image;
    level = 1;
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
      this.key = key;
    }
  }

  @Override
  public String toString() {
    return "M HP" + maxHealthPoint + ":" + currentHealthPoint + " DP" + defendPoint + " SP" + strikePoint;
  }

  public void setKeyTrue() {
    key = true;
  }
}
