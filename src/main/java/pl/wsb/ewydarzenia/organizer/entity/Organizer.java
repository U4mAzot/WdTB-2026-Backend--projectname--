package pl.wsb.ewydarzenia.organizer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

/**
 * Organizator wydarzeń: firma albo osoba, która wystawia wydarzenia w serwisie.
 */
@Entity
@Table(name = "organizer")
public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 80)
    private String name;

    @Column(name = "email", nullable = false, unique = true, length = 120)
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "verified", nullable = false)
    private Boolean verified;

    @Column(name = "registered_on", nullable = false)
    private LocalDate registeredOn;

    protected Organizer() {
    }

    public Organizer(String name, String email, String phone, Boolean verified, LocalDate registeredOn) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.verified = verified;
        this.registeredOn = registeredOn;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Boolean getVerified() {
        return verified;
    }

    public LocalDate getRegisteredOn() {
        return registeredOn;
    }
}
