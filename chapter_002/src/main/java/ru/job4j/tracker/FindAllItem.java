package ru.job4j.tracker;

public class FindAllItem implements UserAction  {
    private int key;
    private String info;

    public FindAllItem(int key, String info) {
        this.key = key;
        this.info = info;
    }

    public int key() {
        return key;
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

    public String info() {
        return String.format("%s. %s", key, info);
    }
}
