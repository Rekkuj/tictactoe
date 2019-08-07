package tictactoe;

/*
 * Defines a cell in a TicTacToe game board
 */

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cell extends JPanel {
    // token of this cell
    private char token = ' ';

    // Constructor
    public Cell() {
        setBorder(new LineBorder(Color.black, 1));
        addMouseListener(new MyMouseListener();
    }

    public char getToken() {
        return token;
    }

    public void setToken(char c) {
        token = c;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (token == 'X') {
            g.drawLine(10, 10, getWidth() - 10, getHeight() - 10);
            g.drawLine(getWidth() - 10, 10, 10, getHeight() - 10);
        } else if (token == 'O') {
            g.drawOval(10, 10, getWidth() - 20, getHeight() - 20);
        }
    }

    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
        }
    }
}