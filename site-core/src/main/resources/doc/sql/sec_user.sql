/*
Navicat MySQL Data Transfer

Source Server         : aliyun
Source Server Version : 50721
Source Host           : 60.205.205.204:3306
Source Database       : site

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-04-03 13:44:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sec_user
-- ----------------------------
DROP TABLE IF EXISTS `sec_user`;
CREATE TABLE `sec_user` (
  `id` bigint(19) NOT NULL COMMENT '主键',
  `username` char(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '登录帐号',
  `password` char(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '登录密码',
  `login_count` int(2) DEFAULT NULL COMMENT '登录次数',
  `login_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '登陆时间',
  `last_login_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '上次登陆时间',
  `email` char(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '电子邮箱',
  `phone` int(11) DEFAULT NULL COMMENT '电话号',
  `full_name` char(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户姓名',
  `flag` int(2) DEFAULT NULL COMMENT '标识',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_user` bigint(19) DEFAULT NULL COMMENT '创建人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_user` bigint(19) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
