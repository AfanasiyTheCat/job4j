package ru.job4j.tracker;

public class FindAllItem extends BaseAction {

    public FindAllItem(int key, String info) {
        super(key, info);
    }

    public void execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items[0] != null) {
            for (Item item : items) {
                System.out.print("Имя: " + item.getName() + ", "
                        + "Описание: " + item.getDecs() + ", "
                        + "Время: " + item.getTime() + ", "
                        + "ID: " + item.getId() + "\n");
            }
        } else {
            System.out.println("Трэкер пуст.");
        }
    }
}
