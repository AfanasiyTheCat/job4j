package ru.job4j.loop;


/**
 * Counter.
 *
 * @author Nikita Shvetsov (mrdevislife2@mail.ru)
 * @version $1.0v$
 * @since 17.07.2019
 */

public class Counter {
    /**
     * Method add
     * @param start - first number
     * @param finish - last number
     * @return count of чётные numbers
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}