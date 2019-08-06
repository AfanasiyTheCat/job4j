package ru.job4j.usermap;

import java.util.Random;

public class User {
    private int id;
    private String name;
    private String city;
    Random rand = new Random();

    public User(String name, String city) {
        this.city = city;
        this.name = name;
        this.id = rand.nextInt();
    }
    public User(String name, String city, int id) {
        this.city = city;
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
}
