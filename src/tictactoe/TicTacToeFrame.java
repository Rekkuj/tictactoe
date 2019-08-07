package tictactoe;

/*
 * Simple TicTacToe game from Youtube tutorial
 * @author Reija J
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class TicTacToeFrame extends JFrame {
    // Whose turn it is?
    private char whoseTurn = 'X';

    // Create cell grid
    private Cell[][] cells = new Cell[3][3];

    // Create a status label
    JLabel jlblStatus = new JLabel("X's turn to play");

    public TicTacToeFrame() {
        // Panel to hold cells
        JPanel panel = new JPanel(new GridLayout(3,3, 0, 0));
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                panel.add(cells[i][j] = new Cell());

            panel.setBorder(new LineBorder(Color.magenta, 1));
            jlblStatus.setBorder(new LineBorder(Color.yellow, 1));
        add(panel, BorderLayout.CENTER);
        add(jlblStatus, BorderLayout.SOUTH);
    }

    /*
    * Determine if game board is full.
    * Return True, if game board is full, otherwise false
    */

    public boolean isFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (cells[i][j].getToken() == ' ')
                    return false;
        return true;
    }



    }
}
