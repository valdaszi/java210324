package lt.bit.java.p13;

public class Gamer {

    private static int count = 0;

    private String name;

    public Gamer(String name) {
        this.name = name;
        Gamer.count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
