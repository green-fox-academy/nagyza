import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.29..
 */
public class LineInTheMiddle {

  public static void mainDraw(Graphics graphics){
    //  draw a red horizontal line to the canvas' middle.
    //  draw a green vertical line to the canvas' middle.
    graphics.setColor(Color.red);
    graphics.drawLine(0, 149, 299, 149);
    graphics.setColor(Color.green);
    graphics.drawLine(0, 150, 299, 150);
    graphics.setColor(Color.BLUE);
    graphics.drawRect(0, 0, 300, 300);
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
