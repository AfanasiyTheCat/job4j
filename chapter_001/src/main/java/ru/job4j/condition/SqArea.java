package ru.job4j.condition;
/**
 * Square.
 * @author Nikita Shvetsov
 * @version $1.0$
 * @since 16.07.2019
 */
public class SqArea {
    /**
     *
     * @param p - периметр.
     * @param k - коэффицент.
     * @return - площадь.
     */
    public static int square(int p, int k) {
        return ((p / 2) / (k + 1)) * (p / 2) / (k + 1) * k;
    }

    public static void main(String[] args) {
        int result1 = square(4,  1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        int result2 = square(6, 2);
        System.out.println(" p  = 6, k = 2, s = 2, real = " + result2);
    }
}
