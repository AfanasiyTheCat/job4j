package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class FindByNameItem extends BaseAction  {

    public FindByNameItem(int key, String info, Consumer<String> output) {
        super(key, info, output);
    }

    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Введите имя элемента для поиска: ");
        List<Item> items = tracker.findByName(name);
        if (items.get(0) != null) {
            for (Item item : items) {
                System.out.print("Имя: " + item.getName() + ", "
                        + "Описание: " + item.getDecs() + ", "
                        + "Время: " + item.getTime() + ", "
                        + "ID: " + item.getId() + "\n");
            }
        } else {
            output().accept("Элементов с таким именем не найдено");
        }
    }
}
