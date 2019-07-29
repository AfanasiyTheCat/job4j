package ru.job4j.chess.esceptions;

public class OccupiedWayException extends RuntimeException {
    public OccupiedWayException(String msg) {
        super(msg);
    }
}
