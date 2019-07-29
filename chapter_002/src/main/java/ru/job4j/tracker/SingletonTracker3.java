package ru.job4j.tracker;

public class SingletonTracker3 {
    private static final SingletonTracker3 INSTANCE = new SingletonTracker3();

    private SingletonTracker3() {
    }

    public static SingletonTracker3 getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        SingletonTracker3 tracker = SingletonTracker3.getInstance();
    }
}
