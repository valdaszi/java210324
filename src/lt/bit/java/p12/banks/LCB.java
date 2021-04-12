package lt.bit.java.p12.banks;

import java.time.LocalDate;

public class LCB implements CurrencyExchangeRate {

    @Override
    public double getExchangeRate(String currency, LocalDate date) {
        // return 0;
        // get rate from URL ....
        return 0.9;
    }

    //....
}
