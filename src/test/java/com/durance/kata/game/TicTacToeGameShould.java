package com.durance.kata.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TIC-TAC-TOE game class unit tests
 * @author Solange U. Gasengayire
 */
@DisplayName("TIC-TAC-TOE game should")
class TicTacToeGameShould {

    private TicTacToeGame game = new TicTacToeGame();

    @Test
    @DisplayName("make sure X always goes first")
    void make_sure_X_goes_first() {
        String[][] board = game.play("X", 0, 0);
        assertEquals("X", board[0][0]);
    }

}