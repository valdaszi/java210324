package lt.bit.java.p08;

public class Mokinys implements IMokinys {

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

    @Override
    public double getVidurkis() {
        double vid = 0.0;
        for (int i : trimestras) vid += i;
        return vid / trimestras.length;
    }

    @Override
    public String getVardas() {
        return vardas;
    }

    @Override
    public String getPavarde() {
        return pavarde;
    }

    @Override
    public int getKlase() {
        return klase;
    }

    @Override
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
