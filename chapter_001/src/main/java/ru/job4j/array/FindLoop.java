package ru.job4j.array;

/**
 * @author Nikita Shetsov.
 * @version 1.0
 * @since 18.07.2019
 */
public class FindLoop {
    /**
     * @Method indexOf.
     * @param data - массив для поиска.
     * @param el - элемент, которые нужно найти.
     * @return - индекс нужного элемента.
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

    /**
     *
     * @param data - массив для поиска.
     * @param el - элемент,который нужно найти.
     * @param start - индекс, с которого начинать поиск.
     * @param finish - индекс, которым заканчивать поиск.
     * @return - индекс нужного элемента.
     */
    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    /**
     *
     * @param data - массив для сортировка.
     * @return - отсортированный массив.
     */
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            for (int j = i + 1; j < data.length; j++) {
                min = data[j] < min ? data[j] : min;
            }
            int x = data[this.indexOf(data, min, i, data.length - 1)];
            data[this.indexOf(data, min, i, data.length - 1)] = data[i];
            data[i] = x;
        }
        return data;
    }
}