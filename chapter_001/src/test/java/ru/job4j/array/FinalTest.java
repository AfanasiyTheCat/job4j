package ru.job4j.array;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FinalTest {
    @Test
    public void when3() {
        Final test = new Final();
        int[] input1 = new int[]{1, 5, 8};
        int[] input2 = new int[]{2, 4, 10};
        int[] expected = new int[]{1, 2, 4, 5, 8, 10};
        assertThat(test.sort(input1, input2), is(expected));
    }
    @Test
    public void when4() {
        Final test = new Final();
        int[] input1 = new int[]{1, 5, 8, 11};
        int[] input2 = new int[]{2, 4, 10, 18};
        int[] expected = new int[]{1, 2, 4, 5, 8, 10, 11, 18};
        assertThat(test.sort(input1, input2), is(expected));
    }
    @Test
    public void when4and1isless() {
        Final test = new Final();
        int[] input1 = new int[]{1, 2, 3, 4};
        int[] input2 = new int[]{5, 6, 7, 8};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(test.sort(input1, input2), is(expected));
    }
    @Test
    public void when4and21isless() {
        Final test = new Final();
        int[] input1 = new int[]{5, 6, 7, 8};
        int[] input2 = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(test.sort(input1, input2), is(expected));
    }
    @Test
    public void when4and3() {
        Final test = new Final();
        int[] input1 = new int[]{5, 6, 7, 8};
        int[] input2 = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 3, 5, 6, 7, 8};
        assertThat(test.sort(input1, input2), is(expected));
    }
    @Test
    public void when6and2() {
        Final test = new Final();
        int[] input1 = new int[]{2, 5, 6, 7, 8, 10};
        int[] input2 = new int[]{1, 3};
        int[] expected = new int[]{1, 2, 3, 5, 6, 7, 8, 10};
        assertThat(test.sort(input1, input2), is(expected));
    }
}
