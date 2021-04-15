package lt.bit.java.p15;

import java.time.LocalDate;

public class DinaminisDatuMasyvas {

    private int bufferSize;
    private LocalDate[] array;
    private int count = 0;

    public DinaminisDatuMasyvas() {
        this(10);
    }

    public DinaminisDatuMasyvas(int bufferSize) {
        this.bufferSize = bufferSize;
        array = new LocalDate[bufferSize];
    }

    public void add(LocalDate s) {
        if (count == array.length) {
            System.out.println("Kuriam nauja");
            LocalDate[] naujas = new LocalDate[array.length + bufferSize];
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

    public LocalDate get(int i) {
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
