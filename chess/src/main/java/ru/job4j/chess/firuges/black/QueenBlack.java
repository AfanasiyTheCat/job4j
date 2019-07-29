package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class QueenBlack implements Figure {
    private final Cell position;

    public QueenBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] way;
        int deltaX = dest.x - source.x;
        int deltaY = dest.y - source.y;
        if (Math.abs(deltaX) == Math.abs(deltaY) || (deltaX == 0 && Math.abs(deltaY) > 0) || (Math.abs(deltaX) > 0 && deltaY == 0)) {
            way = new Cell[Math.abs(source.x - dest.x)];
            way[Math.abs(source.x - dest.x) - 1] = dest;
            for (int i = 0; i < Math.abs(source.x - dest.x) - 2; i++) {
                way[i] = Cell.values()[(source.x + deltaX / Math.abs(deltaX) * (i + 1)) * 8 + source.y + deltaY / Math.abs(deltaY) * (i + 1)];
            }
        } else {
            way = new Cell[1];
        }
        return way;
    }

    @Override
    public Figure copy(Cell dest) {
        return new QueenBlack(dest);
    }
}
