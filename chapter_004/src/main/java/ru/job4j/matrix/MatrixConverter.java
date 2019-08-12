package ru.job4j.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MatrixConverter {

    public List<Integer> convert(List<List<Integer>> list) {
        List<Integer> result = new ArrayList<>();
        result = list.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
        return result;
    }
}
