/**
 * Created by nagyza on 2017.03.30..
 */
public class SumDigit {
  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    System.out.println(sumDigit(321));
  }

  public static int sumDigit(int n) {
    int dig = n % 10;
    if (n < 10) {
      return n;
    } else {
      return dig + sumDigit (n / 10);
    }
  }
}
