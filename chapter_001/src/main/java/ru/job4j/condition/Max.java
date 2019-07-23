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
    public int max(int left, int middle, int right) {
        int result = -1;
        if(left > middle && left > right) {
            result = left;
        } else if (middle > left && middle > right) {
            result = middle;
        } else if (right > left && right > middle) {
            result = right;
        }
        return result;
    }
}