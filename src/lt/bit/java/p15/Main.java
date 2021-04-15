package lt.bit.java.p15;

public class Main {

    public static void main(String[] args) {
        DinaminisMasyvas masyvas = generuoti();
        print(masyvas);

        masyvas.add("Name xxx1");
        masyvas.add("Name xxx2");

        print(masyvas);
    }

    static DinaminisMasyvas generuoti() {
        int size = (int) (Math.random() * 100 + 3);
        DinaminisMasyvas m = new DinaminisMasyvas();
        for (int i = 0; i < size; i++) {
            m.add("Name " + (i + 1));
        }
        return m;
    }

    static void print(DinaminisMasyvas m) {
        for (int i = 0; i < m.size(); i++) {
            System.out.print(m.get(i) + ",");
        }
        System.out.println();
    }
}
