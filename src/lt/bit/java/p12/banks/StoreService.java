package lt.bit.java.p12.banks;

import java.time.LocalDate;

public class StoreService {

    private CurrencyExchangeRate currencyExchangeRate;

    public StoreService(CurrencyExchangeRate currencyExchangeRate) {
        this.currencyExchangeRate = currencyExchangeRate;
    }

    public double calculateTotal(Product[] products) {
        double total = 0;
        for (Product product : products) {
            double rate = currencyExchangeRate.getExchangeRate(product.getPrice().getCurrency(), LocalDate.now());
            total += rate * product.getPrice().getAmount() * product.getQuantity();
        }
        return total;
    }

}
