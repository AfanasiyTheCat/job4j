package ru.job4j.condition;
/**
 * Max.
 * @author Nikita Shvetsov
 * @version $1.0$
 * @since 16.07.2019
 */
public class Max {
    /**
     *
     * @param left - первый аргумент.
     * @param right - второй аргумент.
     * @return результат.
     */
    public int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}