package ru.job4j.tracker;

public class ExitProgram extends BaseAction {
    private int key;
    private String info;

    public ExitProgram(int key, String info) {
        super(key, info);
    }

    public void execute(Input input, Tracker tracker) {
    }
}
