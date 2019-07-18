package ru.job4j.loop;

/**
 * BoardTest.
 *
 * @author Nikita Shvetsov (mrdevislife2@mail.ru)
 * @version $1.0v$
 * @since 17.07.2019
 */
public class Fitness {
    /**
     * Method calc
     * @param ivan - ivan's mass.
     * @param nik - nik's mass.
     * @return moths, after which.
     */
    public int calc(int ivan, int nik) {
        int month = 0;
        for (; ivan <= nik; month++) {
            ivan = ivan * 3;
            nik = nik * 2;
        }
        return month;
    }
}