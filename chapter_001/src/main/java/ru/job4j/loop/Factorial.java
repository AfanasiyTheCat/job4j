package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--){
            result = result * i;
        }
        return result;
    }
}