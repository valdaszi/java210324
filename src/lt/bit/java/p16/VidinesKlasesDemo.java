package lt.bit.java.p16;

public class VidinesKlasesDemo {
    static int c = 3;

    int x;
    int y;
    public StatineVidineKlase s;
    public KitaKlase k;

    public static void main(String[] args) {
        System.out.println("c=" + c);
        // System.out.println("x=" + x);
        //
        VidinesKlasesDemo v = new VidinesKlasesDemo();
        v.x = 10;
        v.y = 20;
        v.s = new StatineVidineKlase(100);
        v.k = v.new KitaKlase("Name", 200);

        System.out.println("v.s.x = " + v.s.getX());
        System.out.println("v.k.method() = " + v.k.method());
        System.out.println("v.k.name() = " + v.k.name());
    }

    String name(VidinesKlasesDemo a) {
        return a.x + " and " + a.y;
    }

    static private class StatineVidineKlase {
        private int x;

        StatineVidineKlase(int x) {
            this.x = x;
        }

        int getX() {
            return x * VidinesKlasesDemo.c;
        }

    }

    private class KitaKlase {

        String name;
        int x;

        KitaKlase(String name, int x) {
            this.name = name;
            this.x = x;
        }

        int method() {
            int r = 10;

            class DarKitaKlase {
                int id;
            }

            DarKitaKlase a = new DarKitaKlase();
            a.id = r;

            return a.id * this.x + y + VidinesKlasesDemo.this.x;
        }

        String name() {
            return name + " of " + VidinesKlasesDemo.this + " and " + this;
        }

        String name2() {
            return name + " " + VidinesKlasesDemo.this.name(VidinesKlasesDemo.this);
        }

    }
}

class Kita {

    void m() {
        VidinesKlasesDemo v = new VidinesKlasesDemo();
        Object k = v.k;
    }
}





