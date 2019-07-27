package ru.job4j.tracker;

public class FindByIdItem implements UserAction  {
    private int key;
    private String info;

    public FindByIdItem(int key, String info) {
        this.key = key;
        this.info = info;
    }

    public int key() {
        return key;
    }

    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Введите ID элемента для поиска: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.print("Имя: " + item.getName() + ", "
                    + "Описание: " + item.getDecs() + ", "
                    + "Время: " + item.getTime() + ", "
                    + "ID: " + item.getId() + "\n");
        } else {
            System.out.println("Элементов с таким ID не найдено.");
        }
    }

    public String info() {
        return String.format("%s. %s", key, info);
    }
}
