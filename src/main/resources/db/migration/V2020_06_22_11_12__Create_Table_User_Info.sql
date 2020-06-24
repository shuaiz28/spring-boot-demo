CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) NOT NULL,
  `first_name` varchar(200) DEFAULT NULL,
  `last_name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_info__user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;
