package ru.job4j.usermap;

public class User implements Comparable<User> {
    private int age;
    private String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        int result;
        if (this.age < o.age) {
            result = 1;
        } else if (this.age > o.age) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
