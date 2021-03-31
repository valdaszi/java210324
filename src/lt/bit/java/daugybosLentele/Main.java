package lt.bit.java.daugybosLentele;

public class Main {

    public static void main(String[] args) {
        System.out.println("Daugybos lentele");

//        for (int n = 1; n <= 9; n++) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(n + " x " + i + " = " + n * i);
//            }
//
//            System.out.println();
//        }

//        for (int row = 1; row <= 10; row++) {
//            for (int col = 1; col <= 9; col++) {
//                System.out.print(col + " x " + row + " = " + col * row + "\t");
//            }
//            System.out.println();
//        }

//        for (int row = 1; row <= 10; row++) {
//            for (int col = 1; col <= 3; col++) {
//                System.out.print(col + " x " + row + " = " + col * row + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (int row = 1; row <= 10; row++) {
//            for (int col = 4; col <= 6; col++) {
//                System.out.print(col + " x " + row + " = " + col * row + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (int row = 1; row <= 10; row++) {
//            for (int col = 7; col <= 9; col++) {
//                System.out.print(col + " x " + row + " = " + col * row + "\t");
//            }
//            System.out.println();
//        }

        // i   col
        // 0 - 1 -> i * 3 + 1
        // 1 - 4 -> i * 3 + 1
        // 2 - 7 -> i * 3 + 1
        for (int i = 0; i < 3; i++) {
            for (int row = 1; row <= 10; row++) {
                for (int col = i * 3 + 1; col <= i * 3 + 1 + 2; col++) {
                    System.out.print(col + " x " +
                            (row < 10 ? " " : "") + row + " = " +
                            (col * row < 10 ? " " : "") + col * row + "    ");
                }
                System.out.println();
            }

            System.out.println();
        }



//        System.out.println(!((100 == 3) || (10 < 3) && (3 < 4)));
//
//        // x || y && z
//
//        System.out.println(101 % 2 != 0 ? "taip" : "123");

        if (100 < 200) {
            System.out.println("Taip");
        } else if (25 > 80) {
            System.out.println("Ne");
        }

        if ('W' > 20) System.out.println("Ar tikrai?");

        int x = 3;
        switch (x) {
            case 2:
                System.out.println("Pavyko 2");
                break;
            default:
                System.out.println("Nieko gero");
            case 4:
                System.out.println("Jau 4");
                break;
        }
        // ,,,

        x = -10;
        while (x >= 0) {
            System.out.println(x);
            x--;
        }

        do {
            System.out.println(x);
        } while (x >= 0);


        int[] m = { 2, 3, 4, 7, -9};
        int[] m2 = new int[10];
    }
}
