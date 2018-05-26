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
class GameShould {

    private Game game = new Game();

    @Test
    @DisplayName("make sure X always goes first")
    void make_sure_X_goes_first() {
        GameState state = game.play("X", 0, 0);
        assertEquals("X", state.getBoard()[0][0]);
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

    @Test
    @DisplayName("make sure players cannot play on a played position")
    void make_sure_cant_play_on_played_position() {
        game.play("X", 1, 1);
        assertThrows(IllegalArgumentException.class,
                () -> game.play("O", 1, 1));
    }

    @Test
    @DisplayName("check for horizontal win on first row")
    void check_horizontal_win_on_first_row() {
        game.play("X", 0, 0);
        game.play("O", 1, 0);
        game.play("X", 0, 1);
        game.play("O", 2, 0);
        GameState state = game.play("X", 0, 2);

        assertEquals(Status.WIN, state.getStatus());
    }

    @Test
    @DisplayName("check for vertical win on first column")
    void check_vertical_win_on_first_column() {
        game.play("X", 0, 0);
        game.play("O", 0, 1);
        game.play("X", 1, 0);
        game.play("O", 0, 2);
        GameState state = game.play("X", 2, 0);

        assertEquals(Status.WIN, state.getStatus());
    }

    @Test
    @DisplayName("check for diagonal win on first diagonal")
    void check_diagonal_win_on_first_diagonal() {
        game.play("X", 0, 0);
        game.play("O", 1, 0);
        game.play("X", 1, 1);
        game.play("O", 2, 0);
        GameState state = game.play("X", 2, 2);

        assertEquals(Status.WIN, state.getStatus());
    }

    @Test
    @DisplayName("check for diagonal win on first diagonal")
    void check_diagonal_win_on_second_diagonal() {
        game.play("X", 0, 2);
        game.play("O", 1, 0);
        game.play("X", 1, 1);
        game.play("O", 0, 0);
        GameState state = game.play("X", 2, 0);

        assertEquals(Status.WIN, state.getStatus());
    }

}
