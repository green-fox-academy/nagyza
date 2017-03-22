/**
 * Created by nagyza on 2017.03.22..
 */
public class Append_a {
  public static void main(String[] args) {
    //  Create the usual class wrapper
    //  and main method on your own.
    // - Create a string variable named `am` and assign the value `kuty` to it
    // - Write a function called `appendA` that gets a string as an input
    //   and appends an 'a' character to its end
    // - Print the result of `appendA(am)
    String am = "kuty";
    System.out.println(appendA(am));
  }
  public static String appendA(String text) {
    return text + "a";
  }
}
