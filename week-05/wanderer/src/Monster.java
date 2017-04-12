public class Monster extends GameCharacter {
  public Monster(int[] positionXY, String image) {
    positionX = positionXY[0];
    positionY = positionXY[1];
    imageName = image;
    level = 1;
    if (image.equals("assets/boss.png")) {
      maxHealthPoint = level * 2 * getDieRoll() + getDieRoll();
      currentHealthPoint = maxHealthPoint;
      defendPoint = (int) Math.ceil((double)level / 2 ) * getDieRoll() + (int)Math.ceil((double)getDieRoll() / 2);
      strikePoint = level * getDieRoll() + level;
    } else {
      maxHealthPoint = level * 2 * getDieRoll();
      currentHealthPoint = maxHealthPoint;
      defendPoint = (int) Math.ceil((double)level / 2 ) * getDieRoll();
      strikePoint = level * getDieRoll();
    }
  }
}
