package ru.job4j.converter;
/**
 * Converter.
 * @author Nikita Shvetsov
 * @version $1.0$
 */
public class Converter {
    /**
     *
     * @param value - рубли.
     * @return евро.
     */

    public static int rubleToEuro(int value) {
        return value / 70;
    }
    /**
     *
     * @param value - рубли.
     * @return доллары.
     */


    public static int rubleToDollar(int value) {
        return value / 60;
    }
    /**
     *
     * @param value - евро.
     * @return рубли.
     */


    public static int euroToRuble(int value) {
        return value * 70;
    }
    /**
     *
     * @param value - доллары.
     * @return рубли.
     */


    public static int dollarToRuble(int value) {
        return value * 60;
    }

    /**
     * Main.
     * @param args - args
     */

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        boolean passed;
        int euro = rubleToEuro(in);
        int out = euro;
        passed = out == expected;
        System.out.println("140 rubles are " + euro + " euro. Test result: " + passed);
        int dollar = rubleToDollar(in);
        out = dollar;
        passed = out == expected;
        System.out.println("120 ruble are " + dollar + " dollar. Test result: " + passed);

        expected = 140;
        int ruble = euroToRuble(euro);
        out = ruble;
        passed = out == expected;
        System.out.println(euro + " euro are " + ruble + " ruble Test result: " + passed);

        expected = 140;
        ruble = dollarToRuble(dollar);
        out = ruble;
        passed = out == expected;
        System.out.println(dollar + " dollar are " + ruble + " ruble Test result: " + passed);
    }
}
