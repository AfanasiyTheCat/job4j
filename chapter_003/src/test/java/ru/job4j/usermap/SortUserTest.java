package ru.job4j.usermap;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SortUserTest {
    @Test
    public void ThreeUsersByLength() {
        List<User> list = new ArrayList<>();
        User o1 = new User("nikita", 18);
        User o2 = new User("Alex", 23);
        User o3 = new User("Maria", 17);
        list.add(o1);
        list.add(o2);
        list.add(o3);
        SortUser sort = new SortUser();
        Set<User> expected = new TreeSet<>();
        expected.addAll(
                Arrays.asList(
                        o3, o1 , o2
                )
        );
        assertThat(sort.sort(list), is(expected));
    }
    @Test
    public void ThreeUsersTwoOfThenEqual() {
        List<User> list = new ArrayList<>();
        User o1 = new User("nikita", 18);
        User o2 = new User("Alex", 23);
        User o3 = new User("nikita", 18);
        list.add(o1);
        list.add(o2);
        list.add(o3);
        SortUser sort = new SortUser();
        Set<User> expected = new TreeSet<>();
        expected.addAll(
                Arrays.asList(
                        o1, o3 , o2
                )
        );
        assertThat(sort.sort(list), is(expected));
    }
    @Test
    public void ThreeUsersByName() {
        List<User> list = new ArrayList<>();
        User o1 = new User("Alex", 18);
        User o2 = new User("Tom", 23);
        User o3 = new User("Maria", 17);
        list.add(o1);
        list.add(o2);
        list.add(o3);
        SortUser sort = new SortUser();
        List<User> expected = new ArrayList<>();
        expected.add(o2);
        expected.add(o1);
        expected.add(o3);
        assertThat(sort.sortNameLength(list), is(expected));
    }
    @Test
    public void FourUsersByAll() {
        List<User> list = new ArrayList<>();
        User o1 = new User("Сергей", 25);
        User o2 = new User("Иван", 30);
        User o3 = new User("Сергей", 20);
        User o4 = new User("Иван", 25);
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        SortUser sort = new SortUser();
        List<User> expected = new ArrayList<>();
        expected.add(o4);
        expected.add(o2);
        expected.add(o3);
        expected.add(o1);
        assertThat(sort.sortByAllFields(list), is(expected));
    }
}
