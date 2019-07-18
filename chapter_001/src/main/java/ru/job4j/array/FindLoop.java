package ru.job4j.array;

/**
 * @author Nikita Shetsov
 * @version 1.0v
 * @since 18.07.2019
 */
public class FindLoop {
    /**
     * @Method indexOf
     * @param data - массив для поиска
     * @param el - элемент, которые нужно найти
     * @return - индекс нужного элемента
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = start; i <= finish; i++){
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}