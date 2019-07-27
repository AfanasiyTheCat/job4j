package ru.job4j.tracker;

public class UpdateItem implements UserAction {
    private int key;
    private String info;

    public UpdateItem(int key, String info) {
        this.key = key;
        this.info = info;
    }

    public int key() {
        return key;
    }

    public void execute(Input input, Tracker tracker) {
        String choose = input.ask("Введите ID элемента, который нужно изменить: ");
        Item item = new Item(
                input.ask("Введите имя новой заявки: "),
                input.ask("Введите описание новой заявки: "),
                System.currentTimeMillis()
        );
        if (!tracker.replace(choose, item)) {
            System.out.println("Элемент не найден.");
        }
    }

    public String info() {
        return String.format("%s. %s", key, info);
    }
}
