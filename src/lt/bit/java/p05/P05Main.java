package lt.bit.java.p05;

public class P05Main {

    public static void main(String[] args) {

        Zmogus z1 = new Zmogus("Antanas", "Antanaitis");
        System.out.println(z1);

        Zmogus z2 = new Zmogus("Ona", "Onaite");
        System.out.println(z2);

        Mokinys m1 = new Mokinys();
        Mokinys m2 = new Mokinys(3, "Jonas", "Jonaitis");
        System.out.println(m2);
    }
}
