package lt.bit.java.turnyras;

public class Human implements IGamer {

    private static int n = 1;

    final private String name;
    final private int number;

    public Human(String name) {
        this.name = name;
        this.number = n++;
    }

    public Human(Pair pair) {
        this.number = n++;
        this.name = pair.name();

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String name() {
        return name + " ("+ number + ")";
    }

    @Override
    public String toString() {
        return number + " " + name;
    }
}
