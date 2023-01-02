CREATE DATABASE `shop_user` DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_bin;

USE `shop_user`;

CREATE TABLE `user` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(64) COLLATE utf8mb4_bin NOT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户';

INSERT INTO `user` (`id`, `name`) VALUES (1000, 'bob');
