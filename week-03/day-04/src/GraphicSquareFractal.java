import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.30..
 */

public class GraphicSquareFractal {
  public static void mainDraw(Graphics graphics) {
    int size = 200;
    int x = 0;
    int y = 0;
    graphics.setColor(Color.YELLOW);
    graphics.fillRect(0, 0, 600, 600);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(0, 0, 600, 600);
    drawLines(graphics, x, y, size);
  }

  public static void drawLines(Graphics g, int x, int y, int size) {
    for (int i = 0; i < 4; i++) {
      g.drawRect(x + size, y, size, size);
      g.drawRect(x, y + size, size, size);
      g.drawRect(x + size, y + 2 *size, size, size);
      g.drawRect(x + 2 * size, y + size, size, size);
    }
    if (size > 3) {
      drawLines(g, x + size + 1, y, size / 3);
      drawLines(g, x, y + size + 1, size / 3);
      drawLines(g, x + size, y + 2 * size + 1, size / 3);
      drawLines(g, x + 2 * size + 1, y + size + 1, size / 3);
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