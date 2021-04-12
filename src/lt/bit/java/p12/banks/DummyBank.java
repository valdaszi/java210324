package lt.bit.java.p12.banks;

import java.time.LocalDate;

public class DummyBank implements CurrencyExchangeRate {

    @Override
    public double getExchangeRate(String currency, LocalDate date) {
        return 1.0;
    }
}
