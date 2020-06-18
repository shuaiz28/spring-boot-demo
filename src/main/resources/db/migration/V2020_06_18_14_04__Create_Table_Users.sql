CREATE TABLE `users` (
  `id` varchar(50) NOT NULL,
  `user_name` varchar(200) NOT NULL,
  `password` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;
