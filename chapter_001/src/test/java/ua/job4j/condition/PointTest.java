package ua.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PointTest {

    @Test
    public void whenPointOnLineThenTrue() {
        //create of new point.
        Point a = new Point(1, 1);
        // execute method - is and get result;
        boolean rsl = a.is(0, 1);
        // assert result by excepted value.
        assertThat(rsl, is(true));
    }

    @Test
    public void whenPointNotOnLineThenTrue() {
        //create of new point.
        Point a = new Point(1, 6);
        // execute method - is and get result;
        boolean rsl = a.is(0, 1);
        // assert result by excepted value.
        assertThat(rsl, is(false));
    }
}