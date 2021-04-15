package lt.bit.java.p15;


import java.util.Arrays;
import java.util.Objects;

public class GenericMasyvas <T> {

    private int bufferSize;
    private Object[] array;
    private int count = 0;

    public GenericMasyvas() {
        this(10);
    }

    public GenericMasyvas(int bufferSize) {
        this.bufferSize = bufferSize;
        array = new Object[bufferSize];
    }

    public void add(T s) {
        if (count == array.length) {
            System.out.println("Kuriam nauja");
            Object[] naujas = new Object[array.length + bufferSize];
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

    public T get(int i) {
        if (i < 0 || i >= count) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + ", array size " + count);
        }
        return (T) array[i];
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
