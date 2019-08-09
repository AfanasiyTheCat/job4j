package ru.job4j.Final;

import java.util.Comparator;
import java.util.List;

public class DepartamentSort {

    public List<String> sortIncrease (List<String> list) {
        list = completeArray(list);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return list;
    }

    public List<String> sortDecrease (List<String> list) {
        list = completeArray(list);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.compareTo(o2) * -1);
            }
        });
        return list;
    }

    public List<String> completeArray(List<String> list) {
        String[] listArray = new String[list.size()];
        listArray = list.toArray(listArray);
        for (String s : listArray) {
            String[] splits = s.split("\\\\");
            String actual = "";
            for (int i = 0; i < splits.length; i++) {
                if (i == 0) {
                    actual = splits[i];
                } else {
                    actual = actual + "\\" + splits[i];
                }
                if (!list.contains(actual)) {
                    list.add(actual);
                }
            }
        }
        return list;
    }
}
