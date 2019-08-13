
package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        var result = new ArrayList<Person>();
        for (int i = 0; i < persons.size(); i++) {
            var person = persons.get(i);
            if (person.getName().contains(key)
            || person.getSurname().contains(key)
            || person.getAddress().contains((key))) {
                result.add(persons.get(i));
            }
        }
        return result;
    }
}