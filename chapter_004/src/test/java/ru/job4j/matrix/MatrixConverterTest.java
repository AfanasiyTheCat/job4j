package ru.job4j.matrix;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MatrixConverterTest {
    @Test
    public void whenConvert() {
        MatrixConverter converter = new MatrixConverter();
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertThat(converter.convert(matrix), is(expected));
    }
}
