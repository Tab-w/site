/*
 Navicat Premium Data Transfer

 Source Server         : aliyun
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : 60.205.205.204:3306
 Source Schema         : site

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 24/03/2018 21:17:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sec_user
-- ----------------------------
DROP TABLE IF EXISTS `sec_user`;
CREATE TABLE `sec_user`  (
  `id` bigint(19) NOT NULL COMMENT '主键',
  `username` char(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '登录名',
  `password` char(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '登录密码',
  `email` char(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '邮箱',
  `phone` int(11) NULL DEFAULT NULL COMMENT '电话',
  `full_name` char(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '全名',
  `flag` int(1) NULL DEFAULT NULL COMMENT '标识',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
