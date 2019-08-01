package ru.job4j.coffee;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CoffeeTest {
    @Test
    public void when50and35then10and5() {
        Coffee coffee = new Coffee();
        int[] expected = new int[] {10, 5};
        assertThat(coffee.changes(50, 35), is(expected));
    }
    @Test
    public void when50and50thenNull() {
        Coffee coffee = new Coffee();
        int[] expected = new int[] {0};
        assertThat(coffee.changes(50, 50), is(expected));
    }
    @Test
    public void when100and32then10x6and5and2and1() {
        Coffee coffee = new Coffee();
        int[] expected = new int[] {10, 10, 10, 10, 10, 10, 5, 2, 1};
        assertThat(coffee.changes(100, 32), is(expected));
    }
}
