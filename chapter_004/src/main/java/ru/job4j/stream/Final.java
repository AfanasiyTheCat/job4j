package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Final {
    private int count = 0;

    public int transform(Integer[] arr) {
        List<Integer> list = List.of(arr);
        list.stream().filter(integer -> integer % 2 == 0)
                .map(integer -> integer * integer)
                .forEach(this::add);
        return count;
    }

    private void add(int i) {
        count += i;
    }
}
