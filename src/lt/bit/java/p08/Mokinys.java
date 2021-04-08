package lt.bit.java.p08;

public class Mokinys {

    private String vardas;
    private String pavarde;
    private int klase;
    private int[] trimestras;

    public Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.trimestras = trimestras;
    }

    public double vidurkis() {
        double vid = 0.0;
        for (int i : trimestras) vid += i;
        return vid / trimestras.length;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public int getKlase() {
        return klase;
    }

    public int[] getTrimestras() {
        return trimestras;
    }

    protected void setVardas(String vardas) {
        this.vardas = vardas;
    }

    protected void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    protected void setKlase(int klase) {
        this.klase = klase;
    }

    protected void setTrimestras(int[] trimestras) {
        this.trimestras = trimestras;
    }
}
