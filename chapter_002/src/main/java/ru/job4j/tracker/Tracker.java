package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private Item[] items = new Item[100];
    private int count = 0;

    public Item add(Item item) {
        Item result = null;
        if (count <= 100) {
            items[count] = item;
            count++;
            result = item;
        }
        return result;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = findIndexById(id);
        if (index != -1) {
            items[index] = item;
            result = true;
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        int index = findIndexById(id);
        if (index != -1) {
            System.arraycopy(this.items, index + 1, this.items, index, 99 - index);
            items[99] = null;
            count--;
        }
        return result;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.count);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[100];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (items[i].getName().equals(key)) {
                result[index] = items[i];
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }

    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < count; i++) {
            if (items[i] != null) {
                if (items[i].getId().equals(id)) {
                    result = items[i];
                    break;
                }
            }
        }
        return result;
    }

    public int findIndexById(String id) {
        int result = -1;
        for (int i = 0; i < count; i++) {
            if (items[i] != null) {
                if (items[i].getId().equals(id)) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}
