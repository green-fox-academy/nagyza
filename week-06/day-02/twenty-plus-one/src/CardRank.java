
public enum  CardRank {
  C2(2), C3(3), C4(4), C5(5), C6(6), C7(7), C8(8), C9(9), C10(10), J(10), Q(10), K(10), A(10);

  private int value;

  private CardRank(int value) {
    this.value = value;
  }
}
