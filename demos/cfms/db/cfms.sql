/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : cfms

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-02-01 15:14:48
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
  UNIQUE KEY `ix_auth_username` (`username`,`authority`) USING BTREE,
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `user` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authorities
-- ----------------------------
INSERT INTO `authorities` VALUES ('0', 'admin', 'admin');

-- ----------------------------
-- Table structure for dictionary
-- ----------------------------
DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE `dictionary` (
  `code_type` varchar(8) NOT NULL,
  `type_name` varchar(64) DEFAULT NULL,
  `code_value` varchar(8) NOT NULL,
  `code_name` varchar(64) DEFAULT NULL,
  `view_num` int(11) DEFAULT NULL,
  `bak` varchar(64) DEFAULT NULL,
  `delete_flg` tinyint(1) DEFAULT '0',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `register` varchar(30) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `modifier` varchar(30) DEFAULT NULL,
  `version` int(11) DEFAULT '1',
  PRIMARY KEY (`code_type`,`code_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictionary
-- ----------------------------
INSERT INTO `dictionary` VALUES ('C0001', '性别', '1', '女', '2', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '001', '汉族', '1', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '002', '壮族', '2', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '003', '满族', '3', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '004', '回族', '4', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '005', '苗族', '5', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '006', '维吾尔族', '6', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '007', '土家族', '7', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '008', '彝族', '8', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '009', '蒙古族', '9', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '010', '藏族', '10', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '011', '布依族', '11', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '012', '侗族', '12', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '013', '瑶族', '13', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '014', '朝鲜族', '14', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '015', '白族', '15', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '016', '哈尼族', '16', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '017', '哈萨克族', '17', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '018', '黎族', '18', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '019', '傣族', '19', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '020', '畲族', '20', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '021', '傈僳族', '21', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '022', '仡佬族', '22', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '023', '东乡族', '23', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '024', '高山族', '24', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '025', '拉祜族', '25', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '026', '水族', '26', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '027', '佤族', '27', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '028', '纳西族', '28', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '029', '羌族', '29', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '030', '土族', '30', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '031', '仫佬族', '31', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '032', '锡伯族', '32', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '033', '柯尔克孜族', '33', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '034', '达斡尔族', '34', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '035', '景颇族', '35', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '036', '毛南族', '36', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '037', '撒拉族', '37', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '038', '塔吉克族', '38', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '039', '阿昌族', '39', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '040', '普米族', '40', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '041', '鄂温克族', '41', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '042', '怒族', '42', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '043', '京族', '43', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '044', '基诺族', '44', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '045', '德昂族', '45', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '046', '保安族', '46', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '047', '俄罗斯族', '47', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '048', '裕固族', '48', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '049', '乌兹别克族', '49', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '050', '门巴族', '50', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '051', '鄂伦春族', '51', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '052', '独龙族', '52', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '053', '塔塔尔族', '53', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '054', '赫哲族', '54', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '055', '珞巴族', '55', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '056', '布朗族', '56', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '057', '外籍', '57', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');
INSERT INTO `dictionary` VALUES ('C0002', '民族', '099', '不明', '58', '', '0', '2015-03-25 01:00:00', 'admin', '2015-03-25 01:00:00', 'admin', '1');

-- ----------------------------
-- Table structure for party
-- ----------------------------
DROP TABLE IF EXISTS `party`;
CREATE TABLE `party` (
  `PARTY_ID` decimal(10,0) NOT NULL DEFAULT '0',
  PRIMARY KEY (`PARTY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of party
-- ----------------------------

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `PARTY_ID` decimal(10,0) NOT NULL DEFAULT '0',
  `NAME` varchar(40) CHARACTER SET utf8 DEFAULT NULL,
  `GENDER` char(1) DEFAULT NULL,
  `BIRTH_DATE` date DEFAULT NULL,
  `HEIGHT` decimal(10,0) DEFAULT NULL,
  `WEIGHT` decimal(10,0) DEFAULT NULL,
  `SOCIAL_SECURITY_NUMBER` decimal(10,0) DEFAULT NULL,
  `CURRENT_PASSPORT_NUMBER` decimal(10,0) DEFAULT NULL,
  `CURRENT_PASSPORT_EXPIRE_DATE` date DEFAULT NULL,
  `TOTAL_YEARS_WORK_EXPERIENCE` decimal(10,0) DEFAULT NULL,
  `COMMENTS` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`PARTY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '龙', '1', '1984-12-12', null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(60) NOT NULL,
  `enabled` bit(1) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', '$2a$10$qeW7Nv.L53Et7.UOTJPipeIUQIvaOH8yw76FWbe2xy.qhzeRlZ0O6', '');
