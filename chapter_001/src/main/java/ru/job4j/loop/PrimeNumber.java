package ru.job4j.loop;

/**
 * PrimeNumber.
 *
 * @author Nikita Shvetsov (mrdevislife2@mail.ru)
 * @version $1.0v$
 * @since 17.07.2019
 */
public class PrimeNumber {
    /**
     *
     * @param finish - end of numbers.
     * @return - coint for prime numbers.
     */
    public int calc(int finish) {
        int count = 0;
        boolean flag = true;
        for (int i = 2; i <= finish; i++) {
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                count++;
            }
            flag = true;
        }
        return count;
    }
}