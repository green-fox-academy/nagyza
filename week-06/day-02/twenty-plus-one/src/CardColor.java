import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;

public enum CardColor {
  RED(0), BLUE(1);

  private int value;

  private CardColor(int value) {
    this.value = value;
  }
}
