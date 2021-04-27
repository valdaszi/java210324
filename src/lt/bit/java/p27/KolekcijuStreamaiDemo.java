package lt.bit.java.p27;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KolekcijuStreamaiDemo {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("B", BigDecimal.TEN, 9.0001),
                new Item("A", new BigDecimal("123.45"), 12.333333),
                new Item("X", BigDecimal.ZERO, 0.99999),
                new Item("X", BigDecimal.ZERO, 1.234)
        );
        System.out.println(items);

        long count = 0;
        for (Item e : items) {
            if (e.getPrice().compareTo(BigDecimal.ZERO) > 0) count++;
        }
        System.out.println("Elementu, kuriu kainu > 0 yra " + count);

        count = 0;
        for (Item e : items) {
            if (e.getWeight() > 10) count++;
        }
        System.out.println("Elementu, kuriu svoris > 10 yra " + count);

        System.out.println("\n*** Stream ***");

        System.out.println("\n** Surasti kiek elementu, kuriu kaina > 0");
        count = items.stream()
                // .peek(e -> System.out.println(e))
                .filter(e -> e.getPrice().compareTo(BigDecimal.ZERO) > 0)
                .count();
        System.out.println("elementu, kuriu kaina > 0 yra " + count);


        System.out.println("\n** Sudeti i Lista elementus, kuriu svoris <= 10 ir surusiuoti juos pagal 'name'");
        List<Item> items2 = items.stream()
                .filter(i -> i.getWeight() <= 10)
                .sorted((i1, i2) -> i2.getName().compareTo(i1.getName()))
                .collect(Collectors.toList());
        System.out.println(items2);

        System.out.println("\n** Nustatyti ar yra bent viena preke kurios vardas prasideda raide A");
        System.out.println(items.stream().anyMatch(e -> e.getName().charAt(0) == 'A'));

        System.out.println("\n** Nustatyti ar yra bent viena preke kurios vardas prasideda raide C");
        System.out.println(items.stream().anyMatch(e -> e.getName().charAt(0) == 'C'));

        System.out.println("\n** Gauti viena preke kurios vardas prasideda raide A");
        System.out.println(items.stream().filter(e -> e.getName().charAt(0) == 'A').findAny().orElse(null));

        System.out.println("\n** Gauti viena preke kurios vardas prasideda raide C");
        System.out.println(items.stream().filter(e -> e.getName().charAt(0) == 'C').findAny().orElse(null));

        System.out.println("\n** Gauti set'a skirtingu prekiu pavadinimu");
        System.out.println(items.stream().map(e -> e.getName()).collect(Collectors.toSet()));

        System.out.println("\n** Bendras visu prekiu svoris");
        System.out.println(items.stream().mapToDouble(e -> e.getWeight()).sum());
    }
}


class Item {
    private String name;
    private BigDecimal price;
    private double weight;

    public Item(String name, BigDecimal price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}