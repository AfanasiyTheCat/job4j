package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private List<Item> items = new ArrayList<>();
    private int count = 0;

    public Item add(Item item) {
        Item result = null;
        if (count <= 100) {
            items.add(count, item);
            count++;
            result = item;
        }
        return result;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = findIndexById(id);
        if (index != -1) {
            items.add(index, item);
            result = true;
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        int index = findIndexById(id);
        if (index != -1) {
            items.remove(index);
            //System.arraycopy(this.items.toArray(new Item[items.size()]), index + 1, this.items.toArray(new Item[items.size()]), index, 99 - index);
            //items.add(99, null);
            count--;
        }
        return result;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (items.get(i).getName().equals(key)) {
                result.set(index, items.get(i));
                index++;
            }
        }
        return result;
    }

    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < count; i++) {
            if (items.get(i) != null) {
                if (items.get(i).getId().equals(id)) {
                    result = items.get(i);
                    break;
                }
            }
        }
        return result;
    }

    public int findIndexById(String id) {
        int result = -1;
        for (int i = 0; i < count; i++) {
            if (items.get(i) != null) {
                if (items.get(i).getId().equals(id)) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}
