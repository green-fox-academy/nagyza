/**
 * Created by nagyza on 2017.03.22..
 */
public class Printer {
  public static void main(String[] args) {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `printer`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printer("first")
    // printer("first", "second")
    // printer("first", "second", "third", "fourh")
    // ...

    printer("first");
    printer("first", "second");
    printer("first", "second", "third", "fourh");
    printer("alma", "banan");
  }

  public static void printer(String ... text) {
    for (String stringParameter : text) {
      System.out.println(stringParameter);
    }
  }
}