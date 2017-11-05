package ua.job4j.loop;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    Factorial fctrl = new Factorial();

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int expctd = 120;
        assertThat(fctrl.calc(5), is(expctd));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expctd = 1;
        assertThat(fctrl.calc(0), is(expctd));
    }
}