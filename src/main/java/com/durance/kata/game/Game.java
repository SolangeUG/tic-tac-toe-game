package com.durance.kata.game;

/**
 * A TIC-TAC-TOE game class
 * @author Solange U. Gasengayire
 */
class Game {

    // game 3x3 board
    private String[][] board = new String[3][3];
    private String previousMarker = "O";

    /**
     * Play: a player adds a marker to the board
     * @param marker either X or O
     * @param xPosition x coordinate
     * @param yPosition y coordinate
     * @return the current game stae
     */
    GameState play(String marker, int xPosition, int yPosition) {
        if (marker.equals(previousMarker)) {
            throw new IllegalArgumentException();
        }

        if (board[xPosition][yPosition] != null) {
            throw new IllegalArgumentException();
        }

        Status status = Status.INCOMPLETE;
        previousMarker = marker;
        board[xPosition][yPosition] = marker;

        // check horizontal win
        String bMarker = board[xPosition][0];
        if (bMarker != null
                && bMarker.equals(board[xPosition][1])
                && bMarker.equals(board[xPosition][2])) {
            status = Status.WIN;
        }

        // check vertical win
        bMarker = board[0][yPosition];
        if (bMarker != null
                && bMarker.equals(board[1][yPosition])
                && bMarker.equals(board[2][yPosition])) {
            status = Status.WIN;
        }

        // check diagonal win
        bMarker = board[1][1];
        if (bMarker != null) {
            if (   (bMarker.equals(board[0][0]) && bMarker.equals(board[2][2]))
                || (bMarker.equals(board[0][2]) && bMarker.equals(board[2][0]))) {
                status = Status.WIN;
            }
        }

        return new GameState(board, status);
    }

}
