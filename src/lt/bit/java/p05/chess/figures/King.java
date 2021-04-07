package lt.bit.java.p05.chess.figures;

import lt.bit.java.p05.chess.types.Position;

public class King extends Figure {

    public King(char letter, int number, String color) {
        super(letter, number, color);
    }

//    @Override
//    public String toString() {
//        return "King: " + letter + number + ", " + color;
//    }


    /*   ... C D E ...
      3      x x x
      4      x K x
      5      x x x
     */
    @Override
    public Position[] possibleMovies() {
        Position[] positions = new Position[] {
                new Position((char)(position.letter - 1), position.number - 1),
                new Position(position.letter, position.number - 1),
                new Position((char)(position.letter + 1), position.number - 1),
                new Position((char)(position.letter - 1), position.number),
                new Position((char)(position.letter + 1), position.number),
                new Position((char)(position.letter - 1), position.number + 1),
                new Position(position.letter, position.number + 1),
                new Position((char)(position.letter + 1), position.number + 1)
        };
        return positions;
    }

}
