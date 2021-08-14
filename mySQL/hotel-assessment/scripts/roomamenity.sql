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
-- Table structure for table `roomamenity`
--

DROP TABLE IF EXISTS `roomamenity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roomamenity` (
  `roomNumber` int NOT NULL,
  `amenityID` int NOT NULL,
  PRIMARY KEY (`roomNumber`,`amenityID`),
  KEY `fk_roomamenity_amenity` (`amenityID`),
  CONSTRAINT `fk_roomamenity_amenity` FOREIGN KEY (`amenityID`) REFERENCES `amenity` (`amenityID`),
  CONSTRAINT `fk_roomamenity_room` FOREIGN KEY (`roomNumber`) REFERENCES `room` (`roomNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roomamenity`
--

LOCK TABLES `roomamenity` WRITE;
/*!40000 ALTER TABLE `roomamenity` DISABLE KEYS */;
INSERT INTO `roomamenity` VALUES (201,1),(203,1),(205,1),(206,1),(207,1),(208,1),(301,1),(303,1),(305,1),(306,1),(307,1),(308,1),(401,1),(402,1),(202,2),(204,2),(205,2),(206,2),(207,2),(208,2),(302,2),(304,2),(305,2),(306,2),(307,2),(308,2),(401,2),(402,2),(201,3),(203,3),(205,3),(207,3),(301,3),(303,3),(305,3),(307,3),(401,4),(402,4);
/*!40000 ALTER TABLE `roomamenity` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-13 14:55:42
