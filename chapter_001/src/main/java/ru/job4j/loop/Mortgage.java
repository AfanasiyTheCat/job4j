package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        for (; amount > 0; year++){
            amount = (int) (amount * (percent / 100D + 1D));
            amount = amount - monthly * 12;
        }
        return year;
    }
}