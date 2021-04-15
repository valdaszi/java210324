package lt.bit.java.p15;

public class DinaminisMasyvas {

    private int bufferSize;
    private String[] array;
    private int count = 0;

    public DinaminisMasyvas() {
        this(10);
    }

    public DinaminisMasyvas(int bufferSize) {
        this.bufferSize = bufferSize;
        array = new String[bufferSize];
    }

    public void add(String s) {
        if (count == array.length) {
            System.out.println("Kuriam nauja");
            String[] naujas = new String[array.length + bufferSize];
            for (int i = 0; i < array.length; i++) {
                naujas[i] = array[i];
            }
            array = naujas;
        }
        array[count] = s;
        count++;
    }

    public int size() {
        return count;
    }

    public String get(int i) {
        if (i < 0 || i >= count) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + ", array size " + count);
        }
        return array[i];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(array[i]);
            s.append(",");
        }
        return s.toString();
    }
}
