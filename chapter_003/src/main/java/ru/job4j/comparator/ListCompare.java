package ru.job4j.comparator;

import java.util.Comparator;


public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = -2;
        int length = left.length() > right.length() ? right.length() : left.length();
        for (int i = 0; i < length; i++) {
            result = Character.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                break;
            } else {
                result = -2;
                continue;
            }
        }
        if (result == -2) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}
