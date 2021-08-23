package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineSweeperTest {
    @Test
    void showEmptyField() {
        assertArrayEquals(new String[] {"000"}, displayField(new String[] {"..."}));
    }

    private String[] displayField(String[] input) {
        return new String[0];
    }
}
