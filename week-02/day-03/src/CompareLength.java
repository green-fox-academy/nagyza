/**
 * Created by nagyza on 2017.03.22..
 */
public class CompareLength {
  public static void main(String[] args) {
    // - Create an array variable named `p1`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `p2`
    //   with the following content: `[4, 5]`
    // - Print if `p2` has more elements than `p1`

    int p1[] = {1, 2, 3};
    int p2[] = {4, 5};
    if (p2.length > p1.length) {
      System.out.println("p2 has more elements than p1 has.");
    } else {
      System.out.println("p2 has less or equal number of elements than p1 has.");
    }
  }
}
