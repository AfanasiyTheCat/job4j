package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {
    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

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
