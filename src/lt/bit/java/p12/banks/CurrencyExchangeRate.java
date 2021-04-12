package lt.bit.java.p12.banks;

import java.time.LocalDate;

public interface CurrencyExchangeRate {

    double getExchangeRate(String currency, LocalDate date);
}
