package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FunctionDiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionDiapason function = new FunctionDiapason();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenQuadResults() {
        FunctionDiapason function = new FunctionDiapason();
        List<Double> result = function.diapason(2, 4, x -> x * x);
        List<Double> expected = Arrays.asList(4D, 9D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenLogResults() {
        FunctionDiapason function = new FunctionDiapason();
        List<Double> result = function.diapason(9, 11, Math::log10);
        List<Double> expected = Arrays.asList(0.9542425094393249D, 1D);
        assertThat(result, is(expected));
    }
}
