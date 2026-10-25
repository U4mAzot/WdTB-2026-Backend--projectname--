package pl.wsb.ewydarzenia.event.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * Miejsce wydarzenia: klasa wbudowana, jej kolumny trafiają do tabeli {@code event}.
 */
@Embeddable
public class Venue {

    @Column(name = "venue_name", nullable = false, length = 80)
    private String name;

    @Column(name = "street", length = 80)
    private String street;

    @Column(name = "city", nullable = false, length = 40)
    private String city;

    @Column(name = "postal_code", length = 6)
    private String postalCode;

    protected Venue() {
    }

    public Venue(String name, String street, String city, String postalCode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
