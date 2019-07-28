package ru.job4j.tracker;

public class FindByIdItem extends BaseAction  {

    public FindByIdItem(int key, String info) {
        super(key, info);
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
}
