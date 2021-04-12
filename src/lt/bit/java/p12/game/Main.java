package lt.bit.java.p12.game;

public class Main {

    public static void main(String[] args) {

        Peasant p3 = new Peasant("Level C", 5, 6);

        IDraw[] objects = new IDraw[] {
                new Rock(100, 45),
                new Rock(50, 120),
                new Peasant("Level A", 5, 10),
                new Peasant("Level B", 3, 19),
                p3
        };

        drawAll(objects);

        p3.setHidden(true);

        drawAll(objects);
    }

    static void drawAll(IDraw[] objects) {
        for (IDraw obj : objects) {
            if (!obj.isHidden()) {
                obj.draw();
            }
        }
        System.out.println("Viskas nupiesta");
    }
}
