import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.29..
 */
public class FourRectangles {
  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.

    graphics.setColor(Color.BLUE);
    graphics.fillRect(10, 10, 100, 20);
    graphics.setColor(Color.RED);
    graphics.fillRect(10, 40, 100, 20);
    graphics.setColor(Color.GREEN);
    graphics.fillRect(120, 10, 100, 20);
    graphics.setColor(Color.YELLOW);
    graphics.fillRect(120, 40, 100, 20);

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
