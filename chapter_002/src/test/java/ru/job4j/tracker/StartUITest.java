package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StartUITest {
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }
    @Test
    public void whenUserReplaceItemThenTrackerHasNewItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test name", "decs", System.currentTimeMillis());
        tracker.add(item);
        Input input = new StubInput(new String[] {
                "2", item.getId(), "replaced", "desc", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("replaced"));
    }
    @Test
    public void whenUserRemoveItemThenTrackerHasNotItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("first", "decs", System.currentTimeMillis());
        Item item2 = new Item("second", "decs", System.currentTimeMillis());
        tracker.add(item);
        tracker.add(item2);
        Input input = new StubInput(new String[] {
                "3", item.getId(), "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("second"));
    }
}
