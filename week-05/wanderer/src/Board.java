import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  BoardCreator gameBoard;
  Hero gameHero;
  int moveCounter = 0;
  int level;

  public Board() {
    gameBoard = new BoardCreator();
    gameHero = gameBoard.getGameHero();
    level = 1;
    setPreferredSize(new Dimension(1000, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    int tilePosX = 0;
    int tilePosY = 0;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (gameBoard.getTilesOrder()[j][i] == 0) {
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

    int monsterStringY = 50;
    for (Monster aktualMonster : gameBoard.getAllMonsters()) {
      aktualMonster.getImageDraw().draw(graphics);
      graphics.drawString(aktualMonster.toString(), 730, monsterStringY + 20);
      monsterStringY += 20;
    }
    this.gameHero.getImageDraw().draw(graphics);
    graphics.drawString(gameHero.toString(), 730, 50);
    graphics.drawString(gameBoard.getMonsterToKillIndex(), 730, 10);
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

    if (e.getKeyCode() == KeyEvent.VK_UP && gameBoard.isNotOnMonstersPlace(gameHero)) {
      gameHero.moveUp(gameBoard.getTilesOrder());
      moveCounter++;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && gameBoard.isNotOnMonstersPlace(gameHero)) {
      gameHero.moveDown(gameBoard.getTilesOrder());
      moveCounter++;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && gameBoard.isNotOnMonstersPlace(gameHero)) {
      gameHero.moveLeft(gameBoard.getTilesOrder());
      moveCounter++;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && gameBoard.isNotOnMonstersPlace(gameHero)) {
      gameHero.moveRight(gameBoard.getTilesOrder());
      moveCounter++;
    }
    gameHero = gameBoard.getGameHero();
    if (moveCounter % 2 == 0 && gameBoard.isNotOnMonstersPlace(gameHero)) {
      gameBoard.moveMonsters();
    }
    if (!gameBoard.isNotOnMonstersPlace(gameHero)) {
      if (e.getKeyCode() == KeyEvent.VK_SPACE) {
        gameBoard.fight();
      }
    }
    System.out.println(moveCounter);

    if (gameBoard.getAllMonsters().size() == 0) {
      this.level++;
      gameHero.setPositionX(0);
      gameHero.setPositionY(0);
      gameBoard = new BoardCreator(gameHero, level);
    }
    repaint();
  }
}