package ru.job4j.usermap;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SortUserTest {
    @Test
    public void ThreeUsersByLength() {
        User o1 = new User("nikita", 18);
        User o2 = new User("Alex", 23);
        User o3 = new User("Maria", 17);
        List<User> list = List.of(o1, o2, o3);
        SortUser sort = new SortUser();
        Set<User> expected = Set.of(o3, o1, o2);
        assertThat(sort.sort(list), is(expected));
    }
    @Test
    public void ThreeUsersTwoOfThenEqual() {
        User o1 = new User("nikita", 18);
        User o2 = new User("Alex", 23);
        User o3 = new User("nikita", 18);
        List<User> list = List.of(o1, o2, o3);
        SortUser sort = new SortUser();
        Set<User> expected = Set.of(o1, o3, o2);
        assertThat(sort.sort(list), is(expected));
    }
    @Test
    public void ThreeUsersByName() {
        User o1 = new User("Alex", 18);
        User o2 = new User("Tom", 23);
        User o3 = new User("Maria", 17);
        List<User> list = List.of(o1, o2, o3);
        SortUser sort = new SortUser();
        Set<User> expected = Set.of(o2, o1, o3);
        assertThat(sort.sortNameLength(list), is(expected));
    }
    @Test
    public void FourUsersByAll() {
        User o1 = new User("Сергей", 25);
        User o2 = new User("Иван", 30);
        User o3 = new User("Сергей", 20);
        User o4 = new User("Иван", 25);
        List<User> list = List.of(o1, o2, o3, o4);
        SortUser sort = new SortUser();
        Set<User> expected = Set.of(o4, o2, o3, o1);
        assertThat(sort.sortByAllFields(list), is(expected));
    }
}
