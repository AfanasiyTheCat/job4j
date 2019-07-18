package ru.job4j.array;

/**
 * @author Nikita Shvetsov
 * @version 1.0v
 * @since 18.07.2019
 */

public class MatrixCheck {
    /**
     * Проверка: являются ли диагонали true или false
     * @param data - массив для проверки
     * @return - true, если диагонали являются true или false, иначе - false
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i][i] != data[0][0]){
                result = false;
                break;
            }
            if (data[i][data.length - i - 1] != data[0][data.length - 0 -1]){
                result = false;
                break;
            }
        }
        return result;
    }
}