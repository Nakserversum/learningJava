import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;


public class SnakeGame extends JPanel{
    private class Tile {
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int boardWith;
    int boardHeight;
    int tileSize = 25;

    Tile snakeHead;

    SnakeGame(int boardWith, int boardHeight) {
        this.boardWith = boardWith;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWith, this.boardHeight));
        setBackground(Color.black);

        snakeHead = new Tile(5, 5);
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        //Grid
        for (int i = 0; i <boardWith/tileSize; i++) {
            //(x1, y1, x2, y2
            g.drawLine(i*tileSize,0, i*tileSize, boardHeight);
            g.drawLine(0, i*tileSize, boardWith, i*tileSize);
        }

        g.setColor(Color.green);
        g.fillRect(snakeHead.x, snakeHead.y, tileSize, tileSize);
    }
}