package lt.bit.java.p05;

public class Zmogus {

    String vardas;
    String pavarde;

    public Zmogus() {
        System.out.println("Zmogus()");
    }

    public Zmogus(String vardas, String pavarde) {
        System.out.println("Zmogus(String vardas, String pavarde)");
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    @Override
    public String toString() {
        return "Zmogus{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                '}';
    }
}
