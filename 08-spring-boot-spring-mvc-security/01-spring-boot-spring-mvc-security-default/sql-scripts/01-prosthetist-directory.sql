CREATE DATABASE  IF NOT EXISTS `prosthetist_directory`;
USE `prosthetist_directory`;

--
-- Table structure for table `prosthetist`
--

DROP TABLE IF EXISTS `prosthetist`;

CREATE TABLE `prosthetist` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `prosthetist`
--

INSERT INTO `prosthetist` VALUES 
  (1, 'Leslie', 'Andrews', 'leslie@gmail.com', '123-456'),
  (2, 'Emma', 'Baumgarten', 'emma@gmail.com', '456-789'),
  (3, 'Avani', 'Gupta', 'avani@gmail.com', '789-012'),
  (4, 'Yuri', 'Petrov', 'yuri@gmail.com', '012-345'),
  (5, 'Juan', 'Vega', 'juan@gmail.com', '345-678');

