package lt.bit.java.p28;

import com.google.gson.Gson;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class JsonPrintDemo {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Name1", LocalDate.now(), new Address("City1", "Street1", "1a")),
                new Person("Name2", LocalDate.now().minusDays(1), new Address("City2", "Street2", "1b"))
        );

        Gson gson = new Gson();
        System.out.println(gson.toJson(persons));
    }

}


class Person {
    private String name;
    private LocalDate date;
    private Address address;

    public Person(String name, LocalDate date, Address address) {
        this.name = name;
        this.date = date;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    private String city;
    private String street;
    private String number;

    public Address(String city, String street, String number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }
}