CREATE TABLE `user_topic` (
  `user_id` varchar(50) DEFAULT NULL,
  `topic_id` bigint(20) DEFAULT NULL,
  KEY `fk_user_topic__user_id` (`user_id`),
  KEY `fk_user_topic__topic_id` (`topic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;