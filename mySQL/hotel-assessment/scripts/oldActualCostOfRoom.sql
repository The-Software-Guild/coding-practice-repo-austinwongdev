SELECT r.roomNumber 'Room Number',
	rr.reservationID 'Reservation ID',
    (rt.basePrice
		+ @jacuzziFee := IF(r.roomNumber in (SELECT roomNumber FROM roomamenity ra WHERE amenityID = 3), 25, 0)
        + @extraPersonFee := IF(rt.extraPersonPrice IS NULL, 0, IF(res.numAdults - rt.standardOccupancy <= 0, 0, rt.extraPersonPrice))
        ) * DATEDIFF(res.endDate, res.startDate) 'Total Cost of Room'
FROM room r
	INNER JOIN roomtype rt ON rt.roomTypeID = r.roomTypeID
	LEFT OUTER JOIN reservationroom rr ON rr.roomNumber = r.roomNumber
    LEFT OUTER JOIN reservation res on res.reservationID = rr.reservationID
ORDER BY ISNULL(res.reservationID), res.reservationID, r.roomNumber;