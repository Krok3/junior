package ua.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    Turn turn = new Turn();

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] inArray = {2, 6, 1, 4};
        int[] result = turn.back(inArray);
        int[] expected = {4, 1, 6, 2};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] inArray = {1, 2, 3, 4, 5};
        int[] result = turn.back(inArray);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}
