package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {
    @Override
    public int ask(String question, int[] range) {
        boolean valid = true;
        do {
            try {
                return super.ask(question, range);
            } catch(NumberFormatException nfe) {
                System.out.println("Введите правильный ответ");
            } catch(MenuOutException moe) {
                System.out.println("Введите число из меню");
            }
        } while (valid);
        return -1;
    }
}
