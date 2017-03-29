import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.29..
 */
public class ColoredBox {
  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.

    graphics.setColor(Color.BLUE);
    graphics.drawLine(9, 9,289, 9);
    graphics.setColor(Color.RED);
    graphics.drawLine(289, 9, 289, 289);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(289, 289, 9, 289);
    graphics.setColor(Color.YELLOW);
    graphics.drawLine(9, 289, 9, 9);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
