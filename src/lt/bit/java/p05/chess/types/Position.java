package lt.bit.java.p05.chess.types;

public class Position {

    public char letter;
    public int number;

    public Position(char letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    @Override
    public String toString() {
        return printMove();
    }

    private String printMove() {
        return letter + "" + number;
    }
}
