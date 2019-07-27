package ru.job4j.tracker;

import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StartUITest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }
    @Test
    public void whenUserReplaceItemThenTrackerHasNewItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test name", "decs", System.currentTimeMillis());
        tracker.add(item);
        Input input = new StubInput(new String[] {
                "2", item.getId(), "replaced", "desc", "y"
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
                "3", item.getId(), "y"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("second"));
    }
    @Test
    public void whenUserFindAll() {
        this.loadOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("test", "desc", System.currentTimeMillis());
        tracker.add(item);
        Input input = new StubInput(new String[] {
                "1", "y"
        }
        );
        new StartUI(input, tracker).init();
        Assert.assertThat(
                this.out.toString().split("\n")[7],
                Is.is("Имя: " + item.getName() +
                        ", Описание: " + item.getDecs() +
                        ", Время: " + item.getTime() +
                        ", ID: " + item.getId())
        );
        this.backOutput();
    }
    @Test
    public void whenUserFindByName() {
        this.loadOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("test", "desc", System.currentTimeMillis());
        tracker.add(item);
        Input input = new StubInput(new String[] {
                "5", item.getName(), "y"
        }
        );
        new StartUI(input, tracker).init();
        Assert.assertThat(
                this.out.toString().split("\n")[7],
                Is.is("Имя: " + item.getName() +
                        ", Описание: " + item.getDecs() +
                        ", Время: " + item.getTime() +
                        ", ID: " + item.getId())
        );
        this.backOutput();
    }
    @Test
    public void whenUserFindById() {
        this.loadOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("test", "desc", System.currentTimeMillis());
        tracker.add(item);
        Input input = new StubInput(new String[] {
                "4", item.getId(), "y"
        }
        );
        new StartUI(input, tracker).init();
        Assert.assertThat(
                this.out.toString().split("\n")[7],
                Is.is("Имя: " + item.getName() +
                        ", Описание: " + item.getDecs() +
                        ", Время: " + item.getTime() +
                        ", ID: " + item.getId())
        );
        this.backOutput();
    }
}
