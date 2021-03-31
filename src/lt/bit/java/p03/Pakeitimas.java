package lt.bit.java.p03;

import java.util.Arrays;

public class Pakeitimas {

    public static void main(String[] args) {

        int[] m = { 2, 5, 7, 9, 10 };
        //          0  1  2  3  4

        System.out.println("Pradinis masyvas: " + Arrays.toString(m));

        // 1 <-> 3
        int tarpinis = m[1];
        m[1] = m[3];
        m[3] = tarpinis;

        System.out.println("Galutinis masyvas: " + Arrays.toString(m));

    }
}
