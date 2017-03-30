import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.30..
 */

public class GraphicSquareFractal {
  public static void mainDraw(Graphics graphics) {
    int halfSize = 100;
    int centre = 110;
    drawLines(graphics, halfSize, centre);

  }

  public static void drawLines(Graphics g, int halfSize, int center) {
    g.drawLine(center - halfSize, center - halfSize, center - halfSize, center + halfSize);
    g.drawLine(center - halfSize / 3, center - halfSize, center - halfSize / 3, center + halfSize);
    g.drawLine(center + halfSize, center - halfSize, center + halfSize, center + halfSize);
    g.drawLine(center + halfSize / 3, center - halfSize, center + halfSize / 3, center + halfSize);
    g.drawLine(center - halfSize, center - halfSize, center + halfSize, center - halfSize);
    g.drawLine(center - halfSize, center - halfSize / 3, center + halfSize, center - halfSize/3);
    g.drawLine(center - halfSize, center + halfSize, center + halfSize, center + halfSize);
    g.drawLine(center - halfSize, center + halfSize / 3, center + halfSize, center + halfSize/3);
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
