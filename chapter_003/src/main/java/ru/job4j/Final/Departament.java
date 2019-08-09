package ru.job4j.Final;

import java.util.ArrayList;
import java.util.List;

public class Departament {
    private List<String> list = new ArrayList<>();

    public Departament(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
