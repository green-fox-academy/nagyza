import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.31..
 */
public class TriangleSierpinski {

  public static void mainDraw(Graphics graphics) {
    int side = 500;
    int xBegin = 0;
    int yBegin = 0;
    int yDiff = (int)Math.sqrt((side * side) - ((side / 2) * (side / 2)));
    int[] xBig = {xBegin, xBegin + side, xBegin + side / 2};
    int[] yBig = {yBegin + yDiff, yBegin + yDiff, yDiff - yDiff};
    graphics.setColor(Color.BLACK);
    graphics.drawPolygon(xBig, yBig, 3);
    drawSierpinskiTriangles(graphics, xBegin, yBegin, side);
  }

  public static void drawSierpinskiTriangles(Graphics g, int x, int y, int side) {
    int yDiff = (int)Math.sqrt((side * side) - ((side / 2) * (side / 2)));
    int[] xCentral = {x + side / 4, x + side / 4 * 3, x + side / 2};
    int[] yCentral = {y + yDiff / 2, y + yDiff / 2, y + yDiff};
    g.drawPolygon(xCentral, yCentral, 3);
    int x1 = x;
    int y1 = y + yDiff / 2 + 1;
    int x2 = x + side / 2 + 1;
    int y2 = y + yDiff /2;
    int x3 = x + side / 4 + 1;
    int y3 = y;
    if (side > 10) {
      drawSierpinskiTriangles(g, x1, y1, side / 2);
      drawSierpinskiTriangles(g, x2, y2, side / 2);
      drawSierpinskiTriangles(g, x3, y3, side / 2);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 600));
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