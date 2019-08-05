package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (list.size() + (rows - list.size() % rows)) / rows ;
        int cell = 0;
        int[][] array = new int[rows][cells];
        for (int[] i : array) {
            for (int j = 0; j < i.length; j++) {
                if (cell < list.size()) {
                    i[j] = list.get(cell);
                } else {
                    i[j] = 0;
                }
                cell++;
            }
        }
        return array;
    }
}