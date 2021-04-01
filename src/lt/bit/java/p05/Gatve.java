package lt.bit.java.p05;

class Gatve {
    int kodas;
    String pavadinimas;
    Sankryza[] sankryzos;

    Gatve() {
    }

    Gatve(int kodas, String pavadinimas, Sankryza[] sankryzos) {
        this.kodas = kodas;
        this.pavadinimas = pavadinimas;
        this.sankryzos = sankryzos;
    }
}