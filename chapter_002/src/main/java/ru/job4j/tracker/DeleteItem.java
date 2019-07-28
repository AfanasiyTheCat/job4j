package ru.job4j.tracker;

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
    }

    public void execute(Input input, Tracker tracker) {
        String choose = input.ask("Введите ID элемента, который нужно удалить: ");
        if (!tracker.delete(choose)) {
            System.out.println("Элемент не найден.");
        }
    }
}
