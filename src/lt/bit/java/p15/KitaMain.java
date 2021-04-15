package lt.bit.java.p15;

import java.time.LocalDate;
import java.util.*;

public class KitaMain {

    public static void main(String[] args) {
        GenericMasyvas masyvas = new GenericMasyvas();

        masyvas.add("A");
        masyvas.add("B");
        masyvas.add("C");
        masyvas.add(LocalDate.now());
        masyvas.add(123);

        Object o3 = masyvas.get(3);
        if (o3 instanceof String) {
            String s1 = (String) o3;
        }
        else if (o3 instanceof LocalDate) {
            //TODO ...
        }

        Integer o4 = (Integer) masyvas.get(4);

        System.out.println(masyvas);

        masyvas.add("D");
        System.out.println(masyvas);

//        masyvas.get(5);
//        masyvas.get(-1);

        // List (Vector) & Set
        Collection<LocalDate> datos = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            datos.add(LocalDate.now().minusDays(i));
        }
        for (int i = 0; i < 10; i++) {
            datos.add(LocalDate.now().minusDays(i));
        }
        // datos.add("Abc");
        // LocalDate d1 = datos.get(0);
        System.out.println("size = " + datos.size());
        System.out.println(datos);

        for (LocalDate d : datos) {
            System.out.println(d);
        }

        // Map (Dictionary)
        Map<String, Integer> mapas1 = new HashMap<>();
        mapas1.put("ABC", 123);
        mapas1.put("DEF", 321);
        Integer i = mapas1.put("ABC", 555);
        System.out.println("sena reiksme: " + i);
        System.out.println(mapas1.size() + ": " + mapas1);
        mapas1.remove("DEF");
        mapas1.put("000", 123);
        System.out.println(mapas1.size() + ": " + mapas1);
    }
}
