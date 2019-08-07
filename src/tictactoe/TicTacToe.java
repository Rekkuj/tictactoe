package tictactoe;

import javax.swing.JFrame;

/*
* Simple TicTacToe game
* @author Reija J
*/

public class TicTacToe {
    public static void main(String[] args) {
        JFrame ticTacToe = new TicTacToeFrame();
        ticTacToe.setTitle("TicTacToe Game");
        ticTacToe.setSize(600, 600);
        ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticTacToe.setLocationRelativeTo(null);
        ticTacToe.setVisible(true);
    }
}
