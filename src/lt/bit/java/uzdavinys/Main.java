package lt.bit.java.uzdavinys;

public class Main {

    public static void main(String[] args) {
        float amount = 1;

        for (int k = 1; k <= 64; k++) {
            System.out.println(k + " langelyje yra " + amount + " grudu");
            amount = amount * 2;
        }

        short b = 32000;
        short c = 2;
        short x = (short) (b * c);
        System.out.println(x);

        double d = 1.23e-2 + 100; // 0.0123 + 100
        System.out.println(d);

        System.out.println(100 * 3.3);
        System.out.println(11 / 3 * 3);
        System.out.println(11 / 3.0 * 3);

        float f1 = (float)(11 / 3.0 * 3);
        float f2 = 11 / (float)3.0 * 3;
        float f3 = 11 / 3.0F * 3;

        boolean b1 = true; // false
        boolean b2 = f2 > f3;

        char c1 = 90;
        System.out.println("" + "c1 = " + c1);
        char c2 = '\u1234';
        System.out.println("c2 = " + c2);

        for (char c3 = ' '; c3 <= 'W'; c3++) {
            System.out.println((int)c3 + " = " + c3);
        }

    }

    // byte (1) -> short (2) -> int (4) -> long (8) -> float -> double
}
