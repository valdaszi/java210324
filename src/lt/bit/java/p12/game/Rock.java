package lt.bit.java.p12.game;

public class Rock implements IDraw {

    private double x, y;
    private boolean hidden;

    public Rock(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Nupiesiau uola (x,y)=(" + x + "," + y + ")");
    }

    @Override
    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
