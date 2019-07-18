package ru.job4j.condition;
/**
 * SqMax.
 * @author Nikita Shvetsov
 * @version $1.0$
 * @since 16.07.2019
 */
public class SqMax {
    /**
     *
     * @param first - 1.
     * @param second - 2.
     * @param third - 3.
     * @param forth - 4.
     * @return result.
     */
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                }
            }
        } else if (second > third) {
            if (second > forth) {
                result = second;
            }
        } else if (third > forth) {
            result = third;
        }
        return result;
    }
}