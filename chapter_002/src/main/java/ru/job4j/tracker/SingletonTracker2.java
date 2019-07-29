package ru.job4j.tracker;

public class SingletonTracker2 {
    private static SingletonTracker2 instance;

    private SingletonTracker2() {
    }

    public static SingletonTracker2 getInstance() {
        if (instance == null) {
            instance = new SingletonTracker2();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}
