package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        for (; ivan <= nik; month++){
            ivan = ivan * 3;
            nik = nik * 2;
        }
        return month;
    }
}