package ru.job4j.filter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SchoolTest {
    @Test
    public void when10A() {
        List<Student> students = Arrays.asList(
                new Student(10),
                new Student(20),
                new Student(30),
                new Student(40),
                new Student(50),
                new Student(60),
                new Student(70),
                new Student(80),
                new Student(90),
                new Student(100)
        );
        School school = new School();
        List<Student> actual = school.collect(students, student -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> expected = Arrays.asList(
                new Student(70),
                new Student(80),
                new Student(90),
                new Student(100)
        );
        assertThat(actual.get(2).getScore(), is(expected.get(2).getScore()));
    }
    @Test
    public void when10B() {
        List<Student> students = Arrays.asList(
                new Student(10),
                new Student(20),
                new Student(30),
                new Student(40),
                new Student(50),
                new Student(60),
                new Student(70),
                new Student(80),
                new Student(90),
                new Student(100)
        );
        School school = new School();
        List<Student> actual = school.collect(students, student -> student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expected = Arrays.asList(
                new Student(50),
                new Student(60)
        );
        assertThat(actual.get(1).getScore(), is(expected.get(1).getScore()));
    }
    @Test
    public void when10C() {
        List<Student> students = Arrays.asList(
                new Student(10),
                new Student(20),
                new Student(30),
                new Student(40),
                new Student(50),
                new Student(60),
                new Student(70),
                new Student(80),
                new Student(90),
                new Student(100)
        );
        School school = new School();
        List<Student> actual = school.collect(students, student -> student.getScore() > 0 && student.getScore() < 50);
        List<Student> expected = Arrays.asList(
                new Student(10),
                new Student(20),
                new Student(30),
                new Student(40)
        );
        assertThat(actual.get(2).getScore(), is(expected.get(2).getScore()));
    }
}
