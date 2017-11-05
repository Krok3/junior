package ua.job4j.loop;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    Counter cnt = new Counter();
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = cnt.add(1, 10);
        int expctd = 30;
        assertThat(rsl, is(expctd));
    }
    @Test
    public void whenSumEvenNumbersFromZeroToOneThenZero() {
        int rsl = cnt.add(0, 1);
        int expctd = 0;
        assertThat(rsl, is(expctd));
    }
    @Test
    public void whenSumNegativeEvenNumbersFromMinusFifteenToZero() {
        int rsl = cnt.add(-15, 0);
        int expctd = -56;
        assertThat(rsl, is(expctd));
    }
    @Test
    public void whenSumEvenNumbersFromMinusTenToTen() {
        int rsl = cnt.add(-10, 10);
        int expctd = 0;
        assertThat(rsl, is(expctd));
    }
}