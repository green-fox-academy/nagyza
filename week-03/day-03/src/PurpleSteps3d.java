import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.29..
 */
public class PurpleSteps3d {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps-3d/r4.png]
    int size = 10;
    int grow = size;
    int xy = size;
    for (int i = 0; i < 6; i++) {
      drawPurpleSqares(graphics, xy, size);
      size += grow;
      xy += (size - grow);
    }
  }

  public static void drawPurpleSqares(Graphics g, int xy, int size) {
    g.setColor(new Color(128, 0, 128));
    g.fillRect(xy, xy, size, size);
    g.setColor(Color.GRAY);
    g.drawRect(xy, xy, size, size);
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
