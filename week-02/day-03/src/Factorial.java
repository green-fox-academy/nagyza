/**
 * Created by nagyza on 2017.03.22..
 */
public class Factorial {
  public static void main(String[] args) {
    //  Create the usual class wrapper
    //  and main method on your own.
    // - Create a function called `factorio`
    //   that returns it's input's factorial
    System.out.println(Factorio(3));
  }

  public static int Factorio(int number) {
    int fakt = 1;
    for (int i = 0; i < number; i++) {
      fakt *= i + 1;
      System.out.println("i-" + (i + 1));
      System.out.println(fakt);
    }
    return fakt;
  }
}
