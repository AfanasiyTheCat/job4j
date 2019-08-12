package ru.job4j.filter;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StudentListTest {
    @Test
    public void whenListToMap() {
        Student first = new Student("Shvetsov");
        Student second = new Student("Petrov");
        Student third = new Student("Ivanov");
        List<Student> list = Arrays.asList(first, second, third);
        StudentList students = new StudentList(list);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Shvetsov", first);
        expected.put("Petrov", second);
        expected.put("Ivanov", third);
        assertThat(students.getMap(), is(expected));
    }
}
