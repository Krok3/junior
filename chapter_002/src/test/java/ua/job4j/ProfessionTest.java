package ua.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfessionTest {

    Profession teacher = new Profession("First", "John B.", 'M', 35,
            "Temple University", "teacher", "mathematics and computer science",
            3);

    @Test
    public void ifMakePresentationThenMethodReturnCorrectString() {
        String result = teacher.presentation();
        String expected = "Hello! I am John B. First. I'm teacher. I work at the Temple University. My speciality is "
                + "mathematics and computer science. I have been working in this position for 3 years.";
        assertThat(result, is(expected));
    }

}