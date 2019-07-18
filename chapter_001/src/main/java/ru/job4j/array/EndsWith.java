package ru.job4j.array;

/**
 * @author Nikita Shvetsov.
 * @version 1.0
 * @since 18.07.2019
 */
public class EndsWith {

    /**
     * Проверяет. что слово заканчивается на префик.
     * @param post префикс.
     * @return если слово заканчивается с префикс.
     */
    public boolean endsWith(String word, String post) {
        boolean result = true;
        char[] pst = post.toCharArray();
        char[] wrd = word.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        for (int i = 0; i < pst.length; i++) {
            if (wrd[wrd.length - i - 1] != pst[pst.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}