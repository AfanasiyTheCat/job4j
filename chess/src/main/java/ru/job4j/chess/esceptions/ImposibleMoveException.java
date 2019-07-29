package ru.job4j.chess.esceptions;

public class ImposibleMoveException extends RuntimeException {
    public ImposibleMoveException(String msg) {
        super(msg);
    }
}
