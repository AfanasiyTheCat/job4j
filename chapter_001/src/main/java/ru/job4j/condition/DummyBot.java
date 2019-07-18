package ru.job4j.condition;

/**
 * DummyBot.
 * @author Nikita Shvetsov
 * @version $1.0$
 * @since 16.07.2019
 */

public class DummyBot {
    /**
     *
     * @param question - вопрос для бота.
     * @return ответа бота.
     */

    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";

        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}