package ru.job4j.array;

/**
 * @author Nikita Shvetsov.
 * @version 1.0.
 * @since 22.07.2019.
 */
public class Final {

    public int[] sort(int[] data1, int[] data2) {
        int[] result = new int[data1.length * 2];
        for (int i = 0, j = 0; i < data1.length; i++, j = j + 2) {
            if (data1[i] < data2[i]) {
                result[j] = data1[i];
                result[j + 1] = data2[i];
            } else {
                result[j] = data2[i];
                result[j + 1] = data1[i];
            }
        }
        return result;
    }
}
