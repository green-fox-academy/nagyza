import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.29..
 */
public class LinePlay {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]

  linePlay(graphics, 30);

  }

  public static void linePlay(Graphics g, int stepNum) {
    int stepSize = 300 / stepNum;
    int x = 0;
    int y = 0;
    int stepSizePlus = 0;
    for (int i = 0; i < (stepNum - 1) * 2; i++) {
      stepSizePlus += stepSize;
      y = x;
      g.setColor(Color.GREEN);
      g.drawLine(x, y + stepSizePlus, x + stepSizePlus, 300);
    }
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
