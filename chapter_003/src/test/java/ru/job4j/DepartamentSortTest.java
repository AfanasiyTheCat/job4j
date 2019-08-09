package ru.job4j;

import org.junit.Test;
import ru.job4j.Final.Departament;
import ru.job4j.Final.DepartamentSort;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DepartamentSortTest {
    @Test
    public void whenSortIncrease() {
        DepartamentSort sort = new DepartamentSort();
        List<String> list = new ArrayList<>();
        list.add("K1\\SK1");
        list.add("K1\\SK2");
        list.add("K1\\SK1\\SSK1");
        list.add("K1\\SK1\\SSK2");
        list.add("K2");
        list.add("K2\\SK1\\SSK1");
        list.add("K2\\SK1\\SSK2");
        Departament dep = new Departament(list);
        dep.setList(sort.sortIncrease(dep.getList()));
        assertThat(dep.getList().get(0), is("K1"));
    }

    @Test
    public void whenSortIncreaseLess() {
        DepartamentSort sort = new DepartamentSort();
        List<String> list = new ArrayList<>();
        list.add("K1\\SK1\\SSK1");
        list.add("K1\\SK1\\SSK2");
        list.add("K2\\SK1\\SSK1");
        list.add("K2\\SK1\\SSK2");
        Departament dep = new Departament(list);
        dep.setList(sort.sortIncrease(dep.getList()));
        assertThat(dep.getList().get(0), is("K1"));
    }

    @Test
    public void whenSortDecrease() {
        DepartamentSort sort = new DepartamentSort();
        List<String> list = new ArrayList<>();
        list.add("K1\\SK1");
        list.add("K1\\SK2");
        list.add("K1\\SK1\\SSK1");
        list.add("K1\\SK1\\SSK2");
        list.add("K2");
        list.add("K2\\SK1\\SSK1");
        list.add("K2\\SK1\\SSK2");
        Departament dep = new Departament(list);
        dep.setList(sort.sortDecrease(dep.getList()));
        assertThat(dep.getList().get(0), is("K2\\SK1\\SSK2"));
    }

    @Test
    public void whenSortDecreaseLess() {
        DepartamentSort sort = new DepartamentSort();
        List<String> list = new ArrayList<>();
        list.add("K1\\SK1\\SSK1");
        list.add("K1\\SK1\\SSK2");
        list.add("K2\\SK1\\SSK1");
        list.add("K2\\SK1\\SSK2");
        Departament dep = new Departament(list);
        dep.setList(sort.sortDecrease(dep.getList()));
        assertThat(dep.getList().get(0), is("K2\\SK1\\SSK2"));
    }
}
