package lt.bit.java.p13;

public class Square implements Figura {

    private double a;

//    public Square(int x, int y, double a) {
//        super(x, y);
//        this.a = a;
//    }


    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }
}
