import java.util.ArrayList;

public class Sum {
  private ArrayList<Integer> numbersToSummarize;
  private int result;

  public Sum() {
    this.numbersToSummarize = new ArrayList<>();
  }

  public Sum(ArrayList<Integer> numbersToSummarize) {
    this.numbersToSummarize = numbersToSummarize;
  }

  public int sum() {
    for (Integer number : numbersToSummarize) {
      this.result += number;
    }
    return this.result;
  }
}
