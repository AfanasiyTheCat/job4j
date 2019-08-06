package ru.job4j.list;

import java.util.ArrayList;
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
    public List<Integer> convert (List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length; j++) {
                result.add(list.get(i)[j]);
            }
        }
        return result;
    }

}