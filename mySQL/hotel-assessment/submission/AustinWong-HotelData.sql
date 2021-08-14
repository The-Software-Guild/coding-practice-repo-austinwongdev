-- Austin Wong
-- 8/13/21
-- Inserts data into AustinWongHotelDB, then removes records related to Jeremiah Pendergrass and his reservations

-- ---------------------------------------------------------
-- Add all data
-- ---------------------------------------------------------
INSERT INTO `guest` VALUES (1,'Austin','Wong','123 Fake St','Springfield','IL','12345','(123) 867-5309'),(2,'Mack','Simmer','379 Old Shore Street','Council Bluffs','IA','51501','(291) 553-0508'),(3,'Bettyann','Seery','750 Wintergreen Dr.','Wasilla','AK','99654','(478) 277-9632'),(4,'Duane','Cullison','9662 Foxrun Lane','Harlingen','TX','78552','(308) 494-0198'),(5,'Karie','Yang','9378 W. Augusta Ave.','West Deptford','NJ','8096','(214) 730-0298'),(6,'Aurore','Lipton','762 Wild Rose Street','Saginaw','MI','48601','(377) 507-0974'),(7,'Zachery','Luechtefeld','7 Poplar Dr.','Arvada','CO','80003','(814) 485-2615'),(8,'Jeremiah','Pendergrass','70 Oakwood St.','Zion','IL','60099','(279) 491-0960'),(9,'Walter','Holaway','7556 Arrowhead St.','Cumberland','RI','2864','(446) 396-6785'),(10,'Wilfred','Vise','77 West Surrey Street','Oswego','NY','13126','(834) 727-1001'),(11,'Maritza','Tilton','939 Linda Rd.','Burke','VA','22015','(446) 351-6860'),(12,'Joleen','Tison','87 Queen St.','Drexel Hill','PA','19026','(231) 893-2755');
INSERT INTO `amenity` VALUES (1,'Microwave'),(2,'Refrigerator'),(3,'Jacuzzi'),(4,'Oven');
INSERT INTO `roomtype` VALUES (1,'Single',2,2,149.99,NULL),(2,'Double',2,4,174.99,10.00),(3,'Suite',3,8,399.99,20.00);
INSERT INTO `room` VALUES (201,2,0),(202,2,1),(203,2,0),(204,2,1),(205,1,0),(206,1,1),(207,1,0),(208,1,1),(301,2,0),(302,2,1),(303,2,0),(304,2,1),(305,1,0),(306,1,1),(307,1,0),(308,1,1),(401,3,1),(402,3,1);
INSERT INTO `reservation` VALUES (1,2,1,0,'2023-02-02','2023-02-04',299.98),(2,3,2,1,'2023-02-05','2023-02-10',999.95),(3,4,2,0,'2023-02-22','2023-02-24',349.98),(4,5,2,2,'2023-03-06','2023-03-07',199.99),(5,1,1,1,'2023-03-17','2023-03-20',524.97),(6,6,3,0,'2023-03-18','2023-03-23',924.95),(7,7,2,2,'2023-03-29','2023-03-31',349.98),(8,8,2,0,'2023-03-31','2023-04-05',874.95),(9,9,1,0,'2023-04-09','2023-04-13',799.96),(10,10,1,1,'2023-04-23','2023-04-24',174.99),(11,11,2,4,'2023-05-30','2023-06-02',1199.97),(12,12,3,0,'2023-06-10','2023-06-14',1199.92),(13,6,3,0,'2023-06-17','2023-06-18',184.99),(14,1,2,0,'2023-06-28','2023-07-02',699.96),(15,9,3,1,'2023-07-13','2023-07-14',184.99),(16,10,4,2,'2023-07-18','2023-07-21',1259.97),(17,3,2,1,'2023-07-28','2023-07-29',199.99),(18,3,1,0,'2023-08-30','2023-09-01',349.98),(19,2,2,0,'2023-09-16','2023-09-17',149.99),(20,5,2,2,'2023-09-13','2023-09-15',399.98),(21,4,2,2,'2023-11-22','2023-11-25',1199.97),(22,2,4,2,'2023-11-22','2023-11-25',1049.94),(23,11,2,0,'2023-12-24','2023-12-28',699.96);
INSERT INTO `reservationroom` VALUES (4,201),(7,202),(2,203),(20,203),(15,204),(14,205),(12,206),(22,206),(10,207),(12,208),(19,208),(9,301),(22,301),(6,302),(23,302),(17,303),(8,304),(13,304),(3,305),(18,305),(5,307),(1,308),(11,401),(16,401),(21,401);
INSERT INTO `roomamenity` VALUES (201,1),(203,1),(205,1),(206,1),(207,1),(208,1),(301,1),(303,1),(305,1),(306,1),(307,1),(308,1),(401,1),(402,1),(202,2),(204,2),(205,2),(206,2),(207,2),(208,2),(302,2),(304,2),(305,2),(306,2),(307,2),(308,2),(401,2),(402,2),(201,3),(203,3),(205,3),(207,3),(301,3),(303,3),(305,3),(307,3),(401,4),(402,4);

-- ---------------------------------------------------------
-- Remove Jeremiah Pendergrass and his reservations from db
-- ---------------------------------------------------------
-- SIMPLE WAY

-- Delete reservationroom records
DELETE
FROM reservationroom
WHERE reservationID = 8;

-- Delete reservation records
DELETE
FROM reservation
WHERE guestID = 8;

-- Delete guest records
DELETE
FROM guest
WHERE guestID = 8;

-- HARDER WAY

-- SET @firstNameGuestToDelete := 'Jeremiah';
-- SET @lastNameGuestToDelete := 'Pendergrass';

-- -- Delete reservationroom records
-- DELETE rr FROM reservationroom rr
-- 	INNER JOIN reservation r ON r.reservationID = rr.reservationID
-- 	INNER JOIN guest g on g.guestID = r.guestID
-- WHERE g.lastName = @lastNameGuestToDelete
-- 	AND g.firstName = @firstNameGuestToDelete;
--     
-- -- Delete reservation records
-- DELETE r
-- FROM reservation r
-- 	INNER JOIN guest g on g.guestID = r.guestID
-- WHERE g.lastName = @lastNameGuestToDelete
-- 	AND g.firstName = @firstNameGuestToDelete;
--     
-- -- Delete guest records
-- SET SQL_SAFE_UPDATES = 0;
-- DELETE
-- FROM guest g
-- WHERE g.lastName = @lastNameGuestToDelete
-- 	AND g.firstName = @firstNameGuestToDelete;
-- SET SQL_SAFE_UPDATES = 1;