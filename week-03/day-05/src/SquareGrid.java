import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.31..
 */
public class SquareGrid {
  public static void mainDraw(Graphics graphics) {
    Graphics2D gr = (Graphics2D) graphics;
    int center = 300;
    int size = 200;
    drawSqures(gr, center - size / 2, center - size / 2, size, 16);
  }

  public static void drawSqures(Graphics2D gr, int centerX, int centerY, int size, int strokeSize) {
    BasicStroke strokeWith = new BasicStroke(strokeSize);
    gr.setStroke(strokeWith);
    gr.drawRect(centerX - size / 2, centerY - size / 2, size, size);

    if (strokeWith.getLineWidth() > 2) {
      drawSqures(gr, centerX - size / 2, centerY - size / 2, size / 2, strokeSize / 2);
      drawSqures(gr, centerX - size / 2, centerY + size / 2, size / 2, strokeSize / 2);
      drawSqures(gr, centerX + size / 2, centerY - size / 2, size / 2, strokeSize / 2);
      drawSqures(gr, centerX + size / 2, centerY + size / 2, size / 2, strokeSize / 2);
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