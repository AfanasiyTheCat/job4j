package ru.job4j.calculate;

/**
 * Fit.
 *
 * @author Nikita Shvetsov
 * @version 1.0
 * @since 17.07.2019
 */
public class Fit {
    /**
     *
     * @param height - высота человека.
     * @return идеальный вес
     */
    public static double manWeight(double height) {
        return height * 1.15D;
    }
    /**
     *
     * @param height - высота человека.
     * @return идеальный вес.
     */

    public static double womanWeight(double height) {
        return height * 1.15D;
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        double man = manWeight(100);
        System.out.println("Man 100 is " + man);
        double woman = womanWeight(110);
        System.out.println("Woman 110 is " + woman);
    }
}
