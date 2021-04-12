package lt.bit.java.p12.banks;

public class Main {

    public static void main(String[] args) {

        Product[] products = new Product[] {
                new Product("Agurkai", 100, new Price("USD", 0.99)),
                new Product("Bulves", 50, new Price("PLN", 2.50)),
                new Product("Morkos", 100, new Price("EUR", 1.00))
        };

        StoreService storeService = new StoreService(new DummyBank());
        double total = storeService.calculateTotal(products);

        System.out.println("Total: " + total);

        StoreService storeService2 = new StoreService(new LCB());
        double total2 = storeService2.calculateTotal(products);

        System.out.println("Total: " + total2);

    }
}
