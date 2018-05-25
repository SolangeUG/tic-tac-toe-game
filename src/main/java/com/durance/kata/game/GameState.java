package com.durance.kata.game;

/**
 * A class that represents state of the game
 * @author Solange U. Gasengayire
 */
class GameState {

    private String[][] board;
    private Status status;

    /**
     * Constructor
     * @param board game board
     * @param status game status
     */
    GameState(String[][] board, Status status) {
        this.board = board;
        this.status = status;
    }

    /**
     * Return game board
     * @return board
     */
    String[][] getBoard() {
        return board;
    }

    /**
     * Return game status
     * @return status
     */
    Status getStatus() {
        return status;
    }
}
