package ua.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    BubbleSort sortArray = new BubbleSort();

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        int[] inArray = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = sortArray.sort(inArray);
        int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortArrayWithFiveElementsThenSortedArray() {
        int[] inArray = {5, 3, 2, 4, 1};
        int[] result = sortArray.sort(inArray);
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(result, is(expected));
    }
}
