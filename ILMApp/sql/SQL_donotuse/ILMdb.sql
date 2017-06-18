CREATE DATABASE  IF NOT EXISTS `ilm_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ilm_db`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: ilm_db
-- ------------------------------------------------------
-- Server version	5.7.15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assessment_table`
--

DROP TABLE IF EXISTS `assessment_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assessment_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assessment_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `question_id` int(11) DEFAULT NULL,
  `option_id` int(11) DEFAULT NULL,
  `date` datetime DEFAULT CURRENT_TIMESTAMP,
  `score` int(11) DEFAULT NULL,
  `level_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assessment_table`
--

LOCK TABLES `assessment_table` WRITE;
/*!40000 ALTER TABLE `assessment_table` DISABLE KEYS */;
INSERT INTO `assessment_table` VALUES (1,1,1,1,2,'2017-06-03 13:52:59',1,1),(2,1,1,2,1,'2017-06-03 13:52:59',1,1);
/*!40000 ALTER TABLE `assessment_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Puneet','Shekhar','ps@gmail.com','90908989899'),(2,'Hoston','lindey','hl@gmail.com','90908989899');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `level_master_table`
--

DROP TABLE IF EXISTS `level_master_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `level_master_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `desc` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level_master_table`
--

LOCK TABLES `level_master_table` WRITE;
/*!40000 ALTER TABLE `level_master_table` DISABLE KEYS */;
INSERT INTO `level_master_table` VALUES (1,'Level 1','Level 1 encapsulates junior management roles, administrative or business infrastructure/operational support roles.'),(2,'Level 2','Level 2 includes employees that are accountable for controlling and overseeing a department or individuals responsible for executing organisational plans, which comply with the company\'s strategies/policies'),(3,'Level 3','Level 3 company employees are responsible for controlling and overseeing the whole organisation or component parts of the organisation.');
/*!40000 ALTER TABLE `level_master_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `option_master_table`
--

DROP TABLE IF EXISTS `option_master_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `option_master_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `option` varchar(200) DEFAULT NULL,
  `desc` varchar(45) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `option_master_table`
--

LOCK TABLES `option_master_table` WRITE;
/*!40000 ALTER TABLE `option_master_table` DISABLE KEYS */;
INSERT INTO `option_master_table` VALUES (1,'Does not represent a description of my behaviour',NULL,'1'),(2,'Represents a description of my behaviour to some degree',NULL,'2'),(3,'Moderately represents a description of my behaviour',NULL,'3'),(4,'Strongly represents a description of my behaviour',NULL,'4'),(5,'Very strongly represents a description of my behaviour',NULL,'5'),(6,'No opportunity to apply in my role',NULL,'0');
/*!40000 ALTER TABLE `option_master_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question_master_table`
--

DROP TABLE IF EXISTS `question_master_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `question_master_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(200) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question_master_table`
--

LOCK TABLES `question_master_table` WRITE;
/*!40000 ALTER TABLE `question_master_table` DISABLE KEYS */;
INSERT INTO `question_master_table` VALUES (1,'I strive to ensure inclusion is a considered driver in business critical decision-making.','Inclusive leadership'),(2,'I model standards and behaviours to redress systemic inequalities within the business.','Inclusive leadership'),(3,'Inclusion guides my everyday operational and/or strategic decision-making.','Inclusive leadership'),(4,'I often advocate inclusion and social justice to colleagues.','Inclusive leadership'),(5,'I lead by example with regard to inclusion in everyday practice, interactions and decision-making.','Inclusive leadership'),(6,'My leadership style models conviction and transparency to redress systemic inequities for diverse employees.','Inclusive leadership');
/*!40000 ALTER TABLE `question_master_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suggestion_master_table`
--

DROP TABLE IF EXISTS `suggestion_master_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suggestion_master_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `page_id` int(11) DEFAULT NULL,
  `question_id` int(11) DEFAULT NULL,
  `option_id` int(11) DEFAULT NULL,
  `level_id` int(11) DEFAULT NULL,
  `suggestion` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suggestion_master_table`
--

LOCK TABLES `suggestion_master_table` WRITE;
/*!40000 ALTER TABLE `suggestion_master_table` DISABLE KEYS */;
INSERT INTO `suggestion_master_table` VALUES (1,1,1,1,1,'•	Learn about the cultural backgrounds, lives and interests of employees outside of the workplace.'),(2,1,1,1,1,'•	Be creative, flexible and look for new ways of doing things.'),(3,1,1,1,1,'•	Acknowledge all faiths present in your workplace.'),(4,1,1,1,1,'•	Showing acceptance of everyone without bias.'),(5,1,1,1,1,'•	Have self-awareness of how preconceived views can influence behaviour towards others.'),(6,1,2,1,1,'•	Demonstrate a knowledge and interest in other cultures.'),(7,1,2,1,1,'•	Admit that you don’t have the answer when you don’t, and seek opinions from those around you. '),(8,1,2,1,1,'•	Exert effort to identify their own biases, and find ways to manage them in the workplace.'),(9,1,2,1,1,'•	Aim to create a welcoming culture within the business, coupled with a strong personal sense of responsibility towards others.'),(10,1,2,1,1,'•	Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas.');
/*!40000 ALTER TABLE `suggestion_master_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_table`
--

DROP TABLE IF EXISTS `user_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_table` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` varchar(100) NOT NULL,
  `MIDDLE_NAME` varchar(100) DEFAULT NULL,
  `LAST_NAME` varchar(100) DEFAULT NULL,
  `JOB_TITLE` varchar(50) DEFAULT NULL,
  `WORK_EMAIL` varchar(50) NOT NULL,
  `ORGANISATION` varchar(50) DEFAULT NULL,
  `BUSINESS_UNIT` varchar(50) DEFAULT NULL,
  `ASSESSMENT_LEVEL` varchar(10) DEFAULT NULL,
  `COUNTRY` varchar(50) DEFAULT NULL,
  `DATE_COMPLETED` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_table`
--

LOCK TABLES `user_table` WRITE;
/*!40000 ALTER TABLE `user_table` DISABLE KEYS */;
INSERT INTO `user_table` VALUES (1,'Puneet','','Shekhar','SW','abc@mail.com','SELF','SELF','5','IN','2017-06-15 23:42:09'),(2,'Dan','','Gallagher ','CLIENT','dan@articasearch.com','articasearch','research','5','UK','2017-06-15 23:42:09');
/*!40000 ALTER TABLE `user_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-15 23:44:37
