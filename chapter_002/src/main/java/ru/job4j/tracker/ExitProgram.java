package ru.job4j.tracker;

import java.util.function.Consumer;

public class ExitProgram extends BaseAction {
    private int key;
    private String info;

    public ExitProgram(int key, String info, Consumer<String> output) {
        super(key, info, output);
    }

    public void execute(Input input, Tracker tracker) {
    }
}
