/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50521
Source Host           : localhost:3306
Source Database       : spring_security

Target Server Type    : MYSQL
Target Server Version : 50521
File Encoding         : 65001

Date: 2015-09-21 20:00:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for authorities
-- ----------------------------
DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ix_auth_username` (`username`,`authority`),
  CONSTRAINT `constraint` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authorities
-- ----------------------------
INSERT INTO `authorities` VALUES ('0', 'admin', 'admin');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(60) NOT NULL,
  `enabled` bit(1) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users  123456
-- ----------------------------
INSERT INTO `users` VALUES ('admin', '$2a$10$qeW7Nv.L53Et7.UOTJPipeIUQIvaOH8yw76FWbe2xy.qhzeRlZ0O6', '');
