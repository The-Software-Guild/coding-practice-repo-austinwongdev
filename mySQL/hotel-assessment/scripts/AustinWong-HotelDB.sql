-- Austin Wong
-- 8/13/21
-- Creates database called AustinWongHotelDB designed to hold hotel data for the Guild Hotel. 
-- Tracks rooms, guests, and reservations at the hotel.

DROP DATABASE IF EXISTS AustinWongHotelDB;
CREATE DATABASE AustinWongHotelDB;
USE AustinWongHotelDB;

CREATE TABLE guest (
	guestID INT NOT NULL AUTO_INCREMENT,
    firstName VARCHAR(45) NOT NULL,
    lastName VARCHAR(45) NOT NULL,
    address VARCHAR(45) NOT NULL,
    city VARCHAR(45) NOT NULL,
    state CHAR(2) NOT NULL,
    zip CHAR(5) NOT NULL,
    phone CHAR(14) NOT NULL,
    CONSTRAINT pk_guest PRIMARY KEY (guestID)
);

CREATE TABLE amenity (
	amenityID INT NOT NULL AUTO_INCREMENT,
    amenityName VARCHAR(45) NOT NULL,
    CONSTRAINT pk_amenity PRIMARY KEY (amenityID)
);

CREATE TABLE roomtype (
	roomTypeID INT NOT NULL AUTO_INCREMENT,
    description VARCHAR(45) NOT NULL,
    standardOccupancy INT NOT NULL,
    maxOccupancy INT NOT NULL,
    basePrice DECIMAL(5,2) NOT NULL,
    extraPersonPrice DECIMAL(4,2),
    CONSTRAINT pk_roomtype PRIMARY KEY (roomTypeID)
);

CREATE TABLE room (
	roomNumber INT NOT NULL,
    roomTypeID INT NOT NULL,
    adaAccessible BOOLEAN NOT NULL,
    CONSTRAINT pk_room PRIMARY KEY (roomNumber),
    CONSTRAINT fk_room_roomtype FOREIGN KEY (roomTypeID)
		REFERENCES roomtype (roomTypeID)
);

CREATE TABLE reservation (
  reservationID INT NOT NULL,
  guestID INT NOT NULL,
  numAdults INT NOT NULL,
  numChildren INT NOT NULL,
  startDate DATE NOT NULL,
  endDate DATE NOT NULL,
  totalCost DECIMAL(6,2) NOT NULL,
  CONSTRAINT pk_reservation PRIMARY KEY (reservationID),
  CONSTRAINT fk_reservation_guest FOREIGN KEY (guestID)
	REFERENCES guest (guestID)
);

CREATE TABLE reservationroom (
	reservationID INT NOT NULL,
    roomNumber INT NOT NULL,
    CONSTRAINT pk_reservationroom PRIMARY KEY (reservationID, roomNumber),
    CONSTRAINT fk_reservationroom_room FOREIGN KEY (roomNumber)
		REFERENCES room (roomNumber),
	CONSTRAINT fk_reservationroom_reservation FOREIGN KEY (reservationID)
		REFERENCES reservation (reservationID)
);

CREATE TABLE roomamenity (
	roomNumber INT NOT NULL,
    amenityID INT NOT NULL,
    CONSTRAINT pk_roomamenity PRIMARY KEY (roomNumber, amenityID),
    CONSTRAINT fk_roomamenity_room FOREIGN KEY (roomNumber)
		REFERENCES room (roomNumber),
	CONSTRAINT fk_roomamenity_amenity FOREIGN KEY (amenityID)
		REFERENCES amenity (amenityID)
);