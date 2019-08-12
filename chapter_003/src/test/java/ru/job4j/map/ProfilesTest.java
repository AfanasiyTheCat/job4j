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
        Address tumen = new Address("Тюмень", "Мельникайте", 43, 202);
        Profile first = new Profile(tumen);
        Profile second = first;
        Profile third = new Profile(new Address(
                "Астана", "Пушкина", 5, 67
        ));
        List<Profile> profiles = Arrays.asList(first, second, third);
        List<Address> expected = Arrays.asList(third.getAddress(),
                first.getAddress());
        Profiles test = new Profiles();
        assertThat(test.collect(profiles), is(expected));
    }
}
