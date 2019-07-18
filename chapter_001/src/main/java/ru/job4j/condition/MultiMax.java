package ru.job4j.condition;
/**
 * MultiMax.
 * @author Nikita Shvetsov
 * @version $1.0$
 * @since 16.07.2019
 */
public class MultiMax {
    /**
     *
     * @param first - number.
     * @param second - number.
     * @param third - number.
     * @return result.
     */
    public int max(int first, int second, int third) {
        int result;
        if (first > second && first > third) {
            result = first;
        } else if (second > first && second > third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }
}