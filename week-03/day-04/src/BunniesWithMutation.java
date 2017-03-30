/**
 * Created by nagyza on 2017.03.30..
 */
public class BunniesWithMutation {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    System.out.println(bunniesEars(4));
  }

  public static int bunniesEars(int n) {
    if (n == 1) {
      return 2;
    } else {
      if (n % 2 == 1) {
        return 2 + bunniesEars(n - 1);
      } else {
        return 3 + bunniesEars(n - 1);
      }
    }
  }
}
