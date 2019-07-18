package ru.job4j.array;

/**
 * @author Nikita Shvetsov
 * @version 1.0v
 * @since 18.07.2019
 */
public class Square {
    /**
     * Method calculate
     * @param bound - конец массива с числами, возведёнными в квадрат
     * @return массив с квадратами числел от 1 до bound
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 0; i < bound; i++){
            rst[i] = (i+1) * (i+1);
        }
        return rst;
    }
}