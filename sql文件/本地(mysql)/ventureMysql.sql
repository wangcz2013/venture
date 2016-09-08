/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50129
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50129
File Encoding         : 65001

Date: 2016-09-08 09:21:21
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `codetable`
-- ----------------------------
DROP TABLE IF EXISTS `codetable`;
CREATE TABLE `codetable` (
  `code` varchar(20) NOT NULL,
  `codetype` varchar(20) NOT NULL,
  `codename` varchar(200) NOT NULL,
  PRIMARY KEY (`code`,`codetype`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of codetable
-- ----------------------------
INSERT INTO codetable VALUES ('00', 'isadult', '与该项无关');
INSERT INTO codetable VALUES ('01', 'formula', '保单保额');
INSERT INTO codetable VALUES ('01', 'isadult', '未成年');
INSERT INTO codetable VALUES ('01', 'risktype', '寿险');
INSERT INTO codetable VALUES ('02', 'formula', '所交保费');
INSERT INTO codetable VALUES ('02', 'isadult', '成年');
INSERT INTO codetable VALUES ('02', 'risktype', '重疾');

-- ----------------------------
-- Table structure for `policyholderman`
-- ----------------------------
DROP TABLE IF EXISTS `policyholderman`;
CREATE TABLE `policyholderman` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `riskcode` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `birthday` date NOT NULL,
  `idtype` varchar(50) NOT NULL,
  `idno` varchar(50) NOT NULL,
  `amnt` decimal(50,2) NOT NULL,
  `prem` decimal(50,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of policyholderman
-- ----------------------------
INSERT INTO policyholderman VALUES ('1', '2014', '张三', '男', '1990-02-01', '身份证', '11111111111111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('2', '2014', '张三', '男', '1990-02-01', '身份证', '11111111111111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('3', '2014', '张三', '男', '1990-02-01', '身份证', '11111111111111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('4', '2014', '张三', '男', '1990-02-01', '身份证', '2345', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('5', '2014', '张三', '男', '1990-02-01', '身份证', '2345', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('6', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('7', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('8', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('9', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('10', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('11', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('12', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('13', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('14', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('15', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('16', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('17', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('18', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('19', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('20', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('21', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('22', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('23', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('24', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('25', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('26', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('27', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('28', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('29', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('30', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('31', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('32', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('33', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('34', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('35', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('36', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('37', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('38', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('39', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('40', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('41', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');
INSERT INTO policyholderman VALUES ('42', '2014', '张三', '男', '1990-02-01', '身份证', '1111', '10000.00', '10000000.00');

-- ----------------------------
-- Table structure for `riskalgorithm`
-- ----------------------------
DROP TABLE IF EXISTS `riskalgorithm`;
CREATE TABLE `riskalgorithm` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '序号（主）键',
  `riskcode` varchar(20) NOT NULL COMMENT '险种',
  `risktype` varchar(10) NOT NULL COMMENT '风险类别  01 寿险  02 重疾',
  `isadult` varchar(2) NOT NULL COMMENT '是否未成年 （00 与该项无关 01 未成年 02 成年）',
  `formula` varchar(10) NOT NULL COMMENT '公式 (01 保单保额  02  所交保费)',
  `percent` varchar(5) NOT NULL COMMENT '百分比',
  `algorithm` varchar(4000) NOT NULL COMMENT '算法',
  `usercode` varchar(20) NOT NULL,
  `makedate` date NOT NULL,
  `maketime` varchar(30) NOT NULL,
  `modifydate` date NOT NULL,
  `modifytime` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of riskalgorithm
-- ----------------------------
INSERT INTO riskalgorithm VALUES ('1', '2014', '01', '01', '01', '100', 'select 100 from dual', '001', '2016-09-06', '21:00:00', '2016-09-06', '21:00:00');
INSERT INTO riskalgorithm VALUES ('2', '2014', '01', '02', '01', '200', 'select 200 from dual', '001', '2016-09-06', '21:00:00', '2016-09-06', '21:00:00');
INSERT INTO riskalgorithm VALUES ('3', '2014', '02', '00', '02', '300', 'select 300 from dual', '001', '2016-09-06', '21:00:00', '2016-09-06', '21:00:00');
INSERT INTO riskalgorithm VALUES ('4', '2015', '01', '01', '01', '111', 'select 111 from dual', '001', '2016-09-06', '21:00:00', '2016-09-06', '21:00:00');
INSERT INTO riskalgorithm VALUES ('5', '2015', '01', '02', '01', '222', 'select 222 from dual', '001', '2016-09-06', '21:00:00', '2016-09-06', '21:00:00');
INSERT INTO riskalgorithm VALUES ('6', '2015', '02', '00', '02', '333', 'select 333 from dual', '001', '2016-09-06', '21:00:00', '2016-09-06', '21:00:00');
INSERT INTO riskalgorithm VALUES ('7', '2014', '02', '00', '02', '324', 'select 324 from dual', '001', '2016-09-08', '09:00:00', '2016-09-08', '09:00:00');
INSERT INTO riskalgorithm VALUES ('8', '2014', '01', '01', '02', '666', 'select 666 from dual', '001', '2016-09-08', '09:00:00', '2016-09-08', '09:00:00');

-- ----------------------------
-- Table structure for `riskreflect`
-- ----------------------------
DROP TABLE IF EXISTS `riskreflect`;
CREATE TABLE `riskreflect` (
  `reflectno` varchar(10) NOT NULL DEFAULT '' COMMENT 'sql语句编码(A001 投保清单sql A002  算法sql )',
  `reflectname` varchar(100) NOT NULL COMMENT 'sql名称',
  `cont` varchar(4000) NOT NULL,
  PRIMARY KEY (`reflectno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of riskreflect
-- ----------------------------
INSERT INTO riskreflect VALUES ('A001', '查询投保人列表清单', 'select idno,riskcode,risktype,sum(amnt) as amnt,sum(prem) as prem  from policyholderper where idno = \'?CONDITION6?\' and riskcode = \'?CONDITION1?\'  and idno = \'?CONDITION6?\'  group by idno,riskcode,risktype');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `usercode` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`usercode`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('001', '001', 'zhangsan');
