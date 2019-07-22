package ru.job4j.array;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FinalTest {
    @Test
    public void when3() {
        Final test = new Final();
        int[] input1 = new int[]{1, 5, 8};
        int[] input2 = new int[]{2, 4, 10};
        int[] expected = new int[]{1, 2, 4, 5, 8, 10};
        assertThat(test.sort(input1,input2), is(expected));
    }
    @Test
    public void when4() {
        Final test = new Final();
        int[] input1 = new int[]{1, 5, 8, 11};
        int[] input2 = new int[]{2, 4, 10, 18};
        int[] expected = new int[]{1, 2, 4, 5, 8, 10, 11, 18};
        assertThat(test.sort(input1,input2), is(expected));
    }
}
