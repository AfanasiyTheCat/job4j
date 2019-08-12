package ru.job4j.map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProfilesTest {
    @Test
    public void when3profiles() {
        Profile first = new Profile(new Address(
                "Тюмень", "Мельникайте", 43, 202
        ));
        Profile second = new Profile(new Address(
                "Тюмень", "Профсоюзная", 22, 1
        ));
        Profile third = new Profile(new Address(
                "Москва", "Пушкина", 5, 67
        ));
        List<Profile> profiles = Arrays.asList(first, second, third);
        List<Address> expected = Arrays.asList(first.getAddress(),
                second.getAddress(), third.getAddress());
        Profiles test = new Profiles();
        assertThat(test.collect(profiles), is(expected));
    }
}
