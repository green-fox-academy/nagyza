/**
 * Created by nagyza on 2017.03.23..
 */
public class Exercise_01 {
  public static void main(String[] args) {
    String example = "In a dishwasher far far away";
    // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
    // Please fix it for me!
    // Expected ouput: In a galaxy far far away

    // example.replace("dishwasher", "galaxy");
    // above the the wrong part of the code

    example = example.replaceAll("dishwasher", "galaxy");
    System.out.println(example);
  }
}
