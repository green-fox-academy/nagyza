/**
 * Created by nagyza on 2017.03.30..
 */
public class Counter {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and counts down from n.
    counter(999);
  }

  public static int counter(int input) {
    if (input == 1) {
      System.out.println(input);
      return 1;
    } else {
      System.out.println(input);
      return counter(input - 1);
    }
  }
}
