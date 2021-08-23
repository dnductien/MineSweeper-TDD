package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineSweeperTest {
    @Test
    void showEmptyField() {
        assertArrayEquals(
                new String[] {"000"},
                displayField(new String[] {"..."})
        );
    }

    @Test
    void isShowCorrectRows() {
        assertArrayEquals(
                new String[] {"000", "000"},
                displayField(new String[] {"...", "..."})
        );
    }

    @Test
    void isShowCorrectColumns() {
        assertArrayEquals(
                new String[] {"0000"},
                displayField(new String[] {"...."})
        );
    }

    private String[] displayField(String[] input) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = "000";
        }

        return result;
    }
}
