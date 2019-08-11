package ru.job4j.tracker;

import java.util.function.Consumer;

public class AddItem extends BaseAction {

    public AddItem(int key, String name, Consumer<String> output) {
        super(key, name, output);
    }

    public void execute(Input input, Tracker tracker) {
        Item item = new Item(
                input.ask("Введите имя заявки: "),
                input.ask("Введите описание заявки: "),
                System.currentTimeMillis()
        );
        if (tracker.add(item) == null) {
            output().accept("Ошибка: Трэкер переполнен.");
        }
    }
}
