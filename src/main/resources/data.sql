-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('wrx81889@student.wroclaw.merito.pl',   'Patryk',   'USER',    current_timestamp),
    ('wrx82004@student.wroclaw.merito.pl',  'Rafał',  'USER',    current_timestamp),
    ('wrx83664@student.wroclaw.merito.pl',       'Aleksandra', 'USER', current_timestamp);

-- ===== LAB 02 · event =====
insert into event (title, category, starts_at, capacity, ticket_price, venue_name, street, city, postal_code) values
    ('Koncert jazzowy na Rynku',     'CONCERT',    '2026-11-14 19:00:00', 300,  79.00, 'Scena na Rynku',  'Rynek 1',           'Wrocław', '50-106'),
    ('Konferencja Backend Days',     'CONFERENCE', '2026-11-21 09:00:00', 450, 249.00, 'Hala Stulecia',   'Wystawowa 1',       'Wrocław', '51-618'),
    ('Warsztaty fotografii mobilnej', 'WORKSHOP',  '2026-12-05 11:00:00',  20, 120.00, 'Pracownia Kadr',  null,                'Wrocław', null),
    ('Bieg Mikołajkowy 5 km',        'SPORT',      '2026-12-06 10:00:00', 800,  45.50, 'Park Szczytnicki', 'Adama Mickiewicza', 'Wrocław', '51-133');

-- ===== LAB 02 · organizer =====
insert into organizer (name, email, phone, verified, registered_on) values
    ('Wrocławskie Centrum Kultury', 'kontakt@wck.example.com',      '713001200', true,  '2026-09-15'),
    ('Backend Days sp. z o.o.',     'biuro@backenddays.example.com', null,        true,  '2026-10-02'),
    ('Anna Zielińska Foto',         'anna.foto@example.com',        '600700800', false, '2026-10-20');

-- ===== LAB 02 · reservation =====
insert into reservation (customer_name, customer_email, seats, reserved_at, status) values
    ('Marek Lis',         'marek.lis@example.com',    2, '2026-10-25 12:30:00', 'CONFIRMED'),
    ('Karolina Wójcik',   'k.wojcik@example.com',     4, '2026-10-26 18:05:00', 'PENDING'),
    ('Tomasz Kaczmarek',  'tomek.k@example.com',      1, '2026-10-27 09:45:00', 'CANCELLED');
