package lt.bit.java.p13;

public final class Circle implements Figura {

    static private String name = "CIRCLE";
    static public final int number = 42;

    final private double r;

//    public Circle(int x, int y, double r) {
//        super(x, y);
//        this.r = r;
//    }


    public static String getName() {
        return name;
    }

    public Circle(final double r) {
        // if (r < 0) r = -r;
        this.r = r;
    }

    public double getR() {
        return r;
    }

//    public void setR(double r) {
//        this.r = r;
//    }

    @Override
    final public double area() {
        final double area;
        if (r > 0) {
            area = Math.PI * r * r;
        } else {
            area = 0;
        }
        // area += 1;
        return area;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public int answer() {
        return 13;
    }
}
