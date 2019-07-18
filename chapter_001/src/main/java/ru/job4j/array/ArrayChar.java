package ru.job4j.array;

/**
 * @author NikitaShvetsov
 * @version 1.0v
 * @since 18.07.2019
 */
public class ArrayChar {

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        for (int i = 0; i < pref.length; i++){
            if (wrd[i] != pref[i]){
                result = false;
                break;
            }
        }
        return result;
    }
}