package ru.job4j.tracker;

public class AddItem implements UserAction {
    private int key;
    private String info;

    public AddItem(int key, String info) {
        this.key = key;
        this.info = info;
    }

    public int key() {
        return key;
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

    public String info() {
        return String.format("%s. %s", key, info);
    }
}
