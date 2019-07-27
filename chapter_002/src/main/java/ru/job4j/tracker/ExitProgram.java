package ru.job4j.tracker;

public class ExitProgram implements UserAction  {
    private int key;
    private String info;

    public ExitProgram(int key, String info) {
        this.key = key;
        this.info = info;
    }

    public int key() {
        return key;
    }

    public void execute(Input input, Tracker tracker) {
    }

    public String info() {
        return String.format("%s. %s", key, info);
    }
}
