package ru.job4j.array;

/**
 * @author Nikita Shvetsov
 * @version 1.0v
 * @since 18.07.2019
 */
public class Check {
    /**
     * Method mono
     * @param data - массив, который нужно проверить
     * @return - true, если все элементы true или false. В противном случае - false
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[0]){
                result = false;
                break;
            }
        }
        return result;
    }
}