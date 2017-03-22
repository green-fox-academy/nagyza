import java.lang.reflect.Array;

/**
 * Created by nagyza on 2017.03.22..
 */
public class DiagonalMatrix {
  public static void main(String[] args) {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    int twoDimensionalArray[][] = new int[4][4];
    for (int i = 0; i < 4; i++) {
      twoDimensionalArray[i][i] = 1;
    }
    System.out.println(twoDimensionalArray[2][1]);
  }
}
