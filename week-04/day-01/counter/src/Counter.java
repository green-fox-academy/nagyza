/**
 * Created by nagyza on 2017.04.03..
 */
public class Counter {
  int count;
  int startCount;

  public Counter() {
    this.count = 0;
    startCount = this.count;
  }

  public Counter(int count) {
    this.count = count;
    startCount = this.count;
  }

  public int add(int toAdd) {
    return count += toAdd;
  }

  public void add() {
    this.count++;
  }

  public int get() {
    return count;
  }

  public void reset() {
    this.count = startCount;
  }

}