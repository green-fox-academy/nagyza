import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by nagyza on 2017.03.22..
 */
public class Colors {
  public static void main(String[] args) {
    // - Create a two dimensional array
    //   which can contain the different shades of specified colors
    // - In `colors[0]` store the shades of green:
    //   `"lime", "forest green", "olive", "pale green", "spring green"`
    // - In `colors[1]` store the shades of red:
    //   `"orange red", "red", "tomato"`
    // - In `colors[2]` store the shades of pink:
    //   `"orchid", "violet", "pink", "hot pink"`

    /* The for loop was not part of the exercise
    but it make sense to print out to check it
    after all.*/

    String colors[][] = {{"lime", "forest green", "olive", "pale green", "spring green"},{"orange red", "red", "tomato"},{"orchid", "violet", "pink", "hot pink"}};
    for (String row[] : colors) {
      System.out.println("");
      System.out.print("|");
      for (String col : row) {
        System.out.print(col + "|");
      }
    }
  }
}
