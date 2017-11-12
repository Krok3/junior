package ua.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {

    Paint paint = new Paint();
    final String line = System.getProperty("line.separator");

    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^", this.line);
        assertThat(result, is(expected));
    }

    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        String result = paint.piramid(3);
        String expected = String.format("  ^  %s ^^^ %s^^^^^", this.line, this.line);
        assertThat(result, is(expected));
    }

    @Test
    public void whenPiramidWithHeightZeroThenStringIsEmpty() {
        String result = paint.piramid(0);
        String expected = "";
        assertThat(result, is(expected));
    }
}

