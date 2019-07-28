package ru.job4j.tracker;

public class UpdateItem extends BaseAction {

    public UpdateItem(int key, String info) {
        super(key, info);
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
}
