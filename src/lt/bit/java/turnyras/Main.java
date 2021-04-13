package lt.bit.java.turnyras;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Turnyro tvarkarastis");

        // 14) Petras - Maryte
        // 15) 4 poros laimetojas - Ona
        // 16) 3 poros laimetojas - 2 poros laimetojas

        Human[] humans = new Human[] {
                new Human("Jonas"),
                new Human("Ona"),
                new Human("Maryte"),
                new Human("Zose"),
                new Human("Antanas"),
                new Human("Vycka"),
                new Human("Ecka"),
                new Human("Elvyrka")
        };

        System.out.println(Arrays.toString(humans));

        Pair p1 = new Pair(humans[0], humans[1]);
        System.out.println(p1.name());
        System.out.println(p1.board());

        Pair p2 = new Pair(p1, humans[2]);
        System.out.println(p2.name());
        System.out.println(p2.board());

    }
}
