-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 147.182.192.193    Database: quiz_app_db
-- ------------------------------------------------------
-- Server version	8.0.27-0ubuntu0.20.04.1

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
-- Table structure for table `options`
--

DROP TABLE IF EXISTS `options`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `options` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `is_correct` tinyint(1) NOT NULL DEFAULT '0',
  `options_name` varchar(255) DEFAULT NULL,
  `question_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5bmv46so2y5igt9o9n9w4fh6y` (`question_id`),
  CONSTRAINT `FK5bmv46so2y5igt9o9n9w4fh6y` FOREIGN KEY (`question_id`) REFERENCES `questions` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `options`
--

LOCK TABLES `options` WRITE;
/*!40000 ALTER TABLE `options` DISABLE KEYS */;
INSERT INTO `options` VALUES (1,0,'Hyper Text Mak Language',1),(2,1,'Hyper Text Markup Language',1),(3,0,'Higher Text Markup Language',1),(4,0,'None of them',1),(5,0,'<large>',2),(6,0,'<h2>',2),(7,0,'<strong>',2),(8,1,'<h1>',2),(9,0,'<hr>',2),(10,0,'None of them',2),(11,1,'<br/>',3),(12,0,'<hr/>',3),(13,0,'<break>',3),(14,0,'<nl/>',3),(15,0,'None of them',3),(16,0,'<i>',4),(17,0,'<b>',4),(18,1,'<strong>',4),(19,0,'<important>',4),(20,0,'None of them',4),(21,1,'<a href=\"https://www.w3schools.com/\" target=\"_blank\">Visit W3Schools!</a>',5),(22,0,'<a href=\"https://www.w3schools.com/\" target=\"_self\">Visit W3Schools!</a>',5),(23,0,'<a href=\"https://www.w3schools.com/\" target=\"_top\">Visit W3Schools!</a>',5),(24,0,'None of them',5),(25,1,'z-index',6),(26,0,'d-index',6),(27,0,'s-index',6),(28,0,'x-index',6),(29,0,'class',7),(30,1,'id',7),(31,0,'test',7),(32,0,'name',7),(33,1,'clear',8),(34,0,'margin',8),(35,0,'float',8),(36,0,'padding',8),(37,0,'a {text: no-underline;}',9),(38,1,'a {text-decoration:none;}',9),(39,0,'a {text-style: no-underline;}',9),(40,0,'a {text-decoration: no-underline;}',9),(41,0,'<src>',10),(42,0,'<style>',10),(43,1,'<link>',10),(44,0,'<css>',10),(45,0,'<script href=\"abc.js\">',11),(46,0,'<script name=\"abc.js\">',11),(47,1,'<script src=\"abc.js\">',11),(48,0,'None of them',11),(49,1,'dateObjectName = new Date([parameters])',12),(50,0,'dateObjectName.new Date([parameters])',12),(51,0,'dateObjectName := new Date([parameters])',12),(52,0,'dateObjectName Date([parameters])',12),(53,1,'//This is a comment',13),(54,0,'/*This is a comment*/',13),(55,0,'$This is a comment$',13),(56,0,'None of These',13),(57,0,'onmouseclick',14),(58,0,'onmouseover',14),(59,1,'onclick',14),(60,0,'None',14),(61,0,'type',15),(62,1,'charset',15),(63,0,'character',15),(64,0,'None',15),(65,1,'alert(\"OnlineInterviewQuestions\");',16),(66,0,'confirm(\"OnlineInterviewQuestions\");',16),(67,0,'msgbox(\"OnlineInterviewQuestions\");',16),(68,0,'None of these',16),(69,0,'True',17),(70,1,'False',17);
/*!40000 ALTER TABLE `options` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questions` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `question_name` mediumtext,
  `test_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKoc6xkgj16nhyyes4ath9dyxxw` (`test_id`),
  CONSTRAINT `FKoc6xkgj16nhyyes4ath9dyxxw` FOREIGN KEY (`test_id`) REFERENCES `tests` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'What does HTML stand for?',1),(2,'Choose the correct HTML element for the largest heading:',1),(3,'What is the correct HTML element for inserting a line break?',1),(4,'Choose the correct HTML element to define important text?',1),(5,'How can you open a link in a new tab/browser window?',1),(6,'Suppose we want to arragnge five nos. of DIVs so that DIV4 is placed above DIV1. Now, which css property will we use to control the order of stack?',1),(7,'If we want define style for an unique element, then which css selector will we use ?',1),(8,'If we don\'t want to allow a floating div to the left side of an element, which css property will we use ?',1),(9,'By default Hyperlinks are displayed with an underline. How do you remove the underline from all hyperlinks by using CSS code ?',1),(10,'Which element is used in the <HEAD> section on an HTML / XHTMLpage, if we want to use an external style sheet file to decorate the page ?',1),(11,'What is the correct syntax for referring to an external script called \"abc.js\"',1),(12,'How to create a Date object in JavaScript?',1),(13,'Which of the following is the correct statement for comment in a JavaScript?',1),(14,'Which of the following event occurs when the user clicks on an HTML element?',1),(15,'Which of the following attribute is used to specify the character encoding used in an external script file?',1),(16,'Which of the following is the correct syntax to display \"OnlineInterviewQuestions\" in an alert box using JavaScript?',1),(17,'The external JavaScript file must contain <script> tag.',1);
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quiz_attempts`
--

DROP TABLE IF EXISTS `quiz_attempts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quiz_attempts` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `attempts` tinyint(1) DEFAULT '1',
  `is_correct` tinyint(1) DEFAULT '1',
  `option_id` bigint NOT NULL,
  `question_id` bigint NOT NULL,
  `test_id` bigint NOT NULL,
  `user_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKcoqf1hyfaxcljtc8nwn3po382` (`option_id`),
  KEY `FK8edqtv2ocs3vw41easmpjjxsn` (`question_id`),
  KEY `FK4j3d3ljv6xsadssrk78kqfiv3` (`test_id`),
  KEY `FKpj4a9hw0iv1mo1ut6rppg594u` (`user_id`),
  CONSTRAINT `FK4j3d3ljv6xsadssrk78kqfiv3` FOREIGN KEY (`test_id`) REFERENCES `tests` (`id`),
  CONSTRAINT `FK8edqtv2ocs3vw41easmpjjxsn` FOREIGN KEY (`question_id`) REFERENCES `questions` (`id`),
  CONSTRAINT `FKcoqf1hyfaxcljtc8nwn3po382` FOREIGN KEY (`option_id`) REFERENCES `options` (`id`),
  CONSTRAINT `FKpj4a9hw0iv1mo1ut6rppg594u` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quiz_attempts`
--

LOCK TABLES `quiz_attempts` WRITE;
/*!40000 ALTER TABLE `quiz_attempts` DISABLE KEYS */;
INSERT INTO `quiz_attempts` VALUES (1,1,0,16,4,1,1),(2,1,0,1,1,1,1),(3,1,0,5,2,1,1),(4,1,1,11,3,1,1),(5,1,1,21,5,1,1),(6,1,0,5,2,1,1),(7,1,1,2,1,1,1),(8,1,0,12,3,1,1),(9,1,0,22,5,1,1),(10,1,0,17,4,1,1),(11,1,0,1,1,1,1),(12,1,1,11,3,1,1),(13,1,0,17,4,1,1),(14,1,0,6,2,1,1),(15,1,0,22,5,1,1),(16,1,1,21,5,1,3),(17,1,0,17,4,1,3),(18,1,0,15,3,1,3),(19,1,1,8,2,1,3),(20,1,1,2,1,1,3),(21,1,1,2,1,1,3),(22,1,1,11,3,1,3),(23,1,1,21,5,1,3),(24,1,0,17,4,1,3),(25,1,0,5,2,1,3),(26,1,0,1,1,1,3),(27,1,1,8,2,1,3),(28,1,0,13,3,1,3),(29,1,0,22,5,1,3),(30,1,0,16,4,1,3),(31,1,0,1,1,1,3),(32,1,0,13,3,1,3),(33,1,1,8,2,1,3),(34,1,0,16,4,1,3),(35,1,0,22,5,1,3),(36,1,0,1,1,1,1),(37,1,1,21,5,1,1),(38,1,1,11,3,1,1),(39,1,0,17,4,1,1),(40,1,0,5,2,1,1),(41,1,1,11,3,1,4),(42,1,1,21,5,1,4),(43,1,1,2,1,1,4),(44,1,1,18,4,1,4),(45,1,1,8,2,1,4),(46,1,1,2,1,1,1),(47,1,1,18,4,1,1),(48,1,1,8,2,1,1),(49,1,1,11,3,1,1),(50,1,0,22,5,1,1),(51,1,1,8,2,1,4),(52,1,1,18,4,1,4),(53,1,1,2,1,1,4),(54,1,1,11,3,1,4),(55,1,1,21,5,1,4),(56,1,0,5,2,1,1),(57,1,1,11,3,1,1),(58,1,1,2,1,1,1),(59,1,1,21,5,1,1),(60,1,1,18,4,1,1),(61,1,1,21,5,1,3),(62,1,1,8,2,1,3),(63,1,1,18,4,1,3),(64,1,1,11,3,1,3),(65,1,1,2,1,1,3);
/*!40000 ALTER TABLE `quiz_attempts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quiz_grades`
--

DROP TABLE IF EXISTS `quiz_grades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quiz_grades` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `total_score` float DEFAULT NULL,
  `test_status` tinyint(1) DEFAULT '0',
  `test_id` bigint NOT NULL,
  `user_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKi4evfid4ocjr3vrw562nhlfut` (`user_id`,`test_id`),
  KEY `FKhx3y2ierdeqa032u9xfa0dqj6` (`test_id`),
  CONSTRAINT `FK8vxt6vj54w2wp7sodgm2124ik` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `FKhx3y2ierdeqa032u9xfa0dqj6` FOREIGN KEY (`test_id`) REFERENCES `tests` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quiz_grades`
--

LOCK TABLES `quiz_grades` WRITE;
/*!40000 ALTER TABLE `quiz_grades` DISABLE KEYS */;
INSERT INTO `quiz_grades` VALUES (11,'2022-01-23 15:07:52',100,1,1,4),(12,'2022-01-23 15:08:04',80,1,1,1),(13,'2022-01-23 15:08:13',100,1,1,3);
/*!40000 ALTER TABLE `quiz_grades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quizs`
--

DROP TABLE IF EXISTS `quizs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quizs` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `is_selection_correct` tinyint(1) NOT NULL DEFAULT '0',
  `user_option_selection` bigint DEFAULT NULL,
  `question_id` bigint NOT NULL,
  `user_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKs2tsfrr1e8e9puk6tlrbo119h` (`question_id`),
  KEY `FKodcndgvyfhxm3a5kfr0y1kc22` (`user_id`),
  CONSTRAINT `FKodcndgvyfhxm3a5kfr0y1kc22` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `FKs2tsfrr1e8e9puk6tlrbo119h` FOREIGN KEY (`question_id`) REFERENCES `questions` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quizs`
--

LOCK TABLES `quizs` WRITE;
/*!40000 ALTER TABLE `quizs` DISABLE KEYS */;
/*!40000 ALTER TABLE `quizs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'USER'),(2,'ADMIN'),(3,'CREATOR'),(4,'EDITOR');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tests`
--

DROP TABLE IF EXISTS `tests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tests` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `is_enable` tinyint(1) NOT NULL DEFAULT '0',
  `test_description` varchar(255) DEFAULT NULL,
  `test_name` varchar(255) DEFAULT NULL,
  `test_time` int DEFAULT '60',
  `total_questions` bigint DEFAULT NULL,
  `pass_percentage` int NOT NULL DEFAULT '60',
  `exam_end_date_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tests`
--

LOCK TABLES `tests` WRITE;
/*!40000 ALTER TABLE `tests` DISABLE KEYS */;
INSERT INTO `tests` VALUES (1,'2022-01-22 18:06:59',0,'Test topics are JavaScript, HTML, CSS, JQuery, AJAX,  Objects and Arrays, Logic in JS\n\"OOP in JS, Constructors and Inheritance\n in Javascript','Week - 6 Exit Test',60,25,60,'2022-01-23 19:42:04'),(2,'2022-01-23 06:55:45',0,'Test topics Core-Java, OOPS, Exception handling, Multi-threading, Collection and Map','Week - 7 Exit Test',60,25,65,'2022-01-23 19:42:04');
/*!40000 ALTER TABLE `tests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `is_enable` bit(1) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `emp_id` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'jaga@gmail.com',_binary '\0','$2a$10$InByEDaeKHIHpzLyIV5DnOBI/eGXx1uLtefj1nz9lMYRPwGZMzzJC','Jagannath',NULL,NULL,NULL),(2,'gari@gmail.com',_binary '\0','$2a$10$s6Jo4CHHrsx5umPGL.o/XuFKApBvVkS8pDIt6ZHWJd8HKm/F3YyL.','Gariyashee',NULL,NULL,NULL),(3,'swarajdash2545@gmail.com',_binary '\0','$2a$10$BxsPACeyG/WazgdpgHdMlOiWd5cYMOQ4TmHr9nDCg/Zgi5Tvl4qqO','swaraj dash',NULL,NULL,NULL),(4,'gdspicygari@gmail.com',_binary '\0','$2a$10$HIk9WGB06jwnfanmw9HjZuCR..rsy.TL2lVIzWLqJPclINA39Mbs.','Gari1992',NULL,NULL,NULL);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_roles`
--

DROP TABLE IF EXISTS `users_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users_roles` (
  `user_id` bigint NOT NULL,
  `role_id` bigint NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKj6m8fwv7oqv74fcehir1a9ffy` (`role_id`),
  CONSTRAINT `FK2o0jvgh89lemvvo17cbqvdxaa` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `FKj6m8fwv7oqv74fcehir1a9ffy` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_roles`
--

LOCK TABLES `users_roles` WRITE;
/*!40000 ALTER TABLE `users_roles` DISABLE KEYS */;
INSERT INTO `users_roles` VALUES (2,1),(3,1),(4,1),(1,2);
/*!40000 ALTER TABLE `users_roles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-24  1:31:54
