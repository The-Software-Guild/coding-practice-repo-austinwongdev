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