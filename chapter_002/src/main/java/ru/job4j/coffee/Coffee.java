package ru.job4j.coffee;

import java.util.Arrays;

/**
 * Кофейная машина
 */

public class Coffee {

    /**
     * coins - виды монет для сдачи.
     * change - остаток, который нужнно выдать.
     * result - массив с монетами для остатка.
     * countCoins - кол-во монет в result.
     */

    private int [] coins = new int[] {10, 5 ,2 ,1};
    private int change;
    private int[] result;
    private int countCoins = 0;
    /**
     * Method changes - получение сдачи с кофе.
     * @param value - купюра для оплаты.
     * @param price - цена кофе.
     * @return - массив с монетами.
     */
    public int [] changes(int value, int price) {
        change = value - price;
        result = new int[change];
        if (value > price) {
            for (int coin = 0; change != 0; coin++) {
                add(coins[coin], change / coins[coin]);
                change = change % coins[coin];
            }
        }
        if (countCoins == 0) {
            countCoins = 1;
        }
        return Arrays.copyOf(result, countCoins);
    }

    /**
     * Method add - добавление монет в result
     * @param coin - монета, которую нужно добавить.
     * @param count - кол-во этих монет.
     */
    private void add(int coin, int count) {
        countCoins = countCoins + count;
        for(int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                result[i] = coin;
                count--;
                if (count == 0) {
                    break;
                }
            }
        }
    }
}
