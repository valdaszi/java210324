package lt.bit.java.turnyras;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Turnyro tvarkarastis");

        // 14) Petras - Maryte
        // 15) 4 poros laimetojas - Ona
        // 16) 3 poros laimetojas - 2 poros laimetojas

        Human[] humans = new Human[] {
                new Human("Vytautas"),
                new Human("Jonas"),
                new Human("Ona"),
                new Human("Maryte"),
                new Human("Zose"),
                new Human("Antanas"),
                new Human("Vycka"),
                new Human("Ecka"),
                new Human("Elvyrka")
        };

//        System.out.println("1 ratas:");
//        int count = humans.length;
//        Pair[] poros = new Pair[count / 2];
//        // i = 0, 2, 4, 6, ...
//        for (int i = 0; i < count; i += 2) {
//            poros[i / 2] = new Pair(humans[i], humans[i + 1]);
//        }
//        for (Pair x : poros) {
//            System.out.println(x.board());
//        }

//        System.out.println("2 ratas:");
//        count = poros.length;
//        Pair[] poros2 = new Pair[count / 2];
//        for (int i = 0; i < count; i += 2) {
//            poros2[i / 2] = new Pair(poros[i], poros[i + 1]);
//        }
//        for (Pair x : poros2) {
//            System.out.println(x.board());
//        }

//        System.out.println("3 ratas:");
//        count = poros2.length;
//        Pair[] poros3 = new Pair[count / 2];
//        for (int i = 0; i < count; i += 2) {
//            poros3[i / 2] = new Pair(poros2[i], poros2[i + 1]);
//        }
//        for (Pair x : poros3) {
//            System.out.println(x.board());
//        }

//        IGamer[] ratas = humans;
//        ratas = ratas(1, ratas);
//        ratas = ratas(2, ratas);
//        ratas = ratas(3, ratas);
//        if (ratas.length == 1) System.out.println("Pabaiga");


        IGamer[] ratas = humans;
        int n = 1;
        while (ratas.length > 1) {
            ratas = ratas(n++, ratas);
        }
        System.out.println("Pabaiga");
    }

    static IGamer[] ratas(int n, IGamer[] zaidejai) {
        System.out.println(n + " ratas:");
        int count = zaidejai.length;

        // poros.length == 4, 8, 16, ...
        if (n == 1) {
            Pair pora = new Pair(zaidejai[0], zaidejai[1]);
            System.out.println(pora.board());

            IGamer[] naujasRatas = new IGamer[] {
                pora,
                zaidejai[2], zaidejai[3], zaidejai[4], zaidejai[5], zaidejai[6], zaidejai[7], zaidejai[8]
            };
            return naujasRatas;
        }

        Pair[] naujosPoros = new Pair[count / 2];
        for (int i = 0; i < count; i += 2) {
            naujosPoros[i / 2] = new Pair(zaidejai[i], zaidejai[i + 1]);
        }
        for (Pair x : naujosPoros) {
            System.out.println(x.board());
        }
        return naujosPoros;
    }
}
