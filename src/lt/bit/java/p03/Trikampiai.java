package lt.bit.java.p03;


import java.util.Scanner;

public class Trikampiai {

    public static void main(String[] args) {

        System.out.print("Iveskite tris skaicius: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.print(a + ", " + b + ", " + c + " ");

        if (a + b > c && b + c > a && a + c > b) {
            System.out.print(" yra trikampis");
            if (a == b && b == c) {
                System.out.print(" lygiakrastis");
            } else if (a == b || b == c || a == c) {
                System.out.print(" lygiasonis");
            }

        } else {
            System.out.println(" nera trikampis");
        }
    }
}
