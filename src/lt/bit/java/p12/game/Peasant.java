package lt.bit.java.p12.game;

public class Peasant implements IDraw {

    private String type;
    private double x;
    private double y;
    private boolean hidden;

    public Peasant(String type, double x, double y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Valstietis " + type + " " + x + "," + y);
    }

    @Override
    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
