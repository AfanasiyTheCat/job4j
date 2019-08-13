package ru.job4j.filter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    private int scope;
    private String name;

    public Student(int score, String name) {
        this.scope = score;
        this.name = name;
    }

    public int getScope() {
        return scope;
    }

    public String getName() {
        return name;
    }

    List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }).flatMap(Stream::ofNullable)
                .takeWhile(student -> student.getScope() > bound)
                .map(student -> student)
                .collect(Collectors.toList());

    }
}
