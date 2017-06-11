-- Dumping database structure for employee_db
CREATE DATABASE IF NOT EXISTS `ilm_db` ;
USE `ilm_db`;

-- USERS TABLE
CREATE TABLE IF NOT EXISTS `USER_TABLE` (
  `USER_ID` INT(11) NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` VARCHAR(100) NOT NULL,
  `MIDDLE_NAME` VARCHAR(100) ,
  `LAST_NAME` VARCHAR(100),
  `JOB_TITLE` VARCHAR(50),
  `WORK_EMAIL` VARCHAR(50) NOT NULL,
  `ORGANISATION` VARCHAR(50),
  `BUSINESS_UNIT` VARCHAR(50),
  `ASSESSMENT_LEVEL` VARCHAR(10),
  `COUNTRY` VARCHAR(50),
  `DATE_COMPLETED` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`USER_ID`)
) ENGINE=INNODB  DEFAULT CHARSET=LATIN1 AUTO_INCREMENT=1 ;
-- sample data
INSERT INTO `ilm_db`.`USER_TABLE`
(
	`FIRST_NAME`, `MIDDLE_NAME`, `LAST_NAME`, `JOB_TITLE`, `WORK_EMAIL`, `ORGANISATION`,`BUSINESS_UNIT`,`ASSESSMENT_LEVEL`, `COUNTRY`)
VALUES
	('Puneet','','Shekhar','SW','abc@mail.coom','SELF','SELF','5','IN');
	
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assessment_table`
--

LOCK TABLES `assessment_table` WRITE;
/*!40000 ALTER TABLE `assessment_table` DISABLE KEYS */;
INSERT INTO `assessment_table` VALUES (1,1,1,1,2,'2017-06-03 13:52:59',1,1);
INSERT INTO `assessment_table` VALUES (2,1,1,2,1,'2017-06-03 13:52:59',1,2);
/*!40000 ALTER TABLE `assessment_table` ENABLE KEYS */;
UNLOCK TABLES;
	
	
-- Dumping structure for table employee_db.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table employee_db.employee: ~1 rows (approximately)
INSERT INTO `employee` (`id`, `first_name`, `last_name`, `email`, `phone`) VALUES
 (1, 'Puneet', 'Shekhar', 'ps@gmail.com', '90908989899'); 
INSERT INTO `employee` (`id`, `first_name`, `last_name`, `email`, `phone`) VALUES
 (2, 'Hoston', 'lindey', 'hl@gmail.com', '90908989899');
 
 select * from employee;