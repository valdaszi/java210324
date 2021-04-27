package lt.bit.java.p26;

public class AnoniminesKlasesDemo {

    double a;
    double b;
    double c;

    public AnoniminesKlasesDemo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculate() {

//        class LokaliKlase1 extends AbstraktiSkaiciavimoKlase {
//            public LokaliKlase1(double x, double y) {
//                super(x, y);
//            }
//
//            @Override
//            double calculate() {
//                return (x + y) / 2;
//            }
//        }
//
//        class LokaliKlase2 extends AbstraktiSkaiciavimoKlase {
//            public LokaliKlase2(double x, double y) {
//                super(x, y);
//            }
//
//            @Override
//            double calculate() {
//                return Math.abs(x - y);
//            }
//        }
//
//        class LokaliKlase3 extends AbstraktiSkaiciavimoKlase {
//            public LokaliKlase3(double x, double y) {
//                super(x, y);
//            }
//
//            @Override
//            double calculate() {
//                return Math.sqrt(x * x + y * y);
//            }
//        }

        AbstraktiSkaiciavimoKlase l1 = // new LokaliKlase1(a, b);
                new AbstraktiSkaiciavimoKlase(a, b) {
                    @Override
                    double calculate() {
                        return (x + y) / 2;
                    }
                };
        System.out.println("l1.className=" + l1.getClass().getName());


        AbstraktiSkaiciavimoKlase l2 = // new LokaliKlase2(a, c);
                new AbstraktiSkaiciavimoKlase(a, c) {
                    @Override
                    double calculate() {
                        return Math.abs(x - y);
                    }
                };
        System.out.println("l2.className=" + l2.getClass().getName());


        AbstraktiSkaiciavimoKlase l3 = //new LokaliKlase3(c, b);
            new AbstraktiSkaiciavimoKlase(c, b) {
                @Override
                double calculate() {
                    return Math.sqrt(x * x + y * y);
                }
            };
        System.out.println("l3.className=" + l3.getClass().getName());


        return l1.calculate() + l2.calculate() + l3.calculate();
    }


    public static void main(String[] args) {
        AnoniminesKlasesDemo a = new AnoniminesKlasesDemo(12, 16, 24);
        double r = a.calculate();
        System.out.println("r=" + r);
    }
}


abstract class AbstraktiSkaiciavimoKlase {
    double x, y;

    public AbstraktiSkaiciavimoKlase(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double calculate();
}