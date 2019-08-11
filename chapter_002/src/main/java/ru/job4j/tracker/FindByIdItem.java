package ru.job4j.tracker;

import java.util.function.Consumer;

public class FindByIdItem extends BaseAction  {

    public FindByIdItem(int key, String info, Consumer<String> output) {
        super(key, info, output);
    }

    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Введите ID элемента для поиска: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.print("Имя: " + item.getName() + ", "
                    + "Описание: " + item.getDecs() + ", "
                    + "Время: " + item.getTime() + ", "
                    + "ID: " + item.getId() + "\n");
        } else {
            output().accept("Элементов с таким ID не найдено.");
        }
    }
}
