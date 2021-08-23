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
    void isShowMineCorrect() {
        assertArrayEquals(
                new String[] {"*00"},
                displayField(new String[] {"*.."})
        );
    }

    @Test
    void isShowMineOnRows() {
        assertArrayEquals(
                new String[] {"*100"},
                displayField(new String[] {"*..."})
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
        for (int row = 0; row < input.length; row++) {
            result[row] = "";
            for (int col = 0; col < input[row].length(); col++) {
                if (input[row].charAt(col) == '*') {
                    result[row] += "*";
                } else {
                    result[row] += "0";
                }


            }
        }

        return result;
    }
}
