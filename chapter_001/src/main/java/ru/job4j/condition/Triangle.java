package ru.job4j.condition;
/**
 * DummyBot.
 * @author Nikita Shvetsov
 * @version $1.0$
 * @since 16.07.2019
 */
public class Triangle {

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2.
     *
     * @param a расстояние между точками a b.
     * @param b расстояние между точками a c.
     * @param c расстояние между точками b c.
     * @return полуперимента.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return площадь.
     */
    private boolean exist(double a, double c, double b) {
        boolean result = false;
        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            result = true;
        }
        return result;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - a) * (p - b) * (p - c)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        Point a = new Point(x1, y2);
        Point b = new Point(x2, y2);
        Point c = new Point(x3, y3);
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        double p = period(ab, bc, ca);
        if (this.exist(ab, bc, ca)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
        }
        return rsl;
    }
}