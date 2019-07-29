package ru.job4j.chess.firuges.white;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class KnightWhite implements Figure {
    private final Cell position;

    public KnightWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] way = new Cell[1];
        int deltaX = dest.x - source.x;
        int deltaY = dest.y - source.y;
        if ((Math.abs(deltaX) == 2 && Math.abs(deltaY) == 1) || (Math.abs(deltaX) == 1 && Math.abs(deltaY) == 2)) {
            way[0] = Cell.values()[(source.x + deltaX) * 8 + source.y + deltaY];
        } else {
            way[0] = null;
        }
        return way;
    }

    @Override
    public Figure copy(Cell dest) {
        return new KnightWhite(dest);
    }
}
