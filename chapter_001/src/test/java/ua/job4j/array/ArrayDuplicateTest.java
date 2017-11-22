package ua.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    ArrayDuplicate duplicate = new ArrayDuplicate();

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] inArray = {"Liza", "Alex", "Anna", "Alex", "Anna", "Alex", "Liza"};
        String[] result = duplicate.remove(inArray);
        String[] expected = {"Liza", "Alex", "Anna"};
        assertThat(result, arrayContainingInAnyOrder(expected));
    }

    @Test
    public void whenAllElementsOfArrayAreDuplicatesThenArrayWithOneElement() {
        String[] inArray = {"May", "May", "May", "May"};
        String[] result = duplicate.remove(inArray);
        String[] expected = {"May"};
        assertThat(result, arrayContainingInAnyOrder(expected));
    }

    @Test
    public void whenArrayHasNotDuplicatesThenOriginalArray() {
        String[] inArray = {"One", "Two", "Three", "Four", "Five"};
        String[] result = duplicate.remove(inArray);
        String[] expected = {"One", "Two", "Three", "Four", "Five"};
        assertThat(result, arrayContainingInAnyOrder(expected));
    }
}
