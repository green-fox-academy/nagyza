import java.util.Arrays;

/**
 * Created by nagyza on 2017.03.22..
 */
public class Reverse {
  public static void main(String[] args) {
    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`
    int aj[] = {3, 4, 5, 6, 7};
    int temporaryContainer[] = new int[aj.length];
    int counterBack = aj.length;
    for (int i = 0; i < aj.length; i++) {
      temporaryContainer[i] = aj[(counterBack - 1)];
      counterBack--;
    }
    counterBack = aj.length;
    for (int j = 0; j < aj.length; j++) {
      aj[j] = temporaryContainer[j];
      counterBack--;
    }
    System.out.println("Backward: " + Arrays.toString(aj));
  }
}
