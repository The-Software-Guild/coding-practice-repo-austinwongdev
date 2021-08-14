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
-- Table structure for table `guest`
--

DROP TABLE IF EXISTS `guest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `guest` (
  `guestID` int NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `state` char(2) NOT NULL,
  `zip` char(5) NOT NULL,
  `phone` char(14) NOT NULL,
  PRIMARY KEY (`guestID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guest`
--

LOCK TABLES `guest` WRITE;
/*!40000 ALTER TABLE `guest` DISABLE KEYS */;
INSERT INTO `guest` VALUES (1,'Austin','Wong','123 Fake St','Springfield','IL','12345','(123) 867-5309'),(2,'Mack','Simmer','379 Old Shore Street','Council Bluffs','IA','51501','(291) 553-0508'),(3,'Bettyann','Seery','750 Wintergreen Dr.','Wasilla','AK','99654','(478) 277-9632'),(4,'Duane','Cullison','9662 Foxrun Lane','Harlingen','TX','78552','(308) 494-0198'),(5,'Karie','Yang','9378 W. Augusta Ave.','West Deptford','NJ','8096','(214) 730-0298'),(6,'Aurore','Lipton','762 Wild Rose Street','Saginaw','MI','48601','(377) 507-0974'),(7,'Zachery','Luechtefeld','7 Poplar Dr.','Arvada','CO','80003','(814) 485-2615'),(8,'Jeremiah','Pendergrass','70 Oakwood St.','Zion','IL','60099','(279) 491-0960'),(9,'Walter','Holaway','7556 Arrowhead St.','Cumberland','RI','2864','(446) 396-6785'),(10,'Wilfred','Vise','77 West Surrey Street','Oswego','NY','13126','(834) 727-1001'),(11,'Maritza','Tilton','939 Linda Rd.','Burke','VA','22015','(446) 351-6860'),(12,'Joleen','Tison','87 Queen St.','Drexel Hill','PA','19026','(231) 893-2755');
/*!40000 ALTER TABLE `guest` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-13 14:47:57
