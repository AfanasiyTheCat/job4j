package ru.job4j.map;

public class Address {
    private String city;
    private String street;
    private int home;
    private int apartament;

    public Address(String city, String street, int home, int apartament) {
        this.apartament = apartament;
        this.city = city;
        this.home = home;
        this.street = street;
    }

    public String toString() {
        return city + "/" + street + "/" + String.valueOf(home) + "/" + String.valueOf(apartament);
    }
}
