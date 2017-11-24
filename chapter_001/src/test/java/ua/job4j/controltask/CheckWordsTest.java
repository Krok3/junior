package ua.job4j.controltask;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckWordsTest {
    CheckWords wordInWord = new CheckWords();

    @Test
    public void whenOneWordIsPartOfAnotherWordThenTrue() {
        String origin = "Привет";
        String sub = "иве";
        boolean result = wordInWord.contains(origin, sub);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenOneWordIsPartOfAnotherWordDiffRegistersThenTrue() {
        String origin = "Крокодил";
        String sub = "Код";
        boolean result = wordInWord.contains(origin, sub);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenOneWordIsNotPartOfAnotherWordThenFalse() {
        String origin = "Параллелограмм";
        String sub = "Самолет";
        boolean result = wordInWord.contains(origin, sub);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}
