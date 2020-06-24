CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) NOT NULL,
  `city` varchar(50) DEFAULT NULL,
  `district` varchar(50) DEFAULT NULL,
  `street` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_address__user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;
