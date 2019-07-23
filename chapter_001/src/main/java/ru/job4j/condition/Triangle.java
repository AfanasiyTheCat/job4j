package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @return Периметр.
     */
    public double period() {
        return this.first.distance(this.second) + this.second.distance(this.third) + this.third.distance(this.first);
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period();
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p/2 * (p/2 - a) * (p/2 - b) * (p/2 - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return
     */
    private boolean exist(double a, double c, double b) {
        if (this.first.distance(this.second) < this.second.distance(this.third) + this.third.distance(this.first) &&
                this.second.distance(this.third) < this.third.distance(this.first) + this.first.distance(this.second) &&
                this.third.distance(this.first) < this.first.distance(this.second) + this.second.distance(this.third)) {
            return true;
        }
        return false;
    }
}