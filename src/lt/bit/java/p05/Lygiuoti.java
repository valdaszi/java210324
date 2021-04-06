package lt.bit.java.p05;

import java.util.Arrays;

public class Lygiuoti {

    public static void main(String[] args) {
        Mokinys m1 = new Mokinys();
        m1.klase = 4;
        m1.vardas = "A2";
        m1.pavarde = "C";

        Mokinys m2 = new Mokinys(4, "A1", "C");

        Mokinys[] masyvas = {
                m1,
                m2,
                new Mokinys(2, "A", "B"),
                new Mokinys(1, "C", "A")
        };
        // System.out.println(Arrays.toString(masyvas));
//        for (int i = 0; i < masyvas.length; i++) {
//            Mokinys m = masyvas[i];
//            System.out.print(m.klase + " klase " + m.vardas + " " + m.pavarde + ", ");
//        }
        for (Mokinys m : masyvas) {
            System.out.print(m.klase + " klase " + m.vardas + " " + m.pavarde + ", ");
        }
        System.out.println();

        Mokinys tuscias;
        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (compareTo(masyvas[i], masyvas[j]) > 0) {
                    tuscias = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = tuscias;
                }
            }
            System.out.println(i + ": " + Arrays.toString(masyvas));
        }
    }

    static int compareTo(Mokinys a, Mokinys b) {
        // boolean r = a > b;

        // lyginame klases:
        if (a.klase > b.klase) return 1;
        else if (a.klase < b.klase) return -1;

        // a.klase == b.klase
        // lyginu pavardes, nes klases yra lygios
        int r = a.pavarde.compareTo(b.pavarde);
        if (r != 0) return r;

        // jei r == 0, t.y. jei pavardes lygios
        r = a.vardas.compareTo(b.vardas);

        return r;
    }
}

