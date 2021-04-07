package lt.bit.java.p05.chess.figures;

import lt.bit.java.p05.chess.types.Position;

public class Figure { // extends Object {

    Position position;
    String color;

    Figure(char letter, int number, String color) {
        this.position = new Position(letter, number);
        this.color = color;
    }

//    @Override
//    public String toString() {
//        return "Figure: " + letter + number + ", " + color;
//    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + position + ", " + color;
    }

    public Position[] possibleMovies() {
        return null;
    }
}
