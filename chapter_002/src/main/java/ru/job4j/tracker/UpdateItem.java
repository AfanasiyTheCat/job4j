package ru.job4j.tracker;

import java.util.function.Consumer;

public class UpdateItem extends BaseAction {

    public UpdateItem(int key, String info, Consumer<String> output) {
        super(key, info, output);
    }

    public void execute(Input input, Tracker tracker) {
        String choose = input.ask("Введите ID элемента, который нужно изменить: ");
        Item item = new Item(
                input.ask("Введите имя новой заявки: "),
                input.ask("Введите описание новой заявки: "),
                System.currentTimeMillis()
        );
        if (!tracker.replace(choose, item)) {
            output().accept("Элемент не найден.");
        }
    }
}
