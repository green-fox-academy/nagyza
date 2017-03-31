import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.31..
 */
public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics) {
    int center = 400;
    int size = 200;
    drawSquares(graphics, center - size / 2, center - size / 2, size);
  }

  public static void drawSquares(Graphics gr, int centerX, int centerY, int size) {
    gr.fillRect(centerX - size / 2, centerY - size / 2, size, size);
    if (size > 10) {
      drawSquares(gr, centerX - size, centerY - size, size / 3);
      drawSquares(gr, centerX, centerY - size, size / 3);
      drawSquares(gr, centerX + size, centerY - size, size / 3);
      drawSquares(gr, centerX - size, centerY, size / 3);
      drawSquares(gr, centerX - size, centerY + size, size / 3);
      drawSquares(gr, centerX, centerY + size, size / 3);
      drawSquares(gr, centerX + size, centerY, size / 3);
      drawSquares(gr, centerX + size, centerY + size, size / 3);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(800, 800));
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
