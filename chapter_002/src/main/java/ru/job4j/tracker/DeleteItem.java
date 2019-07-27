package ru.job4j.tracker;

public class DeleteItem implements UserAction  {
    private int key;
    private String info;

    public DeleteItem(int key, String info) {
        this.key = key;
        this.info = info;
    }

    public int key() {
        return key;
    }

    public void execute(Input input, Tracker tracker) {
        String choose = input.ask("Введите ID элемента, который нужно удалить: ");
        if (!tracker.delete(choose)) {
            System.out.println("Элемент не найден.");
        }
    }

    public String info() {
        return String.format("%s. %s", key, info);
    }
}
