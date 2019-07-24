package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1","testDescription",created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1","testDescription",123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2","testDescription2",1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test", "test...", System.currentTimeMillis());
        tracker.add(item);
        tracker.delete(item.getId());
        assertThat(tracker.findIndexById(item.getId()), is(-1));
    }

    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test", "test...", System.currentTimeMillis());
        tracker.add(item);
        assertThat(tracker.findAll()[0].getName(), is("Test"));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Test1", "test...", System.currentTimeMillis());
        Item item2 = new Item("Test2", "test...", System.currentTimeMillis());
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.findByName(item2.getName())[0].getId(), is(item2.getId()));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Test1", "test...", System.currentTimeMillis());
        Item item2 = new Item("Test2", "test...", System.currentTimeMillis());
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.findById(item2.getId()).getName(), is(item2.getName()));
    }

    @Test
    public void whenFindIndexById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Test1", "test...", System.currentTimeMillis());
        Item item2 = new Item("Test2", "test...", System.currentTimeMillis());
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.findIndexById(item2.getId()), is(1));
    }
}
