package ru.job4j.usermap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class UserConvertTest {
    @Test
    public void when2Users() {
        User first = new User("Nikita", "Tumen");
        User second = new User("Alex", "London");
        List<User> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        UserConvert convert = new UserConvert();
        HashMap<Integer, User> expected = new HashMap<>();
        expected.put(first.getId(), first);
        expected.put(second.getId(), second);
        assertThat(convert.process(list), is(expected));
    }
    @Test
    public void whenRewriteUser() {
        User first = new User("Nikita", "Tumen");
        User newFirst = new User("Alex", "London", first.getId());
        List<User> list = new ArrayList<>();
        list.add(first);
        list.add(newFirst);
        UserConvert convert = new UserConvert();
        HashMap<Integer, User> expected = new HashMap<>();
        expected.put(first.getId(), first);
        expected.put(newFirst.getId(), newFirst);
        assertThat(convert.process(list), is(expected));
    }
}
