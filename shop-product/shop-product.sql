CREATE DATABASE `shop_product` DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_bin;

USE `shop_product`;

CREATE TABLE `product` (
  `product_id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '商品姓名',
  `inventory` int NOT NULL COMMENT '库存数量',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='商品';

INSERT INTO `product` (`product_id`, `name`, `inventory`) VALUES (1000, 'apple', 100);
INSERT INTO `product` (`product_id`, `name`, `inventory`) VALUES (1001, 'banana', 100);
