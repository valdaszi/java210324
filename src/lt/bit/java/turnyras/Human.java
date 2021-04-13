package lt.bit.java.turnyras;

public class Human implements IGamer {

    private static int n = 1;

    final private String name;
    final private int number;

    public Human(String name) {
        this.name = name;
        this.number = n++;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String name() {
        return number + " " + name;
    }

    @Override
    public String toString() {
        return number + " " + name;
    }
}
