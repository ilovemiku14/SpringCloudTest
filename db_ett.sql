/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : db_ett

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2023-03-21 15:17:31
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `source` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO goods VALUES ('1', 'milk', '300', 'db_ett');
INSERT INTO goods VALUES ('2', 'apple', '10', 'db_ett');
INSERT INTO goods VALUES ('3', 'fish', '90', 'db_ett');
