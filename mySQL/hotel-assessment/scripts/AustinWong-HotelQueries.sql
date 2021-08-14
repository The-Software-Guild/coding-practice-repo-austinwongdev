-- Austin Wong
-- 8/13/2021

use austinwonghoteldb;

-- ------------------------------------------------------------------------------------------------------------------------------
-- 1. Write a query that returns a list of reservations that end in July 2023, including the name of the guest, the room 
--    number(s), and the reservation dates.
-- ------------------------------------------------------------------------------------------------------------------------------

SELECT CONCAT(g.firstName, ' ', g.lastName) 'Guest Name', 
    GROUP_CONCAT(rr.roomNumber SEPARATOR ', ') 'Room Number(s)', 
    res.startDate 'Check-In Date', res.endDate 'Check-Out Date'
FROM reservation res
	INNER JOIN guest g ON g.guestID = res.guestID
    INNER JOIN reservationroom rr ON res.reservationID = rr.reservationID
WHERE res.endDate >= '2023-07-01'
	AND res.endDate < '2023-08-01'
GROUP BY res.reservationID
ORDER BY res.startDate;

-- Result: 4 rows returned

-- # Guest Name, Room Number(s), Check-In Date, Check-Out Date
-- 'Austin Wong', '205', '2023-06-28', '2023-07-02'
-- 'Walter Holaway', '204', '2023-07-13', '2023-07-14'
-- 'Wilfred Vise', '401', '2023-07-18', '2023-07-21'
-- 'Bettyann Seery', '303', '2023-07-28', '2023-07-29'

-- ------------------------------------------------------------------------------------------------------------------------------
-- 2. Write a query that returns a list of all reservations for rooms with a jacuzzi, displaying the guest's name, the room 
--    number, and the dates of the reservation.
-- ------------------------------------------------------------------------------------------------------------------------------

SELECT CONCAT(g.firstName, ' ', g.lastName) 'Guest Name',
	r.roomNumber 'Room Number',
    res.startDate 'Check-In Date',
    res.endDate 'Check-Out Date'
FROM roomamenity ra
    INNER JOIN room r ON r.roomNumber = ra.roomNumber
    INNER JOIN reservationroom rr on rr.roomNumber = r.roomNumber
    INNER JOIN reservation res on res.reservationID = rr.reservationID
    INNER JOIN guest g on g.guestID = res.guestID
WHERE ra.amenityID = 3
ORDER BY g.lastName, g.firstName, res.startDate;

-- Result: 11 rows returned

-- # Guest Name, Room Number, Check-In Date, Check-Out Date
-- 'Duane Cullison', '305', '2023-02-22', '2023-02-24'
-- 'Walter Holaway', '301', '2023-04-09', '2023-04-13'
-- 'Bettyann Seery', '203', '2023-02-05', '2023-02-10'
-- 'Bettyann Seery', '303', '2023-07-28', '2023-07-29'
-- 'Bettyann Seery', '305', '2023-08-30', '2023-09-01'
-- 'Mack Simmer', '301', '2023-11-22', '2023-11-25'
-- 'Wilfred Vise', '207', '2023-04-23', '2023-04-24'
-- 'Austin Wong', '307', '2023-03-17', '2023-03-20'
-- 'Austin Wong', '205', '2023-06-28', '2023-07-02'
-- 'Karie Yang', '201', '2023-03-06', '2023-03-07'
-- 'Karie Yang', '203', '2023-09-13', '2023-09-15'

-- ----------------------------------------------------------------
-- -- ALTERNATIVE IF YOU DIDN'T KNOW JACUZZI'S AMENITYID WAS 3
-- SELECT CONCAT(g.firstName, ' ', g.lastName) 'Guest Name',
-- 	r.roomNumber 'Room Number',
--     res.startDate 'Check-In Date',
--     res.endDate 'Check-Out Date'
-- FROM amenity a
-- 	INNER JOIN roomamenity ra ON ra.amenityID = a.amenityID
--     INNER JOIN room r ON r.roomNumber = ra.roomNumber
--     INNER JOIN reservationroom rr on rr.roomNumber = r.roomNumber
--     INNER JOIN reservation res on res.reservationID = rr.reservationID
--     INNER JOIN guest g on g.guestID = res.guestID
-- WHERE a.amenityName = 'Jacuzzi'
-- ORDER BY g.lastName, g.firstName, res.startDate;

-- ------------------------------------------------------------------------------------------------------------------------------
-- 3. Write a query that returns all the rooms reserved for a specific guest, including the guest's name, the room(s) reserved, 
--    the starting date of the reservation, and how many people were included in the reservation. (Choose a guest's name from 
--    the existing data.)
-- ------------------------------------------------------------------------------------------------------------------------------

SELECT CONCAT(g.firstName, ' ', g.lastName) 'Guest Name',
	GROUP_CONCAT(rr.roomNumber SEPARATOR ', ') 'Room(s) Reserved',
    res.startDate 'Check-In Date',
    res.endDate 'Check-Out Date',
    (SUM(res.numAdults) + SUM(res.numChildren)) 'Number of People'
