-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.23 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for schoolbook
DROP DATABASE IF EXISTS `schoolbook`;
CREATE DATABASE IF NOT EXISTS `schoolbook` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `schoolbook`;

-- Dumping structure for table schoolbook.author
DROP TABLE IF EXISTS `author`;
CREATE TABLE IF NOT EXISTS `author` (
                                        `id` bigint NOT NULL AUTO_INCREMENT,
                                        `name` varchar(100) DEFAULT NULL,
    `gender` varchar(50) DEFAULT NULL,
    `created_at` datetime DEFAULT NULL,
    `updated_at` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table schoolbook.author: ~3 rows (approximately)
DELETE FROM `author`;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` (`id`, `name`, `gender`, `created_at`, `updated_at`) VALUES
(1, 'Dhamu', 'male', '2021-12-12 20:37:25', '2021-12-12 20:37:27'),
(2, 'Prasad', 'male', '2021-12-12 20:37:29', '2021-12-12 20:37:30'),
(3, 'siva', 'male', '2021-12-12 20:37:31', '2021-12-12 20:37:33');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;

-- Dumping structure for table schoolbook.bookdetails
DROP TABLE IF EXISTS `bookdetails`;
CREATE TABLE IF NOT EXISTS `bookdetails` (
                                             `id` bigint NOT NULL,
                                             `booktype` varchar(255) DEFAULT NULL,
    `description` varchar(255) DEFAULT NULL,
    `name` varchar(255) DEFAULT NULL,
    `yearofpublication` int DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table schoolbook.bookdetails: ~6 rows (approximately)
DELETE FROM `bookdetails`;
/*!40000 ALTER TABLE `bookdetails` DISABLE KEYS */;
INSERT INTO `bookdetails` (`id`, `booktype`, `description`, `name`, `yearofpublication`) VALUES
(1, 'Programming', 'Java Core', 'Prasad', 2012),
(2, 'Programming', 'Java Script', 'Prasad', 2013),
(3, 'coding', 'Java UI', 'Siva', 2012),
(4, 'Programming', 'Java Script V2', 'Prasad ', 2018),
(5, 'movie', 'Hari pottor', 'Prasad ', 2018),
(6, 'movie', 'Hari pottor', 'Dhamu', 2018);
/*!40000 ALTER TABLE `bookdetails` ENABLE KEYS */;

-- Dumping structure for table schoolbook.book_author
DROP TABLE IF EXISTS `book_author`;
CREATE TABLE IF NOT EXISTS `book_author` (
                                             `id` bigint NOT NULL AUTO_INCREMENT,
                                             `book_id` bigint DEFAULT NULL,
                                             `author_id` bigint DEFAULT NULL,
                                             PRIMARY KEY (`id`),
    KEY `FK_book_author__book_id` (`book_id`),
    KEY `FK_book_author__author_id` (`author_id`),
    CONSTRAINT `FK_book_author__author_id` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT `FK_book_author__book_id` FOREIGN KEY (`book_id`) REFERENCES `bookdetails` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table schoolbook.book_author: ~0 rows (approximately)
DELETE FROM `book_author`;
/*!40000 ALTER TABLE `book_author` DISABLE KEYS */;
/*!40000 ALTER TABLE `book_author` ENABLE KEYS */;

-- Dumping structure for table schoolbook.hibernate_sequence
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table schoolbook.hibernate_sequence: ~1 rows (approximately)
DELETE FROM `hibernate_sequence`;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(7);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
