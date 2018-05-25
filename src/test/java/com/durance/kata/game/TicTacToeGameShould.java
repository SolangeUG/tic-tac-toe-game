package com.durance.kata.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    @DisplayName("make sure O can't go first")
    void make_sur_O_cant_go_first() {
        assertThrows(IllegalArgumentException.class,
                    () -> game.play("O", 2, 1));
    }

    @Test
    @DisplayName("make sure players alternate placing X's and O's on the board")
    void make_sure_players_take_turn() {
        game.play("X", 1, 1);
        assertThrows(IllegalArgumentException.class,
                () -> game.play("X", 1, 2));
    }

}
