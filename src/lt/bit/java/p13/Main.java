package lt.bit.java.p13;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Figura f1 = new Circle(4); //12, 10, 4);
        Figura f2 = new Square(9); // 10, 11, 9);
        // Figura figura = new Figura(5, 12);

        // Figura[] figures = new Figura[] { f1, f2 }; // , figura };

        Main abc = new Main();

        double total = abc.totalArea(new Figura[] { f1, f2 });
        double totalPerimeter = abc.totalPerimeter(f1, f1, f2); // new Figura[] { f1, f2 });

        System.out.println("Total area: " + total + "\nTotal perimeter: " + totalPerimeter);

        Circle c = new Circle(123);
        System.out.println("Circle area = " + c.area());
        System.out.println(Circle.getName());

        // Circle.name = "cha-cha";
        System.out.println(Circle.getName());

        // Circle.number = 13;
        System.out.println(Circle.number);

        // long random = Math.round(Math.random() * 900) + 100; // 0 <= ... < 1  - 100...999
        long random = abc.randomNumber();
        int i;
        for (i = 0; i < random; i++) {
            new Gamer("A" + i);
        }
        System.out.println("Total gamers count = " + Gamer.getCount());
        System.out.println("Total gamers count #2 = " + random);
        System.out.println("Total gamers count #4 = " + i);

        int k = 0;
        while (true) {
            new Gamer("A");
            k++;
            if (Math.random() < 0.001) break;
        }

        System.out.println("Total gamers count = " + Gamer.getCount());
        // System.out.println("Total gamers count #2 = " + random);
        System.out.println("Total gamers count #3 = " + k);
    }

    long randomNumber() {
        return Math.round(Math.random() * 900) + 100; // 0 <= ... < 1  - 100...999
    }

    double totalArea(Figura... figures) {
        double total = 0;
        for (Figura f : figures) {
            total += f.area();
        }
        return total;
    }

    double totalPerimeter(Figura... figures) {
        double total = 0;
        for (Figura f : figures) {
            total += f.perimeter();
        }
        return total;
    }
}
