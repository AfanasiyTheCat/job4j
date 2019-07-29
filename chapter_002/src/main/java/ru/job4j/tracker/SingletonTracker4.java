package ru.job4j.tracker;

public class SingletonTracker4 {
    private SingletonTracker4() {
    }

    public static SingletonTracker4 getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final SingletonTracker4 INSTANCE = new SingletonTracker4();
    }

    public static void main(String[] args) {
        SingletonTracker4 tracker = SingletonTracker4.getInstance();
    }
}
