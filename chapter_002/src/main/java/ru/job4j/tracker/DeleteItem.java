package ru.job4j.tracker;

import java.util.function.Consumer;

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name, Consumer<String> output) {
        super(key, name, output);
    }

    public void execute(Input input, Tracker tracker) {
        String choose = input.ask("Введите ID элемента, который нужно удалить: ");
        if (!tracker.delete(choose)) {
            output().accept("Элемент не найден.");
        }
    }
}
