package ua.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RotateArrayTest {
    RotateArray rotateTable = new RotateArray();

    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        int[][] inArray = {{1, 2}, {3, 4}};
        int[][] result = rotateTable.rotate(inArray);
        int[][] expected = {{3, 1}, {4, 2}};
        assertThat(result, is(expected));
    }

    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        int[][] inArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = rotateTable.rotate(inArray);
        int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertThat(result, is(expected));
    }

    @Test
    public void whenRotateTwoRowFourColArrayThenRotatedArrayFourRowTwoCol() {
        int[][] inArray = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][] result = rotateTable.rotate(inArray);
        int[][] expected = {{5, 1}, {6, 2}, {7, 3}, {8, 4}};
        assertThat(result, is(expected));
    }

    @Test
    public void whenRotateFiveRowThreeColArrayThenRotatedArrayThreeRowFiveCol() {
        int[][] inArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
        int[][] result = rotateTable.rotate(inArray);
        int[][] expected = {{13, 10, 7, 4, 1}, {14, 11, 8, 5, 2}, {15, 12, 9, 6, 3}};
        assertThat(result, is(expected));
    }
}
