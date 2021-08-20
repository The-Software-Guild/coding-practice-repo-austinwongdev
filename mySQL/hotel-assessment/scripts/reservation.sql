-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: austinwonghoteldb
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservation` (
  `reservationID` int NOT NULL,
  `guestID` int NOT NULL,
  `numAdults` int NOT NULL,
  `numChildren` int NOT NULL,
  `startDate` date NOT NULL,
  `endDate` date NOT NULL,
  `totalCost` decimal(6,2) NOT NULL,
  PRIMARY KEY (`reservationID`),
  KEY `fk_reservation_guest` (`guestID`),
  CONSTRAINT `fk_reservation_guest` FOREIGN KEY (`guestID`) REFERENCES `guest` (`guestID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
INSERT INTO `reservation` VALUES (1,2,1,0,'2023-02-02','2023-02-04',299.98),(2,3,2,1,'2023-02-05','2023-02-10',999.95),(3,4,2,0,'2023-02-22','2023-02-24',349.98),(4,5,2,2,'2023-03-06','2023-03-07',199.99),(5,1,1,1,'2023-03-17','2023-03-20',524.97),(6,6,3,0,'2023-03-18','2023-03-23',924.95),(7,7,2,2,'2023-03-29','2023-03-31',349.98),(8,8,2,0,'2023-03-31','2023-04-05',874.95),(9,9,1,0,'2023-04-09','2023-04-13',799.96),(10,10,1,1,'2023-04-23','2023-04-24',174.99),(11,11,2,4,'2023-05-30','2023-06-02',1199.97),(12,12,2,0,'2023-06-10','2023-06-14',599.96),(13,6,3,0,'2023-06-17','2023-06-18',184.99),(14,1,2,0,'2023-06-28','2023-07-02',699.96),(15,9,3,1,'2023-07-13','2023-07-14',184.99),(16,10,4,2,'2023-07-18','2023-07-21',1259.97),(17,3,2,1,'2023-07-28','2023-07-29',199.99),(18,3,1,0,'2023-08-30','2023-09-01',349.98),(19,2,2,0,'2023-09-16','2023-09-17',149.99),(20,5,2,2,'2023-09-13','2023-09-15',399.98),(21,4,2,2,'2023-11-22','2023-11-25',1199.97),(22,2,2,0,'2023-11-22','2023-11-25',449.97),(23,11,2,0,'2023-12-24','2023-12-28',699.96);
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-13 14:53:52