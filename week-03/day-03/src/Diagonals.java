import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.29..
 */
public class Diagonals {
  public static void mainDraw(Graphics graphics){
    // draw the canvas' diagonals in green.

    graphics.setColor(Color.GREEN);
    graphics.drawLine(0,0,299, 299);
    graphics.drawLine(0, 299, 299, 0);
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
