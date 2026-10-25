package pl.wsb.ewydarzenia.reservation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

/**
 * Rezerwacja miejsc na wydarzenie. Wskazanie na wydarzenie dojdzie jako relacja na kolejnych zajęciach.
 */
@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_name", nullable = false, length = 80)
    private String customerName;

    @Column(name = "customer_email", nullable = false, length = 120)
    private String customerEmail;

    @Column(name = "seats", nullable = false)
    private Integer seats;

    @Column(name = "reserved_at", nullable = false)
    private LocalDateTime reservedAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    private ReservationStatus status;

    protected Reservation() {
    }

    public Reservation(String customerName, String customerEmail, Integer seats, LocalDateTime reservedAt,
                       ReservationStatus status) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.seats = seats;
        this.reservedAt = reservedAt;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Integer getSeats() {
        return seats;
    }

    public LocalDateTime getReservedAt() {
        return reservedAt;
    }

    public ReservationStatus getStatus() {
        return status;
    }
}
