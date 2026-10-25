package pl.wsb.ewydarzenia.event.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Wydarzenie z listy wydarzeń. Organizator dojdzie jako relacja na kolejnych zajęciach.
 */
@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, unique = true, length = 120)
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false, length = 20)
    private EventCategory category;

    @Column(name = "starts_at", nullable = false)
    private LocalDateTime startsAt;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "ticket_price", nullable = false, precision = 10, scale = 2)
    private BigDecimal ticketPrice;

    @Embedded
    private Venue venue;

    protected Event() {
    }

    public Event(String title, EventCategory category, LocalDateTime startsAt, Integer capacity,
                 BigDecimal ticketPrice, Venue venue) {
        this.title = title;
        this.category = category;
        this.startsAt = startsAt;
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
        this.venue = venue;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public EventCategory getCategory() {
        return category;
    }

    public LocalDateTime getStartsAt() {
        return startsAt;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public Venue getVenue() {
        return venue;
    }
}
