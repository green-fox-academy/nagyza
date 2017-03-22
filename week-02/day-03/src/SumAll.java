/**
 * Created by nagyza on 2017.03.22..
 */
public class SumAll {
  public static void main(String[] args) {
    // - Create an array variable named `ai`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Print the sum of the elements in `ai`
    int ai[] = {3, 4, 5, 6, 7};
    int sumAll = 0;
    for (int elem : ai) {
      sumAll += elem;
    }
    System.out.println(sumAll);
  }
}
