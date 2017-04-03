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
    this.inkAmount = 100.0;
  }

  public String getColor() {
    return color;
  }

  public double getWidth() {
    return width;
  }

  public double getInkAmount() {
    return inkAmount;
  }

  public void use() {
    this.inkAmount -= 1;
  }

  @Override
  public String toString() {
    return  "color='" + color + '\'' +
            ", width=" + width +
            ", inkAmount=" + inkAmount +
            '}';
  }
}
