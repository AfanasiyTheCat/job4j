package ru.job4j.usermap;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SortUserTest {
    @Test
    public void ThreeUsers() {
        User o1 = new User("nikita", 18);
        User o2 = new User("Alex", 23);
        User o3 = new User("Maria", 17);
        List<User> list = List.of(o1, o2, o3);
        SortUser sort = new SortUser();
        Set<User> expected = Set.of(o3, o1 , o2);
        assertThat(sort.sort(list), is(expected));
    }
    @Test
    public void ThreeUsersTwoOfThenEqual() {
        User o1 = new User("nikita", 18);
        User o2 = new User("Alex", 23);
        User o3 = new User("nikita", 18);
        List<User> list = List.of(o1, o2, o3);
        SortUser sort = new SortUser();
        Set<User> expected = new TreeSet<>();
        expected.addAll(
                Arrays.asList(
                        o1, o3 , o2
                )
        );
        assertThat(sort.sort(list), is(expected));
    }
}
