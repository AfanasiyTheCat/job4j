package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class FindAllItem extends BaseAction {

    public FindAllItem(int key, String info, Consumer<String> output) {
        super(key, info, output);
    }

    public void execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        if (items.get(0) != null) {
            for (Item item : items) {
                System.out.print("Имя: " + item.getName() + ", "
                        + "Описание: " + item.getDecs() + ", "
                        + "Время: " + item.getTime() + ", "
                        + "ID: " + item.getId() + "\n");
            }
        } else {
            output().accept("Трэкер пуст.");
        }
    }
}
