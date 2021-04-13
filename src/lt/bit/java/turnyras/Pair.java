package lt.bit.java.turnyras;

public class Pair implements IGamer {

    private static int n = 1;

    final private int number;
    final private IGamer a;
    final private IGamer b;

    public Pair(IGamer a, IGamer b) {
        this.a = a;
        this.b = b;
        number = n++;
    }

    public String board() {
        return number + ") " + a.name() + " - " + b.name();
    }

    @Override
    public String name() {
        return number + " poros laimetojas";
    }

    @Override
    public String toString() {
        return number + ") " + a + " - " + b;
    }
}
