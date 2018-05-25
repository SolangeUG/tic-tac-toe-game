package com.durance.kata.game;

/**
 * A TIC-TAC-TOE game class
 * @author Solange U. Gasengayire
 */
class TicTacToeGame {

    // game 3x3 board
    private String[][] board = new String[3][3];

    /**
     * Play: a player adds a marker to the board
     * @param marker either X or O
     * @param xPosition x coordinate
     * @param yPosition y coordinate
     * @return the current game board
     */
    String[][] play(String marker, int xPosition, int yPosition) {
        if ("O".equals(marker)) {
            throw new IllegalArgumentException();
        }

        board[xPosition][yPosition] = marker;
        return board;
    }

}
