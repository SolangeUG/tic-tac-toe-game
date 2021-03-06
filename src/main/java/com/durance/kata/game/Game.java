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
            throw new IllegalArgumentException("Illegal operation!");
        }

        if (board[xPosition][yPosition] != null) {
            throw new IllegalArgumentException("The requested position is already played on!");
        }

        previousMarker = marker;
        board[xPosition][yPosition] = marker;

        // check horizontal win
        String bMarker = board[xPosition][0];
        if (bMarker != null
                && bMarker.equals(board[xPosition][1])
                && bMarker.equals(board[xPosition][2])) {
            return new GameState(board, Status.WIN);
        }

        // check vertical win
        bMarker = board[0][yPosition];
        if (bMarker != null
                && bMarker.equals(board[1][yPosition])
                && bMarker.equals(board[2][yPosition])) {
            return new GameState(board, Status.WIN);
        }

        // check diagonal win
        bMarker = board[1][1];
        if (bMarker != null) {
            if (   (bMarker.equals(board[0][0]) && bMarker.equals(board[2][2]))
                || (bMarker.equals(board[0][2]) && bMarker.equals(board[2][0]))) {
                return new GameState(board, Status.WIN);
            }
        }

        // check for draw
        boolean isDraw = true;
        for (String[] row: board) {
            for (String bM: row) {
                isDraw = isDraw && bM != null;
                if (! isDraw) {
                    break;
                }
            }
        }
        if (isDraw) {
            return new GameState(board, Status.DRAW);
        }

        return new GameState(board, Status.INCOMPLETE);
    }

}
