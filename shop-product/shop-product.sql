CREATE DATABASE `shop_product` DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_bin;

USE `shop_product`;

CREATE TABLE `product` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '商品名称',
  `inventory` int NOT NULL COMMENT '库存数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='商品';

INSERT INTO `product` (`id`, `name`, `inventory`) VALUES (1000, 'apple', 100);
INSERT INTO `product` (`id`, `name`, `inventory`) VALUES (1001, 'banana', 100);
