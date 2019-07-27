package ru.job4j.tracker;

public class FindByNameItem implements UserAction  {
    private int key;
    private String info;

    public FindByNameItem(int key, String info) {
        this.key = key;
        this.info = info;
    }

    public int key() {
        return key;
    }

    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Введите имя элемента для поиска: ");
        Item[] items = tracker.findByName(name);
        if (items[0] != null) {
            for (Item item : items) {
                System.out.print("Имя: " + item.getName() + ", "
                        + "Описание: " + item.getDecs() + ", "
                        + "Время: " + item.getTime() + ", "
                        + "ID: " + item.getId() + "\n");
            }
        } else {
            System.out.println("Элементов с таким именем не найдено");
        }
    }

    public String info() {
        return String.format("%s. %s", key, info);
    }
}
