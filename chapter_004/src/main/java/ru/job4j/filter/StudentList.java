package ru.job4j.filter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentList {
    private Map<String, Student> list = new HashMap<>();

    public StudentList(List<Student> list) {
        this.list = list.stream().distinct().collect(Collectors.toMap(
                Student::getSurname,
                Student -> Student
        ));
    }

    public Map<String, Student> getMap() {
        return list;
    }
}
