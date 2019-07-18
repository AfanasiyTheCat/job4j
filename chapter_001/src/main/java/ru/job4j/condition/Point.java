package ru.job4j.condition;
/**
 * Distance.
 * @author Nikita Shvetsov
 * @version $1.0$
 * @since 16.07.2019
 */
public class Point {
    /**
     *
     * @param x1 - точка 1.
     * @param y1 - точка 1.
     * @param x2 - точка 2.
     * @param y2 - точка 2.
     * @return расстояние между точками.
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Main.
     * @param args - args
     */
    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = distance(5, 2, 9, 3);
        System.out.println("result (5,2) to (9,3) " + result);
        result = distance(2, 8, 3, 6);
        System.out.println("result (2,8) to (3,6) " + result);
        result = distance(34, 23, 76, 94);
        System.out.println("result (34, 23) to (76, 94) " + result);
    }
}
