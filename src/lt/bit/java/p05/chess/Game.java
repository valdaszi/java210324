package lt.bit.java.p05.chess;

import lt.bit.java.p05.chess.figures.Figure;
import lt.bit.java.p05.chess.figures.King;
import lt.bit.java.p05.chess.figures.Queen;
import lt.bit.java.p05.chess.types.Position;

import java.util.Arrays;

public class Game {

    public static void main(String[] args) {
        Queen queen = new Queen('D', 5, "Black");
        King king = new King('E',2, "Black");

        System.out.println(queen + ": " + Arrays.toString(queen.possibleMovies()));
        System.out.println(king + ": " + Arrays.toString(king.possibleMovies()));

//        Figure figure = new Figure('A', 3, "White");

        Figure kingWhite = new King('E', 5, "White");
        // System.out.println(kingWhite + ": " + Arrays.toString(kingWhite.possibleMovies()));
        printFigure(kingWhite);

        printFigure(new Queen('H', 6, "White"));
        printFigure(new King('G', 5, "White"));

        System.out.println("*** Viskas yra Object'ai ***");
        Object o1 = new King('E', 5, "White");
        System.out.println(o1.getClass().getName() + ": " + o1);
        o1 = "Tekstas";
        System.out.println(o1.getClass().getName() + ": " + o1);
        o1 = 12345;
        System.out.println(o1.getClass().getName() + ": " + o1);
        o1 = 123.45;
        System.out.println(o1.getClass().getName() + ": " + o1);
        o1 = true;
        System.out.println(o1.getClass().getName() + ": " + o1);

    }

    static void printFigure(Figure figure) {
        System.out.println(figure + ": " + Arrays.toString(figure.possibleMovies()));
    }
}
