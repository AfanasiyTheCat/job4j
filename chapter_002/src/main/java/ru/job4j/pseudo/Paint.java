package ru.job4j.pseudo;

public class Paint {

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    private void init() {
        Square square = new Square();
        Triangle triangle = new Triangle();
        Paint paint = new Paint();
        paint.draw(square);
        paint.draw(triangle);
    }

    public static void main(String[] args) {
        new Paint().init();
    }
}
