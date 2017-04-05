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

  @Test
  public void sumTestEmptyArrayList() throws Exception {
    ArrayList<Integer> numbersToSummarize = new ArrayList<>();
    Sum summarize = new Sum(numbersToSummarize);
    assertEquals(0, summarize.sum());
  }

  @Test
  public void sumTestOneSizedArrayList() throws Exception {
    ArrayList<Integer> numbersToSummarize = new ArrayList<>();
    numbersToSummarize.add(10);
    Sum summarize = new Sum(numbersToSummarize);
    assertEquals(10, summarize.sum());
  }

  @Test
  public void sumTestNullArrayList() throws Exception {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers = null;
    Sum summarize = new Sum(numbers);
    assertEquals(0 ,summarize.sum());
  }
}