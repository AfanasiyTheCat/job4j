package ru.job4j.loop;

/**
 * Factorial.
 *
 * @author Nikita Shvetsov (mrdevislife2@mail.ru)
 * @version $1.0v$
 * @since 17.07.2019
 */

public class Factorial {
    /**
     *
     * @param n - number for factorial.
     * @return factorial of n number.
     */
    public int calc(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }
}