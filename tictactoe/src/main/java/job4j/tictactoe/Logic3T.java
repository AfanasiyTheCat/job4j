package job4j.tictactoe;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        return isWin("X");
    }

    public boolean isWinnerO() {
        return isWin("O");
    }

    private boolean isWin(String figure) {
        boolean result = false;
        int i = 0;
        int j = 0;
        for (; i < table.length; i++) {
            if (hasMark(figure, i, j)
                    && hasMark(figure, i, j + 1)
                    && hasMark(figure, i, j + 2)) {
                result = true;
                break;
            }
        }
        i = 0;
        for (; j < table.length; j++) {
            if (hasMark(figure, i, j)
                    && hasMark(figure, i + 1, j)
                    && hasMark(figure, i + 2, j)) {
                result = true;
                break;
            }
        }
        if (hasMark(figure, 1, 1)) {
            if (hasMark(figure, 0, 0) && hasMark(figure, 2, 2)
                    || hasMark(figure, 2, 0) && hasMark(figure, 0, 2)) {
                result = true;
            }
        }
        return result;
    }

    private boolean hasMark(String figure, int i, int j) {
        boolean result = false;
        if (figure.equals("X")) {
            result = table[i][j].hasMarkX();
        } else if (figure.equals("O")) {
            result = table[i][j].hasMarkO();
        }
        return result;
    }

    public boolean hasGap() {
        boolean result = false;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (!(table[i][j].hasMarkX() || table[i][j].hasMarkO())) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }
}
