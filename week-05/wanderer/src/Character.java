
public class Character {
  private int maxHealthPoint;
  private int currentHealthPoint;
  private int defendPoint;
  private int strikePoint;
  private int dieRoll;

  int getDieRoll() {
    this.dieRoll = (int) (Math.random() * 6) + 1;
    return this.dieRoll;
  }
}
