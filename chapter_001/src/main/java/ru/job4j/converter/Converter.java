package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value){
        return value * 70;
    }

    public static int dollarToRuble(int value){
        return value * 60;
    }

    public static void main(String[] args){
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
        System.out.println(dollar + " dollar are "+ ruble + " ruble Test result: " + passed);
    }
}
