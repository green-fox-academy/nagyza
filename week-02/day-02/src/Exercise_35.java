/**
 * Created by nagyza on 2017.03.22..
 */
public class Exercise_35 {
  public static void main(String[] args) {
    // Crate a program that draws a chess table like this
    //
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    //
    for (int i =0; i < 8; i++) {
      if ((i % 2) == 0) {
        for (int j = 0; j < 8; j++) {
          if (((j % 2) == 0) && (j < 7)) {
            System.out.print("%");
          } else if (((j % 2) != 0) && (j < 7)) {
            System.out.print(" ");
          } else if (((j % 2) == 0) && (j == 7)) {
            System.out.println("%");
          } else {
            System.out.println(" ");
          }
        }
      } else {
        for (int k = 0; k < 8; k++) {
          if (((k % 2) == 0) && (k < 7)) {
            System.out.print(" ");
          } else if (((k % 2) != 0) && (k < 7)) {
            System.out.print("%");
          } else if (((k % 2) == 0) && (k == 7)) {
            System.out.println(" ");
          } else {
            System.out.println("%");
          }
        }
      }
    }
  }
}
