package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SingletonTest {
    @Test
    public void SingletonTracker1 () {
        SingletonTracker1 tracker1 = SingletonTracker1.INSTANCE;
        SingletonTracker1 tracker2 = SingletonTracker1.INSTANCE;
        assertThat(tracker1, is(tracker2));
    }
    @Test
    public void SingletonTracker2 () {
        SingletonTracker2 tracker1 = SingletonTracker2.getInstance();
        SingletonTracker2 tracker2 = SingletonTracker2.getInstance();
        assertThat(tracker1, is(tracker2));
    }
    @Test
    public void SingletonTracker3 () {
        SingletonTracker3 tracker1 = SingletonTracker3.getInstance();
        SingletonTracker3 tracker2 = SingletonTracker3.getInstance();
        assertThat(tracker1, is(tracker2));
    }
    @Test
    public void SingletonTracker4 () {
        SingletonTracker4 tracker1 = SingletonTracker4.getInstance();
        SingletonTracker4 tracker2 = SingletonTracker4.getInstance();
        assertThat(tracker1, is(tracker2));
    }
}
