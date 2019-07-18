package ru.job4j.array;

/**
 * @author Nikita Shvetsov.
 * @version 1.0
 * @since 18.07.2019
 */
public class Matrix {
    /**
     *
     * @param size - размер таблицы.
     * @return - таблица умножения.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
