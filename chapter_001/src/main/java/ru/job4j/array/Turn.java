package ru.job4j.array;

/**
 * @author Nikita Shvetsov.
 * @version 1.0
 * @since 18.07.2019
 */
public class Turn {
    /**
     * Method back.
     * @param array - массив.
     * @return - перевёрнутый массив.
     */
    public int[] back(int[] array) {
        int center = array.length % 2 == 0 ? array.length / 2 : (array.length - 1) / 2;
        for (int i = 0; i < center; i++) {
            int x = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = x;
        }
        return array;
    }
}