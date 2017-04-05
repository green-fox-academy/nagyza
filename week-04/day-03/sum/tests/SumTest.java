import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void sumTestFilledArrayList() throws Exception {
    ArrayList<Integer> numbersToSummarize = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      numbersToSummarize.add(i);
    }
    Sum summarize = new Sum(numbersToSummarize);
    assertEquals(10, summarize.sum());
  }

}