FROM reservationroom rr
	INNER JOIN reservation res ON res.reservationID = rr.reservationID
    INNER JOIN guest g ON g.guestID = res.guestID
WHERE g.firstName = 'Mack'
	AND g.lastName = 'Simmer'
GROUP BY res.reservationID
ORDER BY res.startDate;

-- Result: 3 rows returned

-- # Guest Name, Room(s) Reserved, Check-In Date, Check-Out Date, Number of People
-- 'Mack Simmer', '308', '2023-02-02', '2023-02-04', '1'
-- 'Mack Simmer', '208', '2023-09-16', '2023-09-17', '2'
-- 'Mack Simmer', '206, 301', '2023-11-22', '2023-11-25', '4'

-- ------------------------------------------------------------------------------------------------------------------------------
-- 4. Write a query that returns a list of rooms, reservation ID, and per-room cost for each reservation. The results should 
--    include all rooms, whether or not there is a reservation associated with the room.
-- ------------------------------------------------------------------------------------------------------------------------------

-- Average cost of room per reservation
SELECT r.roomNumber 'Room Number',
	rr.reservationID 'Reservation ID',
    FORMAT(res.totalCost / (SELECT count(*) FROM reservationroom resroom WHERE resroom.reservationID = rr.reservationID), 2) 'Per Room Cost'
FROM room r
	LEFT OUTER JOIN reservationroom rr ON rr.roomNumber = r.roomNumber
    LEFT OUTER JOIN reservation res on res.reservationID = rr.reservationID
GROUP BY res.reservationID, r.roomNumber
ORDER BY ISNULL(res.reservationID), res.reservationID, r.roomNumber;

-- Result: 26 rows returned

-- # Room Number, Reservation ID, Per Room Cost
-- '308', '1', '299.98'
-- '203', '2', '999.95'
-- '305', '3', '349.98'
-- '201', '4', '199.99'
-- '307', '5', '524.97'
-- '302', '6', '924.95'
-- '202', '7', '349.98'
-- '301', '9', '799.96'
-- '207', '10', '174.99'
-- '401', '11', '1,199.97'
-- '206', '12', '599.96'
-- '208', '12', '599.96'
-- '304', '13', '184.99'
-- '205', '14', '699.96'
-- '204', '15', '184.99'
-- '401', '16', '1,259.97'
-- '303', '17', '199.99'
-- '305', '18', '349.98'
-- '208', '19', '149.99'
-- '203', '20', '399.98'
-- '401', '21', '1,199.97'
-- '206', '22', '524.97'
-- '301', '22', '524.97'
-- '302', '23', '699.96'
-- '306', NULL, NULL
-- '402', NULL, NULL

-- ------------------------------------------------------------------------------------------------------------------------------
-- 5. Write a query that returns all rooms with a capacity of three or more and that are reserved on any date in April 2023.
-- ------------------------------------------------------------------------------------------------------------------------------

SELECT r.roomNumber 'Room Number'
FROM reservationroom rr
	INNER JOIN reservation res ON res.reservationID = rr.reservationID
    INNER JOIN room r ON r.roomNumber = rr.roomNumber
    INNER JOIN roomtype rt ON rt.roomTypeID = r.roomTypeID
WHERE rt.maxOccupancy >= 3
	AND res.startDate >= '2023-04-01'
	AND res.startDate < '2023-05-01';

-- Result: 1 row returned

-- # Room Number
-- '301'

-- ------------------------------------------------------------------------------------------------------------------------------
-- 6. Write a query that returns a list of all guest names and the number of reservations per guest, sorted starting with the
--    guest with the most reservations and then by the guest's last name.
-- ------------------------------------------------------------------------------------------------------------------------------

SELECT CONCAT(g.firstName, ' ', g.lastName) 'Guest Name',
	COUNT(reservationID) 'Number of Reservations'
FROM guest g
	LEFT OUTER JOIN reservation r ON r.guestID = g.guestID
GROUP BY g.guestID
ORDER BY COUNT(reservationID) DESC, g.lastName;

-- Result: 11 rows returned

-- # Guest Name, Number of Reservations
-- 'Bettyann Seery', '3'
-- 'Mack Simmer', '3'
-- 'Duane Cullison', '2'
-- 'Walter Holaway', '2'
-- 'Aurore Lipton', '2'
-- 'Maritza Tilton', '2'
-- 'Wilfred Vise', '2'
-- 'Austin Wong', '2'
-- 'Karie Yang', '2'
-- 'Zachery Luechtefeld', '1'
-- 'Joleen Tison', '1'

-- ------------------------------------------------------------------------------------------------------------------------------
-- 7. Write a query that displays the name, address, and phone number of a guest based on their phone number. 
--    (Choose a phone number from the existing data.)
-- ------------------------------------------------------------------------------------------------------------------------------

SELECT CONCAT(firstName, ' ', lastName) 'Guest Name',
	address 'Address',
    phone 'Phone Number'
FROM guest
WHERE phone = '(291) 553-0508';

-- Result: 1 row returned

-- # Guest Name, Address, Phone Number
-- 'Mack Simmer', '379 Old Shore Street', '(291) 553-0508'