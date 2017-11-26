package ua.job4j.controltask;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MergeArraysTest {
    MergeArrays unitedArray = new MergeArrays();

    @Test
    public void whenTwoSortedArraysOfEqualLengthThenTotalArrayIsAlsoSorted() {
        int[] firstArray = {1, 2, 4, 7, 9};
        int[] secondArray = {3, 5, 6, 8, 9};
        int[] result = unitedArray.merge(firstArray, secondArray);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwoSortedArraysOfDiffLengthThenTotalArrayIsAlsoSorted() {
        int[] firstArray = {20, 22, 44, 77, 999};
        int[] secondArray = {2, 4, 9, 111};
        int[] result = unitedArray.merge(firstArray, secondArray);
        int[] expected = {2, 4, 9, 20, 22, 44, 77, 111, 999};
        assertThat(result, is(expected));
    }
}
