package lt.bit.java.p08;

import java.util.Arrays;

public class Uzdavinys {

    public static void main(String[] args) {
        Mokinys[] mokiniai = new Mokinys[] {
                new Mokinys("AB", "P1", 2, new int[] { 8, 9, 8, 9 }),
                new Mokinys("AA", "P2", 2, new int[] { 10, 10, 8, 9 }),
                new Mokinys("BB", "P3", 1, new int[] { 10, 10, 10, 9 }),
                new Mokinys("CC", "P4", 8, new int[] { 5, 4, 7, 6, 5, 8 })
        };

        spausdinti("Pradiniai:", mokiniai);
        lygiuoti(mokiniai);
        spausdinti("Rezultatas:", mokiniai);
    }

    // m <- mokiniai
    static void spausdinti(String title, Mokinys[] m) {
        System.out.println(title);
        // System.out.println(Arrays.toString(m));
        for (Mokinys mokinys : m) {
//            System.out.println(mokinys);
            System.out.println(mokinys.getKlase() + " " + mokinys.getVardas() + " " +
                    mokinys.getPavarde() + " " + Arrays.toString(mokinys.getTrimestras()) + " " +
                    mokinys.getVidurkis());
        }
    }

    static void lygiuoti(Mokinys[] mok) {
        // mok[0].klase = 99;
        Arrays.sort(mok, (Mokinys m1, Mokinys m2) -> {
            if (m1.getKlase() != m2.getKlase()) return m1.getKlase() - m2.getKlase();

            if (m1.getVidurkis() < m2.getVidurkis()) return 1;
            if (m1.getVidurkis() > m2.getVidurkis()) return -1;

            return 0;
        });
    }
}
