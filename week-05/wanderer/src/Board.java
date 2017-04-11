import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  int characterX;
  int characterY;
  int[][] tilesOrder = {{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                        {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                        {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                        {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
                        {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
                        {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 1, 0, 1, 1, 0, 1, 0}};

  public Board() {
    characterX = 0;
    characterY = 0;
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    int tilePosX = 0;
    int tilePosY = 0;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (tilesOrder[j][i] == 0) {
          PositionedImage image = new PositionedImage("assets/floor.png", tilePosX, tilePosY);
          image.draw(graphics);
        } else {
          PositionedImage image = new PositionedImage("assets/wall.png", tilePosX, tilePosY);
          image.draw(graphics);
        }
        tilePosY += 1;
      }
      tilePosY = 0;
      tilePosX += 1;
    }
    PositionedImage image = new PositionedImage("assets/hero-down.png", characterX, characterY);
    image.draw(graphics);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP && characterY > 0) {
      characterY -= 1;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN && characterY < 9) {
      characterY += 1;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && characterX > 0) {
      characterX -= 1;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && characterX < 9) {
      characterX += 1;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}