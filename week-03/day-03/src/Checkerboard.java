import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.29..
 */
public class Checkerboard {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps-3d/r4.png]
    int xy = (int) (Math.random() * 30);
    int size = (int) (Math.random() * 30);
    int canvasSize = 300;
    drawCheckerboard(graphics, xy, size, canvasSize);
  }

  public static void drawCheckerboard(Graphics g, int xy, int size, int canvasSize) {
    int db = (canvasSize - (2 * xy)) / size;
    int y = xy;
    for (int oszl = 0; oszl < db; oszl++) {
      int x = xy;
      for (int sor = 0; sor < db; sor++) {
        if ((((sor % 2) == 0) && ((oszl % 2) == 0)) || (((sor % 2) == 1) && ((oszl % 2) == 1))) {
          g.setColor(Color.BLACK);
          g.fillRect(x, y, size, size);
        } else if ((((sor % 2) == 1) && ((oszl % 2) == 0)) || (((sor % 2) == 0) && ((oszl % 2) == 1))){
          g.setColor(Color.WHITE);
          g.fillRect(x, y, size, size);
        }
        x += size;
      }
      y += size;
    }
  }

  public static void drawSquare(Graphics gSq, int xy, int size) {

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
