/**
 * Created by nagyza on 2017.04.03..
 */
public class Sharpie {
  String color;
  double width;
  double inkAmount;

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
  }

  public Sharpie(double inkAmount) {
    this.inkAmount = 100.0;
  }

  public void use() {
    this.inkAmount -= 1;
  }

}
