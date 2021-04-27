package lt.bit.java.p27;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println("country: " + locale.getCountry() +
                ", language: " + locale.getLanguage());

        locale = Locale.FRANCE;
        System.out.println("country: " + locale.getCountry() +
                ", language: " + locale.getLanguage());

        locale = Locale.US;
        System.out.println("country: " + locale.getCountry() +
                ", language: " + locale.getLanguage());

        Locale[] locales = Locale.getAvailableLocales();
        System.out.println("available locales: " + Arrays.toString(locales));

        formatDate(Locale.getDefault(), LocalDateTime.now());
        formatDate(Locale.US, LocalDateTime.now());
        formatDate(Locale.GERMANY, LocalDateTime.now());
        formatDate(Locale.JAPAN, LocalDateTime.now());

        formatCurrency(Locale.getDefault(), 123456.78);
        formatCurrency(Locale.US, 123456.78);
        formatCurrency(Locale.GERMANY, 123456.78);
        formatCurrency(Locale.JAPAN, 123456.78);

        formatMessage(Locale.getDefault(), "message1");
        formatMessage(Locale.US, "message1");
        formatMessage(Locale.GERMANY, "message1");
        formatMessage(Locale.JAPAN, "message1");
    }

    static void formatDate(Locale locale, LocalDateTime dateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.FULL)
                .withZone(ZoneId.systemDefault())
                .withLocale(locale);
        System.out.println(dateTime.format(dateTimeFormatter));
    }

    static void formatCurrency(Locale locale, double price) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(numberFormat.format(price));
    }

    static void formatMessage(Locale locale, String key) {
        ResourceBundle messages = ResourceBundle.getBundle(
                LocaleDemo.class.getPackageName() + ".messages", locale);
        System.out.println(key + ": " + messages.getString(key));
    }
}
