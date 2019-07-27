package ru.job4j.tracker;

public class StartUI {
    private static final String ADD = "0";
    private static final String ALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FIND_ID = "4";
    private static final String FIND_NAME = "5";
    private static final String EXIT = "6";
    private Tracker tracker;
    private Input input;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    private String start() {
        return input.ask("0. Добавить заявку\n"
                + "1. Показать все заявки\n"
                + "2. Редактировать заявку\n"
                + "3. Удалить заявку\n"
                + "4. Поиск заявки по ID\n"
                + "5. Поиск заявки по имени\n"
                + "6. Выход\n"
                + "Select: ");
    }

    private boolean add() {
        boolean result = false;
        Item item = new Item(
                input.ask("Введите имя заявки: "),
                input.ask("Введите описание заявки: "),
                System.currentTimeMillis()
        );
        if (tracker.add(item) != null) {
            result = true;
        } else {
            System.out.println("Ошибка: Трэкер переполнен.");
        }
        return result;
    }

    private void all() {
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

    private boolean edit() {
        boolean result = false;
        String choose = input.ask("Введите ID элемента, который нужно изменить: ");
        Item item = new Item(
                input.ask("Введите имя новой заявки: "),
                input.ask("Введите описание новой заявки: "),
                System.currentTimeMillis()
        );
        if (tracker.replace(choose, item)) {
            result = true;
        } else {
            System.out.println("Элемент не найден.");
        }
        return result;
    }

    private boolean delete() {
        boolean result = false;
        String choose = input.ask("Введите ID элемента, который нужно удалить: ");
        if (tracker.delete(choose)) {
            result = true;
        } else {
            System.out.println("Элемент не найден.");
        }
        return result;
    }

    private boolean findId() {
        boolean result = false;
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
        return result;
    }

    private boolean findName() {
        boolean result = false;
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
        return result;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(Integer.valueOf(input.ask("select:")));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }

    public static void main(String[] args) {
        StartUI ui = new StartUI(new ConsoleInput(), new Tracker());
        ui.init();
    }
}
