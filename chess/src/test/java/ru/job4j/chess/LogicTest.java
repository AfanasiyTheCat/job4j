package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.white.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LogicTest {
    @Test
    public void whenBishopGoRight() {
        Logic logic = new Logic();
        Cell source = Cell.A1;
        Cell dest = Cell.C3;
        BishopWhite chess = new BishopWhite(source);
        logic.add(chess);
        int id = logic.findBy(source);
        logic.move(source, dest);
        assertThat(logic.findBy(dest), is(id));
    }
    @Test
    public void whenKingGoRight() {
        Logic logic = new Logic();
        Cell source = Cell.A1;
        Cell dest = Cell.B1;
        KingWhite chess = new KingWhite(source);
        logic.add(chess);
        int id = logic.findBy(source);
        logic.move(source, dest);
        assertThat(logic.findBy(dest), is(id));
    }
    @Test
    public void whenKnightGoRight() {
        Logic logic = new Logic();
        Cell source = Cell.A1;
        Cell dest = Cell.C2;
        KnightWhite chess = new KnightWhite(source);
        logic.add(chess);
        int id = logic.findBy(source);
        logic.move(source, dest);
        assertThat(logic.findBy(dest), is(id));
    }
    @Test
    public void whenPawnGoRight() {
        Logic logic = new Logic();
        Cell source = Cell.A1;
        Cell dest = Cell.B1;
        PawnWhite chess = new PawnWhite(source);
        logic.add(chess);
        int id = logic.findBy(source);
        logic.move(source, dest);
        assertThat(logic.findBy(dest), is(id));
    }
    @Test
    public void whenQueenGoRight() {
        Logic logic = new Logic();
        Cell source = Cell.A1;
        Cell dest = Cell.E5;
        QueenWhite chess = new QueenWhite(source);
        logic.add(chess);
        int id = logic.findBy(source);
        logic.move(source, dest);
        assertThat(logic.findBy(dest), is(id));
    }
    @Test
    public void whenRookGoRight() {
        Logic logic = new Logic();
        Cell source = Cell.A1;
        Cell dest = Cell.D1;
        RookWhite chess = new RookWhite(source);
        logic.add(chess);
        int id = logic.findBy(source);
        logic.move(source, dest);
        assertThat(logic.findBy(dest), is(id));
    }
}
