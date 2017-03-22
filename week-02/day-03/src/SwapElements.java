import java.util.Arrays;

/**
 * Created by nagyza on 2017.03.22..
 */
public class SwapElements {
  public static void main(String[] args) {
    // - Create an array variable named `abc`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `abc`
    String abc[] = {"first", "second", "third"};
    String stringToSwap = abc[0];
    abc[0] = abc[2];
    abc[2] = stringToSwap;
    System.out.println(Arrays.toString(abc));
  }
}
