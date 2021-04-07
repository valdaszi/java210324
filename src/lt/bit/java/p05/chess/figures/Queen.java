package lt.bit.java.p05.chess.figures;

import lt.bit.java.p05.chess.types.Position;

public class Queen extends Figure {

    public Queen(char letter, int number, String color) {
        super(letter, number, color);
    }

//    @Override
//    public String toString() {
//        return "Queen: " + letter + number + ", " + color;
//    }

//    @Override
//    public void method1() {
//        //TODO ...
//    }

    @Override
    public Position[] possibleMovies() {
        return null;
    }
}
