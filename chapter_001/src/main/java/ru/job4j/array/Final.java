package ru.job4j.array;

/**
 * @author Nikita Shvetsov.
 * @version 1.0.
 * @since 22.07.2019.
 */
public class Final {

    public int[] sort(int[] data1, int[] data2) {
        int[] result = new int[data1.length + data2.length];
        for (int i = 0, j = 0; i < data1.length || j < data2.length;) {
            if (i != data1.length && j != data2.length) {
                if (data1[i] < data2[j]) {
                    result[i + j] = data1[i];
                    i++;
                } else {
                    result[i + j] = data2[j];
                    j++;
                }
            } else if (i == data1.length && j != data2.length) {
                result[i + j] = data2[j];
                j++;
            } else if (i != data1.length && j == data2.length) {
                result[i + j] = data1[i];
                i++;
            }
        }
        return result;
    }
}
