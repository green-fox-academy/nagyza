import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nagyza on 2017.03.23..
 */
public class QuoteSwap {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // "What I cannot create, I do not understand"

    // Also, print the sentence to the output with spaces in between.

    System.out.println(rightOrder(list, "cannot", 2));
    System.out.println(rightOrder(list, "do", 6));
  }
  public static ArrayList rightOrder(ArrayList<String> list, String toOrder, int whereTo) {
    ArrayList<String> arrayList = list;
    int whereFrom = list.indexOf(toOrder);
    if (whereFrom > whereTo) {
      arrayList.remove(whereFrom);
      arrayList.add(whereTo, toOrder);
      return arrayList;
    } else {
      arrayList.add(whereTo, toOrder);
      arrayList.remove(whereFrom);
    }
    return arrayList;
  }
}
