package ru.job4j.tracker;

public class AddItem extends BaseAction {

    public AddItem(int key, String name) {
        super(key, name);
    }

    public void execute(Input input, Tracker tracker) {
        Item item = new Item(
                input.ask("Введите имя заявки: "),
                input.ask("Введите описание заявки: "),
                System.currentTimeMillis()
        );
        if (tracker.add(item) == null) {
            System.out.println("Ошибка: Трэкер переполнен.");
        }
    }
}
