package ru.job4j.loop;
/**
 * Mortgage.
 *
 * @author Nikita Shvetsov (mrdevislife2@mail.ru)
 * @version $1.0v$
 * @since 17.07.2019
 */
public class Mortgage {

    /**
     *
     * @param amount - долг.
     * @param monthly - ежемесячная плата.
     * @param percent - процент годовой.
     * @return - кол-во лет.
     */
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        for (; amount > 0; year++) {
            amount = (int) (amount * (percent / 100D + 1D));
            amount = amount - monthly * 12;
        }
        return year;
    }
}