CREATE DATABASE  IF NOT EXISTS `limitlessdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `limitlessdb`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: limitlessdb
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `address_id` int NOT NULL AUTO_INCREMENT,
  `house_no` varchar(45) DEFAULT NULL,
  `building_name` varchar(45) DEFAULT NULL,
  `area` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `pincode` int NOT NULL,
  `regby` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB AUTO_INCREMENT=110 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'F-101','Westone Society','Wakkad','Pune',411056,'builder'),(2,'F-205','Dream Square Society','Loahgaon','Pune',411047,'admin'),(3,'H-120','Aradhya','Pimpri','Pune',432058,'marketing'),(4,'F-135','Kumar Residency','Akurdi','Pune',416250,'executive'),(5,'H-235','Aster Housing Society','Katraj','Pune',421360,'customer'),(6,'H-175','Bhimdeep Society','Deccan','Pune',400106,'builder'),(8,'P-132/1',NULL,'Kothrud','Pune',443260,'project'),(9,'P-20/A',NULL,'Hadapsar','Pune',412563,'project'),(10,'P-101',NULL,'Chinchwad','Pune',402135,'project'),(15,'4845','adesas','pudne','pakdis',16541,'customer'),(17,'10','xxx','ooo','Pune',411038,'customer'),(18,'30','avilla','Rahatani','pune',563214,'customer'),(19,'A-1004','Aramada','Wagholi','Pune',0,'customer'),(27,'36','Aramada','Wagholi','pune',462513,'builder'),(28,'30','avilla','Rahatani','pune',154654,'builder'),(29,'5','fghfy','Karvenagar','malegaon',68465,'marketing'),(30,'65465','sjhdgshgd','ehgfsuefgy','hfdsehdf',6545,'builder'),(31,'25','regerg','erge','rgeg',1654,'builder'),(43,'Z-420','Shubham Villa','Yerwada','Pune',411025,'builder'),(44,'301','dream square','lohegaon','pune',411047,'builder'),(45,'301','sk','abcd','pune',458769,'builder'),(46,'45','kk','g','pune',411047,'builder'),(55,'12','high','raharani','pune',414105,'builder'),(65,'54','puhol','pimpri','pune',489710,'builder'),(66,'arw','dxgzs','dxg','pune',489710,'builder'),(68,'75','dvdfb','gnfxjn','pune',568686,'builder'),(69,'657','bfdnbg','ngsn','nbnfh',467673,'builder'),(71,'p-13/2','','Hadapsar','pune',484517,'project'),(72,'p-300','','Kothrud','pune',648845,'project'),(77,'a-98','asscf','alandi','pune',476577,'executive'),(78,'50','breeze','Chinchwad','pune',452005,'project'),(79,'103','Westone','Wakad','Pune',411057,'project'),(80,'12','Westone','Alandi','Pune',431203,'project'),(81,'12','Westone','12','Pune',431203,'customer'),(82,'12','Westone','12','Pune',431203,'customer'),(83,'12','Westone','12','Pune',431203,'customer'),(84,'12','Skydale','wakad','pune',411057,'builder'),(85,'123','sfsd','asdg','dsbsd',234233,'builder'),(86,'wewe','dsgdf','cdbhdafb','fdhbdf',23214,'builder'),(87,'sdgfg','QDSFNSD','DFNFDB ','FDND',2353465,'builder'),(88,'sdgfg','QDSFNSD','DFNFDB ','FDND',2353465,'builder'),(89,'sgfsdg','dshsdfg','fdnfxb','bxfndf',0,'builder'),(90,'3252','dfgsba','dshfsd','bvmcg',43634,'builder'),(91,'426','dfbdfb2323','34y3vbndf','dbdbs',4326,'builder'),(92,'g','sdgs','dsbsdbsd','xcbdx',34634,'builder'),(93,'sdg','sfdbdfbs','erhfd','erfhbdfb',0,'builder'),(94,'420','twin tower','wakad','pune',411047,'builder'),(95,'P-132/1','revel orchid','Alandi','Pune',443260,'project'),(96,'54','','nbdcv','dsmnb',65,'project'),(97,'A-1004','','Warje','Pune',411048,'project'),(98,'541','B-Homes','Ghokle nagar','Pune',411046,'marketing'),(99,'567','C-Homes','Katraj','Pune',411044,'marketing'),(100,'007','Maharaj Buildings','Model Colony','Pune',411067,'executive'),(101,'511','Reddy\'s Building','Hinjewadi','Pune',412089,'executive'),(102,'342','Nawab\'s Building','Vagoli','Pune',430124,'marketing'),(103,'9','soham apartment','wakad','pone',452005,'marketing'),(104,'7','avilla','pimpri','pune',450052,'builder'),(105,'324','akara','alandi','Pune',412089,'executive'),(106,'A-1004','Aramada','pimpri','Pune',430124,'customer'),(107,'Plot-150','','Aundh','Pune',45789,'project'),(108,'78','fantacy society','deccan','pune',411047,'executive'),(109,'78','abcd','deccan','pune',411047,'builder');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `builder_executive`
--

DROP TABLE IF EXISTS `builder_executive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `builder_executive` (
  `builder_exe_id` int NOT NULL AUTO_INCREMENT,
  `login_id` int DEFAULT NULL,
  `builder_id` int DEFAULT NULL,
  `project_id` int DEFAULT NULL,
  PRIMARY KEY (`builder_exe_id`),
  KEY `fk_login9_id` (`login_id`),
  KEY `fk_builder9_id_idx` (`builder_id`),
  KEY `fk_project9_id_idx` (`project_id`),
  CONSTRAINT `fk_builder9_id` FOREIGN KEY (`builder_id`) REFERENCES `builder_reg` (`builder_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_login9_id` FOREIGN KEY (`login_id`) REFERENCES `user_details` (`login_id`),
  CONSTRAINT `fk_project9_id` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `builder_executive`
--

LOCK TABLES `builder_executive` WRITE;
/*!40000 ALTER TABLE `builder_executive` DISABLE KEYS */;
INSERT INTO `builder_executive` VALUES (1,4,NULL,NULL),(2,4,NULL,NULL),(3,4,NULL,NULL);
/*!40000 ALTER TABLE `builder_executive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `builder_reg`
--

DROP TABLE IF EXISTS `builder_reg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `builder_reg` (
  `builder_id` int NOT NULL AUTO_INCREMENT,
  `firm_name` varchar(45) DEFAULT NULL,
  `reg_no` varchar(45) DEFAULT NULL,
  `login_id` int DEFAULT NULL,
  PRIMARY KEY (`builder_id`),
  KEY `fk_login5_id` (`login_id`),
  CONSTRAINT `fk_login5_id` FOREIGN KEY (`login_id`) REFERENCES `user_details` (`login_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `builder_reg`
--

LOCK TABLES `builder_reg` WRITE;
/*!40000 ALTER TABLE `builder_reg` DISABLE KEYS */;
INSERT INTO `builder_reg` VALUES (1,'SK_Builder','11011',2),(2,'Kirloskar Properties','10001',6),(13,'Shree Builder','7894561230',29),(21,'kishor constructions','121',37),(22,'hgfjdg','8795',49),(23,'Deva & Shree Associates','123123123',66),(24,'Gaitonde Properties','720',68),(25,'pride world','567878',75),(26,'harsh firm','456123',79);
/*!40000 ALTER TABLE `builder_reg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `buildings`
--

DROP TABLE IF EXISTS `buildings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `buildings` (
  `building_id` int NOT NULL AUTO_INCREMENT,
  `category_id` int DEFAULT NULL,
  `total_flats` int DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  `project_details_id` int DEFAULT NULL,
  PRIMARY KEY (`building_id`),
  KEY `fk_category8_id` (`category_id`),
  KEY `FK7o6rtmel8ghkty7dfsbjlemvb` (`project_details_id`),
  CONSTRAINT `FK7o6rtmel8ghkty7dfsbjlemvb` FOREIGN KEY (`project_details_id`) REFERENCES `project_details` (`project_details_id`),
  CONSTRAINT `fk_category8_id` FOREIGN KEY (`category_id`) REFERENCES `flat_categories` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buildings`
--

LOCK TABLES `buildings` WRITE;
/*!40000 ALTER TABLE `buildings` DISABLE KEYS */;
INSERT INTO `buildings` VALUES (1,1,20,'60Lac',1),(2,2,10,'45Lac',1),(3,1,20,'35Lac',2),(4,2,20,'50Lac',2),(5,3,10,'85Lac',3),(6,2,30,'65Lac',3),(7,1,20,'50Lac',4),(8,2,30,'70Lac',4),(9,1,30,'45Lac',5),(10,1,60,'45.50Lac',7),(11,3,10,'70.50Lacs',8),(12,2,50,'-75 Lacs',9);
/*!40000 ALTER TABLE `buildings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favourites`
--

DROP TABLE IF EXISTS `favourites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `favourites` (
  `favourite_id` int NOT NULL AUTO_INCREMENT,
  `login_id` int DEFAULT NULL,
  `project_id` int DEFAULT NULL,
  PRIMARY KEY (`favourite_id`),
  KEY `fk_login12_id` (`login_id`),
  KEY `fk_project12_id_idx` (`project_id`),
  CONSTRAINT `fk_login12_id` FOREIGN KEY (`login_id`) REFERENCES `user_details` (`login_id`),
  CONSTRAINT `fk_project12_id` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favourites`
--

LOCK TABLES `favourites` WRITE;
/*!40000 ALTER TABLE `favourites` DISABLE KEYS */;
INSERT INTO `favourites` VALUES (10,5,7),(11,14,3),(13,5,1),(14,5,3),(15,14,2),(16,14,1),(17,77,2),(18,5,14),(19,5,11),(20,5,2),(21,55,13),(22,55,14);
/*!40000 ALTER TABLE `favourites` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flat_categories`
--

DROP TABLE IF EXISTS `flat_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flat_categories` (
  `category_id` int NOT NULL,
  `category_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flat_categories`
--

LOCK TABLES `flat_categories` WRITE;
/*!40000 ALTER TABLE `flat_categories` DISABLE KEYS */;
INSERT INTO `flat_categories` VALUES (1,'1-BHK'),(2,'2-BHK'),(3,'3-BHK'),(4,'4-BHK'),(5,'Row-House');
/*!40000 ALTER TABLE `flat_categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flat_types`
--

DROP TABLE IF EXISTS `flat_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flat_types` (
  `type_id` int NOT NULL,
  `type_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`type_id`),
  UNIQUE KEY `type_id_UNIQUE` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flat_types`
--

LOCK TABLES `flat_types` WRITE;
/*!40000 ALTER TABLE `flat_types` DISABLE KEYS */;
INSERT INTO `flat_types` VALUES (1,'Full-Furnished'),(2,'Semi-Furnished'),(3,'Non-Furnished');
/*!40000 ALTER TABLE `flat_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forget_password_que`
--

DROP TABLE IF EXISTS `forget_password_que`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `forget_password_que` (
  `forget_pwd_que_id` int NOT NULL,
  `question` varchar(60) NOT NULL,
  PRIMARY KEY (`forget_pwd_que_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forget_password_que`
--

LOCK TABLES `forget_password_que` WRITE;
/*!40000 ALTER TABLE `forget_password_que` DISABLE KEYS */;
INSERT INTO `forget_password_que` VALUES (1,'What is your Pet Name ?'),(2,'What is your nick name ?'),(3,'What is your birth place ?'),(4,'What is your Lucky number ?'),(5,'What is your favourite color ?');
/*!40000 ALTER TABLE `forget_password_que` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project_details`
--

DROP TABLE IF EXISTS `project_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project_details` (
  `project_details_id` int NOT NULL AUTO_INCREMENT,
  `building_name` varchar(45) DEFAULT NULL,
  `total_flats` int DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `project_id` int DEFAULT NULL,
  PRIMARY KEY (`project_details_id`),
  KEY `fk_type7_id` (`type_id`),
  KEY `fk_project7_id_idx` (`project_id`),
  CONSTRAINT `fk_project7_id` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_type7_id` FOREIGN KEY (`type_id`) REFERENCES `flat_types` (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project_details`
--

LOCK TABLES `project_details` WRITE;
/*!40000 ALTER TABLE `project_details` DISABLE KEYS */;
INSERT INTO `project_details` VALUES (1,'A-Wing',30,3,1),(2,'B-Wing',40,2,1),(3,'A-Wing',40,1,2),(4,'A-Wing',50,1,3),(5,'B-Wing',30,2,3),(6,'A-Wing',30,2,7),(7,'A',60,2,12),(8,'A',10,1,13),(9,'A-Wing',50,1,14);
/*!40000 ALTER TABLE `project_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projects`
--

DROP TABLE IF EXISTS `projects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `projects` (
  `project_id` int NOT NULL AUTO_INCREMENT,
  `project_name` varchar(45) DEFAULT NULL,
  `contact_no` varchar(45) DEFAULT NULL,
  `rera_no` int NOT NULL,
  `total_buildings` int DEFAULT NULL,
  `total_flats` int DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `address_id` int DEFAULT NULL,
  `builder_id` int DEFAULT NULL,
  PRIMARY KEY (`project_id`),
  UNIQUE KEY `rera_no_UNIQUE` (`rera_no`),
  KEY `fk_address6_id_idx` (`address_id`),
  KEY `fk_builder6_id_idx` (`builder_id`),
  CONSTRAINT `fk_address6_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_builder6_id` FOREIGN KEY (`builder_id`) REFERENCES `builder_reg` (`builder_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projects`
--

LOCK TABLES `projects` WRITE;
/*!40000 ALTER TABLE `projects` DISABLE KEYS */;
INSERT INTO `projects` VALUES (1,'Mudra Residency Park','8462791305',13579,2,70,'2022-05-01','2023-05-31',8,1),(2,'Aura_Elite','7891230456',24680,1,40,'2022-01-01','2023-08-15',9,1),(3,'Skyline','7412365890',13025,2,80,'2021-11-01','2023-03-15',10,2),(6,'aura','658742632',1023,2,100,'2022-10-11','2024-01-26',71,13),(7,'starworld','958765446',53635,2,60,'2023-01-01','2024-05-31',72,13),(11,'Orchid Residency Park','8345869705',1357896,1,70,'2022-04-30','2023-05-30',95,2),(12,'Gokhale park','354654',6546,1,60,'2023-03-31','2023-03-31',96,1),(13,'Rahul Park','123457896',147098765,5,50,'2023-03-23','2025-07-16',97,13),(14,'SkyLine Heights','789456123',2354778,1,50,'2023-03-15','2023-03-14',107,1);
/*!40000 ALTER TABLE `projects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(25) NOT NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE KEY `role_id_UNIQUE` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'Admin'),(2,'Builder'),(3,'Marketing Mgr'),(4,'Executive'),(5,'Customer');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `site_visits`
--

DROP TABLE IF EXISTS `site_visits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `site_visits` (
  `site_visit_id` int NOT NULL AUTO_INCREMENT,
  `customer_login_id` int DEFAULT NULL,
  `executive_login_id` int DEFAULT NULL,
  `requeststatus` tinyint DEFAULT '0',
  `customer_feedback` varchar(1000) DEFAULT NULL,
  `executive_feedback` varchar(1000) DEFAULT NULL,
  `project_id` int DEFAULT NULL,
  `visitedstatus` tinyint DEFAULT '0',
  PRIMARY KEY (`site_visit_id`),
  KEY `fk_login13cust_id` (`customer_login_id`),
  KEY `fk_login13exe_id` (`executive_login_id`),
  KEY `fk_project13_id_idx` (`project_id`),
  CONSTRAINT `fk_login13cust_id` FOREIGN KEY (`customer_login_id`) REFERENCES `user_details` (`login_id`),
  CONSTRAINT `fk_login13exe_id` FOREIGN KEY (`executive_login_id`) REFERENCES `user_details` (`login_id`),
  CONSTRAINT `fk_project13_id` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `site_visits`
--

LOCK TABLES `site_visits` WRITE;
/*!40000 ALTER TABLE `site_visits` DISABLE KEYS */;
INSERT INTO `site_visits` VALUES (1,5,4,1,'Good Project','Customer Interested',1,1),(2,5,4,1,NULL,NULL,3,0),(3,5,4,1,NULL,NULL,7,0),(12,5,NULL,0,NULL,NULL,2,NULL),(13,55,NULL,0,NULL,NULL,13,NULL),(14,55,NULL,0,NULL,NULL,14,NULL),(15,5,NULL,0,NULL,NULL,3,NULL);
/*!40000 ALTER TABLE `site_visits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `source`
--

DROP TABLE IF EXISTS `source`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `source` (
  `source_id` int NOT NULL,
  `source_type` varchar(45) NOT NULL,
  PRIMARY KEY (`source_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `source`
--

LOCK TABLES `source` WRITE;
/*!40000 ALTER TABLE `source` DISABLE KEYS */;
INSERT INTO `source` VALUES (1,'Whatsapp'),(2,'FaceBook'),(3,'Hoarding'),(4,'Newspaper'),(5,'Emails');
/*!40000 ALTER TABLE `source` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_details`
--

DROP TABLE IF EXISTS `user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_details` (
  `login_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `mobile_no` varchar(45) DEFAULT NULL,
  `email_id` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `role_id` int DEFAULT NULL,
  `status` tinyint DEFAULT NULL,
  `source_id` int DEFAULT NULL,
  `forget_pwd_que_id` int DEFAULT NULL,
  `answer` varchar(45) DEFAULT NULL,
  `address_id` int DEFAULT NULL,
  PRIMARY KEY (`login_id`),
  UNIQUE KEY `login_id_UNIQUE` (`login_id`),
  UNIQUE KEY `password_UNIQUE` (`password`),
  UNIQUE KEY `email_id_UNIQUE` (`email_id`),
  KEY `fk_role_id` (`role_id`),
  KEY `fk_source_id` (`source_id`),
  KEY `fk_pwdque_id` (`forget_pwd_que_id`),
  KEY `fk_address_id_idx` (`address_id`),
  CONSTRAINT `FK2j3d435pe9j2ajtoxfgpcj4i` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`),
  CONSTRAINT `fk_pwdque_id` FOREIGN KEY (`forget_pwd_que_id`) REFERENCES `forget_password_que` (`forget_pwd_que_id`),
  CONSTRAINT `fk_role_id` FOREIGN KEY (`role_id`) REFERENCES `roles` (`role_id`),
  CONSTRAINT `fk_source_id` FOREIGN KEY (`source_id`) REFERENCES `source` (`source_id`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_details`
--

LOCK TABLES `user_details` WRITE;
/*!40000 ALTER TABLE `user_details` DISABLE KEYS */;
INSERT INTO `user_details` VALUES (1,'Jay','Dode','9654871230','jay@gmail.com','jay123',1,1,NULL,1,'hero',2),(2,'Shrey','Kale','9654231087','shreyk@gmail.com','shrey123',2,1,NULL,3,'jalna',1),(3,'Yogesh','Dhokne','8654793201','yogeshd@gmail.com','yogesh123',3,1,NULL,2,'tony',3),(4,'Mohan','Anna','8520316479','mohana@gmail.com','mohan123',4,1,NULL,1,'thaliava',4),(5,'Nishant','Dhole','9631478520','nishantd@gmail.com','nishant123',5,1,4,4,'8520',5),(6,'Rana','Pratap','7896301452','ranap@gmail.com','rana123',2,1,NULL,1,'senapati',6),(13,'demo','sample','9559','rs@fmsssa@myfail','rs12dff2343',5,1,2,2,'yeus',15),(14,'bakul','joshi','3434343434','bj@gmail.com','bj123',2,1,2,3,'sss',17),(15,'akbar','birbal','85213647902','akbarb@gmail.com','akbar123',2,0,4,4,'1230',18),(16,'Samrudhi','Chavan','7896541235','Sam@gmail.com','sam123',2,0,4,3,'Nashik',19),(21,'Grijesh','Gupta','08564213970','gg@gmail.com','gg123',2,1,NULL,3,'bihar',27),(22,'onkar','rokade','456987','onkar@gmail.com','onkar123',2,1,NULL,1,'kutta',28),(23,'nikhil','jadhav','65465','nikhil@gmail.com','nikhil123',3,1,NULL,5,'papa',29),(24,'aditya','warke','987987','aditya@gmail.com','aditya123',2,1,NULL,2,'motu',30),(25,'tushar','mahajan','684685','tushar@gmail.com','tushar123',2,0,NULL,2,'tushar',31),(29,'Shubham','Maskhe','784512369','shubham@gmail.com','shubham123',2,0,NULL,2,'shu',43),(30,'shekhar','karke','2345656','shekhar@gmail.com','shekhar123',2,1,NULL,2,'sheku',44),(31,'kartik','karke','123654789','kartik@gmail.com','kartik123',2,1,NULL,1,'pappu',46),(37,'kishor','raut','9595599231','kishorr@gmail.com','kishor123',2,1,NULL,2,'kishu',55),(46,'mahesh','giri','9756786597','maheshd@gmail.com','mahesh123',2,1,NULL,4,'5634',65),(47,'mahesh','giri','09756786597','yogesshd@gmafil.com','sedc234',2,1,NULL,1,'df',66),(48,'kihjpj','jkghiugu','35453','gngfnd@gmail.com','bvcbv242',2,1,NULL,4,'4456',68),(49,'nsgjmhj,','mhd,jmdg','76959894','j,d,f,d@gmail.com','dgnngn4536',2,1,NULL,4,'874u8',69),(54,'akshay','verma','43657598098','akshayv@gmail.com','akki123',4,1,NULL,2,'akki',77),(55,'Suneet','Thale','9665448181','suneet@gmail.com','suneet123',5,1,1,1,'dog',79),(59,'Suneet','Thale','1231231231','suneet1@gmail.com','Suneet@12',5,1,1,2,'abc',83),(60,'Suneet','Thale','1231231231','suneetthale@gmail.com','Suneet@123',2,1,NULL,3,'jalna',84),(61,'Kitty','Kale','2342342342','kitty@gmail.com','Kitty@1',2,1,NULL,1,'bihar',85),(62,'asdf','dsg','233242353','asdf@gmail.com','asdf@1',2,1,NULL,2,'Nashik',86),(63,'data','dsgsdg','2352346362','data@gmail.com','data@1',2,1,NULL,2,'sdgsd',89),(64,'harshal','dsgsd','3523463463','harshal@gmail.com','harshal',2,1,NULL,1,'',90),(66,'deva','deva','6346','deva@gmail.com','deva@123',2,1,NULL,2,'efsd',92),(67,'google','dsbsd','454534','google@gmail.com','google123',2,1,NULL,2,'',93),(68,'ganesh','gaitonde','7896541230','ganesh@gmail.com','ganesh123',2,1,NULL,2,'kukuu',94),(69,'Ritesh','deshmukh','9848022338','ritesh@gmail.com','ritesh123',3,1,NULL,2,'rites',98),(70,'Yuvraj','singh','9327849721','yuvraj@gmail.com','yuvraj123',3,1,NULL,3,'Native place',99),(71,'Virendar','Sehwag','8844634152','virendar@gmail.com','virendar123',4,1,NULL,2,'viru',100),(72,'Arjun','Reddy','9123456870','arjun@gmail.com','arjun123',4,1,NULL,3,'State Name',101),(73,'Asif','Shaik','7590344672','asif@gmail.com','asif123',3,1,NULL,1,'tom',102),(74,'Soham','patil','7896541230','soham@gmail.com','soham123',3,1,NULL,2,'soham',103),(75,'Bakul','Joshi','9632587410','bakul@gmail.com','bakul123',2,1,NULL,2,'bakul mam',104),(76,'suraj','chavan','8905436643','suraj@gmail.com','suraj1234',4,1,NULL,2,'sun',105),(77,'Sachin','Raut','83739373563','sachin@gmail.com','sachin1223',5,1,1,3,'goa',106),(78,'sarthak','chavan','7854123690','sarthak@gmail.com','sarthak123',4,1,NULL,4,'1004',108),(79,'harsheta','mahajan','1236457890','harsheta@gmail.com','harsheta123',2,1,NULL,1,'lio',109);
/*!40000 ALTER TABLE `user_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-14 17:43:10
