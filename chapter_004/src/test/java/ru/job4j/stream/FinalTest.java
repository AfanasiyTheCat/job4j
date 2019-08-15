package ru.job4j.stream;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FinalTest {
    @Test
    public void whenTransform1234() {
        Final test = new Final();
        int[] arr = new int[] {1, 2, 3, 4};
        int expected = 20;
        assertThat(test.transform(arr), is(expected));
    }

    @Test
    public void whenTransform() {
        Final test = new Final();
        int[] arr = new int[] {3, 6, 10, 8, 12};
        int expected = 344;
        assertThat(test.transform(arr), is(expected));
    }
}
