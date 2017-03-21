/**
 * Created by nagyza on 2017.03.21..
 */
public class Exercise_13 {
  public static void main(String[] args) {
    int a = 3;
    // make it bigger by 10
    a += 3;
    System.out.println(a);

    int b = 100;
    // make it smaller by 7
    b -= 7;
    System.out.println(b);

    int c = 44;
    // please double c's value
    c *= c;
    System.out.println(c);

    int d = 125;
    // please divide by 5 d's value
    d /= 5;
    System.out.println(d);

    int e = 8;
    // please cube of e's value
    e = (int) Math.pow(e, 3);
    System.out.println(e);

    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)
    System.out.println(f1 > f2);

    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)
    System.out.println(g2 * 2 > g1);

    double h = 1357988018575474.;
    // tell if it has 11 as a divisor (print as a boolean)
    System.out.println(h % 11 == 0);

    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    System.out.println(i1 > Math.sqrt(i2) && i1 < Math.pow(i2, 3));

    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)
    System.out.println(j % 3 == 0 || j % 5 == 0);

    String k = "Apple";
    //fill the k variable with its content 4 times
    //for (int i = 0; i < 4; i++) { //this for cycle is probably too much
    //}
    k = k + k + k + k;
    System.out.println(k);

  }
}
