package lt.bit.java.p27;

import java.util.Arrays;
import java.util.List;

public class EnumDemo {

    public static void main(String[] args) {
        List<Figure> figuros = Arrays.asList(
                new Figure(10, -8, Color.Yellow),
                new Figure(1, 18, Color.Black),
                new Figure(5, 6, Color.Black));

        System.out.println(figuros);
    }
}


class Figure {
    private int x, y;
    private Color color;

    public Figure(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}


enum Color {
    White(255, 255, 255),
    Yellow(255, 255, 0),
    Black(0, 0, 0),
    Red(255, 0, 0),
    Green(0, 255, 0);

    private int r, g, b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString() {
        return name() + " " + ordinal() + " (" + r + "," + g + "," + b + ")";
    }
}
