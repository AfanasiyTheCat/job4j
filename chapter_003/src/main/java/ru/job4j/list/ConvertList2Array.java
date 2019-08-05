package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (list.size() + (rows - list.size() % rows)) / rows ;
        int[][] array = new int[rows][cells];
        int x = -1, y = 0;
        for (int i = 0; i < list.size(); i++) {
            if (x < cells - 1) {
                x++;
            } else {
                y++;
                x = 0;
            }
            array[y][x] = list.get(i);
        }
        return array;
    }
}