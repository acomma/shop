CREATE DATABASE `shop_user` DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_bin;

USE `shop_user`;

CREATE TABLE `user` (
  `user_id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` varchar(64) COLLATE utf8mb4_bin NOT NULL COMMENT '用户姓名',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户';

INSERT INTO `user` (`user_id`, `name`) VALUES (1000, 'bob');
