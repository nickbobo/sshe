/*
 Navicat Premium Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : 127.0.0.1
 Source Database       : sshe

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 06/06/2017 16:03:50 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `SYONLINE`
-- ----------------------------
DROP TABLE IF EXISTS `SYONLINE`;
CREATE TABLE `SYONLINE` (
  `ID` varchar(36) NOT NULL,
  `CREATEDATETIME` datetime DEFAULT NULL,
  `IP` varchar(100) DEFAULT NULL,
  `LOGINNAME` varchar(100) DEFAULT NULL,
  `TYPE` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `SYONLINE`
-- ----------------------------
BEGIN;
INSERT INTO `SYONLINE` VALUES ('02280534-2ee8-4c26-b3cf-41b76feba74c', '2017-06-01 11:27:53', '本地', 'nick', '1'), ('061c6e0e-0d87-4fac-ac3c-a6c2ddc452f1', '2017-06-02 15:31:58', '本地', 'nick', '1'), ('08a4652f-4ffc-4abe-8a47-66f318c384ac', '2017-06-01 15:27:07', '本地', 'nick', '0'), ('08eb0167-e038-4c01-a238-e24997dd1208', '2017-06-02 11:10:04', '本地', 'nick', '1'), ('090984c8-23d8-4688-94c7-afc2e0732592', '2017-06-02 14:59:29', '本地', 'nick', '1'), ('0d83e6ba-1be1-4b80-b4f2-bc90ff560de5', '2017-06-01 15:41:55', '本地', 'nick', '1'), ('0ef6a5f2-3088-416f-936d-a7268861eb3e', '2017-06-01 15:23:25', '本地', 'nick', '1'), ('1f68770e-6255-4985-8a21-81b4d77792a5', '2017-06-02 12:25:54', '本地', 'nick', '1'), ('291eb090-8026-4584-886a-faae16da4de6', '2017-06-02 15:38:02', '本地', 'nick', '1'), ('2ca4fe42-9d21-47c4-bc67-4a4510af5c7c', '2017-06-01 16:59:28', '本地', 'nick', '0'), ('2f9b6453-6cd7-4ef3-99b4-8c5a9911cd12', '2017-06-02 11:25:00', '本地', 'nick', '0'), ('30e42bb1-5990-445a-9bde-1fb18f081a28', '2017-06-02 12:25:48', '本地', 'nick', '0'), ('3397cb0b-d15f-42d3-9691-481cdeed60c9', '2017-06-02 15:30:59', '本地', 'nick', '0'), ('34d5af33-2ed0-46b8-878c-77bf90c8780c', '2017-06-01 15:43:39', '本地', 'nick', '0'), ('35b8d4e2-1849-4482-83f7-bb5845632099', '2017-06-02 13:27:43', '本地', 'nick', '0'), ('385eaa48-99bd-45bc-b6bd-c553bb52b54c', '2017-06-02 13:27:45', '本地', 'nick', '1'), ('3dbfe5d7-19ab-408e-baa2-2ecdeb34062f', '2017-06-02 15:51:21', '本地', 'nick', '1'), ('41121711-4906-49d1-8201-486a2aac9075', '2017-06-02 15:50:06', '本地', 'nick', '0'), ('42c3c5af-f7bb-43d5-a739-c915ad55196c', '2017-06-02 14:07:41', '本地', 'nick', '0'), ('430d4ff3-d54f-49eb-b4e5-24220d51895b', '2017-06-02 10:17:53', '本地', 'nick', '1'), ('456b3179-16cd-4505-852f-92fc1c5d0d11', '2017-06-02 12:09:43', '本地', 'nick', '1'), ('4e9bb0d4-2bc4-404b-895b-bfbd2075bfcd', '2017-06-02 11:08:50', '本地', 'nick', '1'), ('51538895-4491-4c59-bc5f-050a9ec702d4', '2017-06-01 15:08:27', '本地', 'nick', '1'), ('58c7fec9-a7ff-4019-99f0-aa9e8ad6f603', '2017-06-01 14:11:53', '本地', 'nick', '0'), ('5c7adf77-e1fb-49dd-a474-e9b91f2df042', '2017-06-02 15:31:56', '本地', 'nick', '0'), ('5d54093b-2cee-415c-b8ee-7a2cddeecdf5', '2017-06-02 15:43:31', '本地', 'nick', '0'), ('641b8235-f8f3-4e96-be6c-373a23b89823', '2017-06-02 15:54:09', '本地', 'nick', '1'), ('65b4db54-19dc-410f-a13e-2806f96eac9b', '2017-06-02 11:34:00', '本地', 'nick', '0'), ('68648424-715e-4a29-9fab-b20e26e8d603', '2017-06-02 11:13:03', '本地', 'nick', '1'), ('6d386637-4674-407e-885d-dd09dbfa50b5', '2017-06-01 20:43:31', '本地', 'nick', '0'), ('70e12f49-2d4e-426d-860f-ace1298565a3', '2017-06-02 15:54:06', '本地', 'nick', '0'), ('72793e7c-2a3c-4e80-a6ba-077ce82d047c', '2017-06-01 22:57:36', '本地', 'nick', '1'), ('752bcbea-2ced-471c-bdb7-2bdb51b7a6aa', '2017-06-02 11:08:48', '本地', 'nick', '0'), ('79fbe883-4339-4eb0-9ec7-0a78752b3c81', '2017-06-02 11:09:41', '本地', 'nick', '1'), ('7f194070-c1d9-4c1e-9c1b-ec3821586982', '2017-06-01 11:27:57', '本地', 'nick', '0'), ('84c8a7ee-326b-432e-9360-46c8473cd47e', '2017-06-01 14:56:32', '本地', 'nick', '0'), ('87a4c341-096e-4734-9eb0-8a8462f0c649', '2017-06-01 15:44:35', '本地', 'nick', '1'), ('896ff08e-59e8-4258-8143-cba718a7f35a', '2017-06-01 22:32:01', '本地', 'nick', '1'), ('8999c57d-6824-4407-bfc9-9b66c5fcd99f', '2017-06-02 14:00:55', '本地', 'nick', '1'), ('89f1d544-03fd-4462-a87c-b6f7a1d19032', '2017-06-02 12:44:39', '本地', 'nick', '0'), ('8d5656b4-4148-4ca5-92f5-3708123ea24e', '2017-06-02 13:25:59', '本地', 'nick', '0'), ('90eda98c-1616-4570-928b-6f059c34819d', '2017-06-02 16:55:14', '本地', 'nick', '0'), ('91196c0c-4915-4602-b414-724b4c059b03', '2017-06-02 15:31:02', '本地', 'nick', '1'), ('934183a8-4533-44ed-83a2-f31d123e0094', '2017-06-01 15:27:35', '本地', 'nick', '1'), ('9521b445-3ff4-4de2-92c0-b4f2da4e3ad0', '2017-06-02 11:13:01', '本地', 'nick', '0'), ('95df5253-692e-47fa-b509-a198033b1417', '2017-06-01 22:57:00', '本地', 'nick', '0'), ('9aaf6b5a-94fe-445e-901e-7b6f1b0004d7', '2017-06-01 15:41:24', '本地', 'nick', '0'), ('a2c1e997-e0a5-44d4-af16-40d66a295143', '2017-06-01 11:12:01', '本地', 'nick', '1'), ('a857bd15-e0a8-4655-b9bb-18eeaf9a90ee', '2017-06-02 14:16:06', '本地', 'nick', '1'), ('ab50281f-ac6b-4e47-addb-af61d3d49943', '2017-06-01 15:17:28', '本地', 'nick', '1'), ('b21ba6c7-120f-457a-944c-a18e2ef55133', '2017-06-01 14:12:00', '本地', 'nick', '1'), ('b28de2b7-a194-4e1f-bb05-3c8fc7ec2cc1', '2017-06-02 11:09:39', '本地', 'nick', '0'), ('b621a917-ddc1-402b-bbb5-d4f2693b4888', '2017-06-02 13:24:14', '本地', 'nick', '1'), ('b686f113-3056-4d70-8a79-25be6bbb9e7a', '2017-06-02 12:44:41', '本地', 'nick', '1'), ('b7ae5b3b-9b02-4652-84c7-c562011ff358', '2017-06-01 23:13:20', '本地', 'nick', '0'), ('b9c4377d-9cec-404e-b79d-4a0e2d546a0c', '2017-06-01 15:23:23', '本地', 'nick', '0'), ('bfde0dfd-80c4-42fa-8fce-e29ac9e960fe', '2017-06-01 17:00:45', '本地', 'nick', '1'), ('c033ac22-e9bc-48d4-aeb7-a012198386dc', '2017-06-02 14:58:38', '本地', 'nick', '0'), ('c0a98c82-c42e-4a92-900c-11009f57a86e', '2017-06-02 17:07:20', '本地', 'nick', '1'), ('c1f93594-116e-4d5f-9d16-df58e8f17b88', '2017-06-02 16:59:28', '本地', 'nick', '1'), ('cb1e6510-99a6-41f8-8cde-5b9421bf75fd', '2017-06-01 11:45:57', '本地', 'nick', '0'), ('d1c7beb6-6e4a-4ee5-9f17-c3bda3c94145', '2017-06-01 14:10:14', '本地', 'nick', '1'), ('d3f9ccdf-8b75-401a-87f9-427ecf3d9140', '2017-06-02 15:43:33', '本地', 'nick', '1'), ('d70f5d64-1fe4-4ecd-bf74-ed3e72e6ad94', '2017-06-02 14:07:44', '本地', 'nick', '1'), ('dba609b2-5e3e-411d-9a0f-0a3291400dd2', '2017-06-02 14:16:43', '本地', 'nick', '1'), ('dba86b44-fd8f-48d8-b25b-12c03623fbe0', '2017-06-02 13:12:31', '本地', 'nick', '0'), ('df3571d7-12fd-4598-a321-2643947c8ac0', '2017-06-02 17:07:24', '本地', 'nick', '0'), ('e4916574-e913-4ac1-a957-b4e4c447f364', '2017-06-02 15:36:57', '本地', 'nick', '0'), ('e6fbceaa-e0f2-4200-838f-75c4fbf7a5e0', '2017-06-03 00:04:08', '本地', 'nick', '1'), ('e7171509-c250-4235-8919-d68b3d201a34', '2017-06-02 16:33:21', '本地', 'nick', '0'), ('e962deb7-390e-4a1c-a9f0-b73955c1a5a2', '2017-06-01 14:34:32', '本地', 'nick', '0'), ('eaff96fa-2cb2-4a42-9c7b-5fa2c3fa6f04', '2017-06-02 14:16:04', '本地', 'nick', '0'), ('ee505f51-438a-4b53-bd19-f89cf6e67d74', '2017-06-02 14:31:32', '本地', 'nick', '0'), ('eeb2e133-84c3-4cef-9149-af776a54ba9d', '2017-06-02 17:00:08', '本地', 'nick', '0'), ('f00e00d7-f805-45e2-b0d6-045b549358cb', '2017-06-01 15:17:25', '本地', 'nick', '0'), ('f9f82417-21d5-4013-9c2c-92eac61fb499', '2017-06-06 12:02:44', '本地', 'nick', '0'), ('fafa12b0-15e4-4ae3-a64b-47657dcb5c05', '2017-06-01 14:39:05', '本地', 'nick', '1'), ('fb3864e8-02a0-4437-b69c-fe9ade61fd8a', '2017-06-03 03:15:10', '本地', 'nick', '0'), ('fbc83f0b-954d-4d3e-92b1-dc4ebf37a54d', '2017-06-06 11:47:27', '本地', 'nick', '1'), ('fd7f36f0-bca4-41f3-b3a8-a64c1e615948', '2017-06-02 16:41:15', '本地', 'nick', '1'), ('fe89c8d3-2986-4f7d-985a-c3a1ee3ba9af', '2017-06-02 13:26:01', '本地', 'nick', '1'), ('fe8aa301-21d8-4cb1-a697-263d9a47a81b', '2017-06-02 13:56:01', '本地', 'nick', '0');
COMMIT;

-- ----------------------------
--  Table structure for `SYORGANIZATION`
-- ----------------------------
DROP TABLE IF EXISTS `SYORGANIZATION`;
CREATE TABLE `SYORGANIZATION` (
  `ID` varchar(36) NOT NULL,
  `ADDRESS` varchar(200) DEFAULT NULL,
  `CODE` varchar(200) DEFAULT NULL,
  `CREATEDATETIME` datetime DEFAULT NULL,
  `ICONCLS` varchar(100) DEFAULT NULL,
  `NAME` varchar(200) DEFAULT NULL,
  `SEQ` int(11) DEFAULT NULL,
  `UPDATEDATETIME` datetime DEFAULT NULL,
  `SYORGANIZATION_ID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_acf7qlb04quthktalwx8c7q69` (`SYORGANIZATION_ID`),
  CONSTRAINT `FK_acf7qlb04quthktalwx8c7q69` FOREIGN KEY (`SYORGANIZATION_ID`) REFERENCES `SYORGANIZATION` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `SYORGANIZATION`
-- ----------------------------
BEGIN;
INSERT INTO `SYORGANIZATION` VALUES ('0', '机构地址', null, '2017-06-01 11:11:58', 'ext-icon-brick', '一级机构', '0', '2017-06-01 11:11:58', null), ('135d0f96-00c2-4dec-9010-74d556f575a3', null, null, '2017-06-01 14:41:11', null, '12,232', null, '2017-06-01 14:41:11', null), ('8a845227-77d5-43e2-a1e4-42aabd4bb405', null, null, '2017-06-01 14:41:12', null, '12,232', null, '2017-06-01 14:41:12', null), ('d9b74b4d-4025-4e77-bfe8-360e44b12775', null, null, '2017-06-01 14:41:12', null, '12,232', null, '2017-06-01 14:41:12', null);
COMMIT;

-- ----------------------------
--  Table structure for `SYORGANIZATION_SYRESOURCE`
-- ----------------------------
DROP TABLE IF EXISTS `SYORGANIZATION_SYRESOURCE`;
CREATE TABLE `SYORGANIZATION_SYRESOURCE` (
  `SYRESOURCE_ID` varchar(36) NOT NULL,
  `SYORGANIZATION_ID` varchar(36) NOT NULL,
  PRIMARY KEY (`SYORGANIZATION_ID`,`SYRESOURCE_ID`),
  KEY `FK_acpjp8a7fjo0cnn02eb0ia6uf` (`SYORGANIZATION_ID`),
  KEY `FK_m4mfglk7odi78d8pk9pif44vc` (`SYRESOURCE_ID`),
  CONSTRAINT `FK_acpjp8a7fjo0cnn02eb0ia6uf` FOREIGN KEY (`SYORGANIZATION_ID`) REFERENCES `SYORGANIZATION` (`ID`),
  CONSTRAINT `FK_m4mfglk7odi78d8pk9pif44vc` FOREIGN KEY (`SYRESOURCE_ID`) REFERENCES `SYRESOURCE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `SYORGANIZATION_SYRESOURCE`
-- ----------------------------
BEGIN;
INSERT INTO `SYORGANIZATION_SYRESOURCE` VALUES ('jgck', '0'), ('jggl', '0'), ('jglb', '0'), ('jsck', '0'), ('jsgl', '0'), ('jslb', '0'), ('xtgl', '0'), ('yhck', '0'), ('yhgl', '0'), ('yhlb', '0'), ('zyck', '0'), ('zygl', '0'), ('zylb', '0');
COMMIT;

-- ----------------------------
--  Table structure for `SYRESOURCE`
-- ----------------------------
DROP TABLE IF EXISTS `SYRESOURCE`;
CREATE TABLE `SYRESOURCE` (
  `ID` varchar(36) NOT NULL,
  `CREATEDATETIME` datetime DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  `ICONCLS` varchar(100) DEFAULT NULL,
  `NAME` varchar(100) NOT NULL,
  `SEQ` int(11) DEFAULT NULL,
  `TARGET` varchar(100) DEFAULT NULL,
  `UPDATEDATETIME` datetime DEFAULT NULL,
  `URL` varchar(200) DEFAULT NULL,
  `SYRESOURCE_ID` varchar(36) DEFAULT NULL,
  `SYRESOURCETYPE_ID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_n8kk2inhw4y4gax3nra2etfup` (`SYRESOURCE_ID`),
  KEY `FK_93qfpiiuk3rwb32gc5mcmmlgh` (`SYRESOURCETYPE_ID`),
  CONSTRAINT `FK_93qfpiiuk3rwb32gc5mcmmlgh` FOREIGN KEY (`SYRESOURCETYPE_ID`) REFERENCES `SYRESOURCETYPE` (`ID`),
  CONSTRAINT `FK_n8kk2inhw4y4gax3nra2etfup` FOREIGN KEY (`SYRESOURCE_ID`) REFERENCES `SYRESOURCE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `SYRESOURCE`
-- ----------------------------
BEGIN;
INSERT INTO `SYRESOURCE` VALUES ('2e9a605f-151c-45fd-8815-f674b68931f4', '2017-06-02 15:30:45', '查看活动', 'ext-icon-report', '查看活动', '100', null, '2017-06-02 15:31:43', '/base/activity!getById', 'hdlbgl', '1'), ('3c968e29-99f8-42c7-9a38-3b45ef04ae7d', '2017-06-02 11:08:44', '查看活动用户信息', 'ext-icon-vcard', '查看活动用户信息', '100', null, '2017-06-02 11:11:11', '/base/activityuser!getById', 'hdyhgl', '1'), ('424144ab-a05c-405b-93d8-186cbe45a92d', '2017-06-02 13:25:24', '删除活动用户信息', 'ext-icon-vcard_delete', '删除活动用户信息', '100', null, '2017-06-02 13:27:23', '/base/activityuser!delete', 'hdyhgl', '1'), ('512cf70f-f7e3-49da-8587-70307f1395df', '2017-06-02 15:42:47', '添加活动信息', null, '添加活动信息', '100', null, '2017-06-02 15:42:47', '/base/activity!save', 'hdlbgl', '1'), ('570c015a-230e-4f42-9dd0-9336d9da1161', '2017-06-02 15:42:13', '修改活动信息', null, '修改活动信息', '100', null, '2017-06-02 15:42:13', '/base/activity!update', 'hdlbgl', '1'), ('9764045c-0152-4fe2-a2b0-244f6193d497', '2017-06-01 15:13:11', '添加活动用户信息', 'ext-icon-vcard_add', '添加活动用户信息', '100', null, '2017-06-01 15:16:08', '/base/activityuser!save', 'hdyhgl', '1'), ('actionConfigBrowser', '2017-06-01 11:11:57', 'Action映射情况监控', 'ext-icon-monitor_lightning', 'Action映射监控', '3', '', '2017-06-01 11:11:57', '/config-browser/showConstants.sy', 'xtjk', '0'), ('c2017c27-eccf-4c7e-87b6-119ec050cc31', '2017-06-02 15:53:42', '删除活动信息', null, '删除活动信息', '100', null, '2017-06-02 15:53:42', '/base/activity!delete', 'hdlbgl', '1'), ('cxfDemo', '2017-06-02 10:56:42', 'Apache CXF DEMO', 'ext-icon-world', 'ApacheCXF示例', '0', 'CXFDemo', '2017-06-02 10:56:42', '/ws', 'demo', '0'), ('d290bdd0-f0c4-4ee3-8b96-f630d6e9bb6f', '2017-06-02 12:44:22', '修改活动用户信息', 'ext-icon-vcard_edit', '修改活动用户信息', '100', null, '2017-06-02 12:44:22', '/base/activityuser!update', 'hdyhgl', '1'), ('demo', '2017-06-01 11:11:57', 'EasyUI还能做到更多，只有你想不到，没有做不到！', 'ext-icon-asterisk_orange', '其他示例', '3', '', '2017-06-01 11:11:57', '/welcome.jsp', null, '0'), ('druid', '2017-06-01 11:11:57', '监控数据源', 'ext-icon-monitor_link', '数据源监控', '2', '', '2017-06-01 11:11:57', '/druid', 'xtjk', '0'), ('easyuiAPI', '2017-06-01 11:11:57', 'EasyUI官方API', 'ext-icon-medal_bronze_2', 'EasyUI官方API', '6', '', '2017-06-01 11:11:57', 'http://jeasyui.com/documentation/index.php', 'demo', '0'), ('easyuiDemo', '2017-06-01 11:11:57', 'EasyUI官方Demo', 'ext-icon-medal_bronze_1', 'EasyUI官方Demo', '5', '', '2017-06-01 11:11:57', 'http://jeasyui.com/demo/main/index.php', 'demo', '0'), ('easyuiDownload', '2017-06-01 11:11:57', 'EasyUI官方下载', 'ext-icon-medal_gold_1', 'EasyUI官方下载', '8', '', '2017-06-01 11:11:57', 'http://jeasyui.com/download/index.php', 'demo', '0'), ('easyuiExtension', '2017-06-01 11:11:57', 'EasyUI其他扩展', 'ext-icon-medal_gold_2', 'EasyUI其他扩展', '9', '', '2017-06-01 11:11:57', 'http://jeasyui.com/extension/index.php', 'demo', '0'), ('easyuiForum', '2017-06-01 11:11:57', 'EasyUI官方论坛', 'ext-icon-medal_gold_3', 'EasyUI官方论坛', '10', '', '2017-06-01 11:11:57', 'http://www.jeasyui.com/forum/index.php', 'demo', '0'), ('easyuiTutorial', '2017-06-01 11:11:57', 'EasyUI辅导', 'ext-icon-medal_bronze_3', 'EasyUI进阶DEMO', '7', '', '2017-06-01 11:11:57', 'http://jeasyui.com/tutorial/index.php', 'demo', '0'), ('hdgl', '2017-06-01 11:11:57', '管理活动', 'ext-icon-tux', '活动管理', '0', '', '2017-06-01 11:11:57', '/welcome.jsp', null, '0'), ('hdjllb', '2017-06-01 11:11:57', '活动记录列表', 'ext-icon-tux', '活动记录列表', '0', '', '2017-06-01 11:11:57', '/base/activityrecord!grid', 'hdjllbgl', '1'), ('hdjllbgl', '2017-06-01 11:11:57', '活动记录列表管理', 'ext-icon-tux', '活动记录列表管理', '3', '', '2017-06-01 11:11:57', '/securityJsp/base/Activityrecord.jsp', 'hdgl', '0'), ('hdlb', '2017-06-01 11:11:57', '查询活动列表', 'ext-icon-tux', '活动列表', '0', '', '2017-06-01 11:11:57', '/base/activity!grid', 'hdlbgl', '1'), ('hdlbgl', '2017-06-01 11:11:57', '活动列表管理', 'ext-icon-tux', '活动列表管理', '2', '', '2017-06-01 11:11:57', '/securityJsp/base/Activity.jsp', 'hdgl', '0'), ('hdyhgl', '2017-06-01 11:11:57', '管理活动', 'ext-icon-tux', '活动用户管理', '1', '', '2017-06-01 11:11:57', '/securityJsp/base/ActivityUser.jsp', 'hdgl', '0'), ('hdyhlb', '2017-06-01 11:11:57', '查询活动用户列表', 'ext-icon-tux', '活动用户列表', '0', '', '2017-06-01 11:11:57', '/base/activityuser!grid', 'hdyhgl', '1'), ('jgbj', '2017-06-01 11:11:57', '编辑机构', 'ext-icon-bullet_wrench', '编辑机构', '2', '', '2017-06-01 11:11:57', '/base/syorganization!update', 'jggl', '1'), ('jgck', '2017-06-01 11:11:57', '查看机构', 'ext-icon-bullet_wrench', '查看机构', '4', '', '2017-06-01 11:11:57', '/base/syorganization!getById', 'jggl', '1'), ('jggl', '2017-06-01 11:11:57', '管理系统中用户的机构', 'ext-icon-group_link', '机构管理', '3', '', '2017-06-01 11:11:57', '/securityJsp/base/Syorganization.jsp', 'xtgl', '0'), ('jglb', '2017-06-01 11:11:57', '查询机构列表', 'ext-icon-bullet_wrench', '机构列表', '0', '', '2017-06-01 11:11:57', '/base/syorganization!treeGrid', 'jggl', '1'), ('jgsc', '2017-06-01 11:11:57', '删除机构', 'ext-icon-bullet_wrench', '删除机构', '3', '', '2017-06-01 11:11:57', '/base/syorganization!delete', 'jggl', '1'), ('jgsq', '2017-06-01 11:11:57', '机构授权', 'ext-icon-bullet_wrench', '机构授权', '5', '', '2017-06-01 11:11:57', '/base/syorganization!grant', 'jggl', '1'), ('jgtj', '2017-06-01 11:11:57', '添加机构', 'ext-icon-bullet_wrench', '添加机构', '1', '', '2017-06-01 11:11:57', '/base/syorganization!save', 'jggl', '1'), ('jsbj', '2017-06-01 11:11:57', '编辑角色', 'ext-icon-bullet_wrench', '编辑角色', '2', '', '2017-06-01 11:11:57', '/base/syrole!update', 'jsgl', '1'), ('jsck', '2017-06-01 11:11:57', '查看角色', 'ext-icon-bullet_wrench', '查看角色', '4', '', '2017-06-01 11:11:57', '/base/syrole!getById', 'jsgl', '1'), ('jsgl', '2017-06-01 11:11:57', '管理系统中用户的角色', 'ext-icon-tux', '角色管理', '2', '', '2017-06-01 11:11:57', '/securityJsp/base/Syrole.jsp', 'xtgl', '0'), ('jslb', '2017-06-01 11:11:57', '查询角色列表', 'ext-icon-bullet_wrench', '角色列表', '0', '', '2017-06-01 11:11:57', '/base/syrole!grid', 'jsgl', '1'), ('jssc', '2017-06-01 11:11:57', '删除角色', 'ext-icon-bullet_wrench', '删除角色', '3', '', '2017-06-01 11:11:57', '/base/syrole!delete', 'jsgl', '1'), ('jssq', '2017-06-01 11:11:57', '角色授权', 'ext-icon-bullet_wrench', '角色授权', '5', '', '2017-06-01 11:11:57', '/base/syrole!grant', 'jsgl', '1'), ('jstj', '2017-06-01 11:11:57', '添加角色', 'ext-icon-bullet_wrench', '添加角色', '1', '', '2017-06-01 11:11:57', '/base/syrole!save', 'jsgl', '1'), ('monitoring', '2017-06-01 11:11:57', '监控项目', 'ext-icon-monitor_error', '项目监控', '1', '', '2017-06-01 11:11:57', '/monitoring', 'xtjk', '0'), ('online', '2017-06-01 11:11:57', '监控用户登录、注销', 'ext-icon-chart_line', '用户登录历史监控', '4', '', '2017-06-01 11:11:57', '/securityJsp/base/Syonline.jsp', 'xtjk', '0'), ('onlineGrid', '2017-06-01 11:11:57', '用户登录、注销历史记录列表', 'ext-icon-bullet_wrench', '用户登录历史列表', '0', '', '2017-06-01 11:11:57', '/base/syonline!grid', 'online', '1'), ('userCreateDatetimeChart', '2017-06-01 11:11:57', '用户注册时间分布报表', 'ext-icon-chart_bar', '注册时间分布', '1', '', '2017-06-01 11:11:57', '/securityJsp/base/chart/userCreateDatetimeChart.jsp', 'xtbb', '0'), ('userRoleChart', '2017-06-01 11:11:57', '用户角色分布', 'ext-icon-chart_pie', '用户角色分布', '2', '', '2017-06-01 11:11:57', '/securityJsp/base/chart/userRoleChart.jsp', 'xtbb', '0'), ('xshdjllb', '2017-06-01 11:11:57', '活动记录列表', 'ext-icon-tux', '显示活动记录列表', '1', '', '2017-06-01 11:11:57', '/base/record!doNotNeedSecurity_getRecordByActivityUserId', 'hdjllbgl', '1'), ('xtbb', '2017-06-01 11:11:57', '查看系统相关报表图标', 'ext-icon-chart_curve', '系统报表', '2', '', '2017-06-01 11:11:57', '/welcome.jsp', null, '0'), ('xtgl', '2017-06-01 11:11:57', '管理系统的资源、角色、机构、用户等信息', 'ext-icon-application_view_tile', '系统管理', '0', '', '2017-06-01 11:11:57', '/welcome.jsp', null, '0'), ('xtjk', '2017-06-01 11:11:57', '监控系统运行情况等信息', 'ext-icon-monitor', '系统监控', '1', '', '2017-06-01 11:11:57', '/welcome.jsp', null, '0'), ('yhbj', '2017-06-01 11:11:57', '编辑用户', 'ext-icon-bullet_wrench', '编辑用户', '2', '', '2017-06-01 11:11:57', '/base/syuser!update', 'yhgl', '1'), ('yhck', '2017-06-01 11:11:57', '查看用户', 'ext-icon-bullet_wrench', '查看用户', '4', '', '2017-06-01 11:11:57', '/base/syuser!getById', 'yhgl', '1'), ('yhgl', '2017-06-01 11:11:57', '管理系统中用户的用户', 'ext-icon-user_suit', '用户管理', '4', '', '2017-06-01 11:11:57', '/securityJsp/base/Syuser.jsp', 'xtgl', '0'), ('yhjg', '2017-06-01 11:11:57', '编辑用户机构', 'ext-icon-bullet_wrench', '用户机构', '6', '', '2017-06-01 11:11:57', '/base/syuser!grantOrganization', 'yhgl', '1'), ('yhjs', '2017-06-01 11:11:57', '编辑用户角色', 'ext-icon-bullet_wrench', '用户角色', '5', '', '2017-06-01 11:11:57', '/base/syuser!grantRole', 'yhgl', '1'), ('yhlb', '2017-06-01 11:11:57', '查询用户列表', 'ext-icon-bullet_wrench', '用户列表', '0', '', '2017-06-01 11:11:57', '/base/syuser!grid', 'yhgl', '1'), ('yhsc', '2017-06-01 11:11:57', '删除用户', 'ext-icon-bullet_wrench', '删除用户', '3', '', '2017-06-01 11:11:57', '/base/syuser!delete', 'yhgl', '1'), ('yhtj', '2017-06-01 11:11:57', '添加用户', 'ext-icon-bullet_wrench', '添加用户', '1', '', '2017-06-01 11:11:57', '/base/syuser!save', 'yhgl', '1'), ('zybj', '2017-06-01 11:11:57', '编辑资源', 'ext-icon-bullet_wrench', '编辑资源', '2', '', '2017-06-01 11:11:57', '/base/syresource!update', 'zygl', '1'), ('zyck', '2017-06-01 11:11:57', '查看资源', 'ext-icon-bullet_wrench', '查看资源', '4', '', '2017-06-01 11:11:57', '/base/syresource!getById', 'zygl', '1'), ('zygl', '2017-06-01 11:11:57', '管理系统的资源', 'ext-icon-newspaper_link', '资源管理', '1', '', '2017-06-01 11:11:57', '/securityJsp/base/Syresource.jsp', 'xtgl', '0'), ('zylb', '2017-06-01 11:11:57', '查询资源', 'ext-icon-bullet_wrench', '资源列表', '0', '', '2017-06-01 11:11:57', '/base/syresource!treeGrid', 'zygl', '1'), ('zysc', '2017-06-01 11:11:57', '删除资源', 'ext-icon-bullet_wrench', '删除资源', '3', '', '2017-06-01 11:11:57', '/base/syresource!delete', 'zygl', '1'), ('zytj', '2017-06-01 11:11:57', '添加资源', 'ext-icon-bullet_wrench', '添加资源', '1', '', '2017-06-01 11:11:57', '/base/syresource!save', 'zygl', '1');
COMMIT;

-- ----------------------------
--  Table structure for `SYRESOURCETYPE`
-- ----------------------------
DROP TABLE IF EXISTS `SYRESOURCETYPE`;
CREATE TABLE `SYRESOURCETYPE` (
  `ID` varchar(36) NOT NULL,
  `CREATEDATETIME` datetime DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  `NAME` varchar(100) NOT NULL,
  `UPDATEDATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `SYRESOURCETYPE`
-- ----------------------------
BEGIN;
INSERT INTO `SYRESOURCETYPE` VALUES ('0', '2017-06-01 11:11:57', '菜单类型会显示在系统首页左侧菜单中', '菜单', '2017-06-01 11:11:57'), ('1', '2017-06-01 11:11:57', '功能类型不会显示在系统首页左侧菜单中', '功能', '2017-06-01 11:11:57');
COMMIT;

-- ----------------------------
--  Table structure for `SYROLE`
-- ----------------------------
DROP TABLE IF EXISTS `SYROLE`;
CREATE TABLE `SYROLE` (
  `ID` varchar(36) NOT NULL,
  `CREATEDATETIME` datetime DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  `ICONCLS` varchar(100) DEFAULT NULL,
  `NAME` varchar(100) NOT NULL,
  `SEQ` int(11) DEFAULT NULL,
  `UPDATEDATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `SYROLE`
-- ----------------------------
BEGIN;
INSERT INTO `SYROLE` VALUES ('0', '2017-06-01 11:11:57', '拥有系统所有权限', null, '超管', '0', '2017-06-01 11:11:57'), ('1', '2017-06-01 11:11:57', '只有查看权限', null, 'Guest', '1', '2017-06-01 11:11:57'), ('2', '2017-06-01 11:11:57', '只有资源管理权限', null, 'admin1', '2', '2017-06-01 11:11:57'), ('3', '2017-06-01 11:11:57', '只有角色管理权限', null, 'admin2', '3', '2017-06-01 11:11:57'), ('4', '2017-06-01 11:11:57', '只有机构管理权限', null, 'admin3', '4', '2017-06-01 11:11:57'), ('5', '2017-06-01 11:11:57', '只有用户管理权限', null, 'admin4', '5', '2017-06-01 11:11:57'), ('6', '2017-06-01 11:11:57', '只有系统监控权限', null, 'admin5', '6', '2017-06-01 11:11:57');
COMMIT;

-- ----------------------------
--  Table structure for `SYROLE_SYRESOURCE`
-- ----------------------------
DROP TABLE IF EXISTS `SYROLE_SYRESOURCE`;
CREATE TABLE `SYROLE_SYRESOURCE` (
  `SYROLE_ID` varchar(36) NOT NULL,
  `SYRESOURCE_ID` varchar(36) NOT NULL,
  PRIMARY KEY (`SYRESOURCE_ID`,`SYROLE_ID`),
  KEY `FK_kkrartsovl2frhfvriqdi7jwl` (`SYRESOURCE_ID`),
  KEY `FK_r139h669pg4ts6mbvn3ip5472` (`SYROLE_ID`),
  CONSTRAINT `FK_kkrartsovl2frhfvriqdi7jwl` FOREIGN KEY (`SYRESOURCE_ID`) REFERENCES `SYRESOURCE` (`ID`),
  CONSTRAINT `FK_r139h669pg4ts6mbvn3ip5472` FOREIGN KEY (`SYROLE_ID`) REFERENCES `SYROLE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `SYROLE_SYRESOURCE`
-- ----------------------------
BEGIN;
INSERT INTO `SYROLE_SYRESOURCE` VALUES ('0', '2e9a605f-151c-45fd-8815-f674b68931f4'), ('0', '3c968e29-99f8-42c7-9a38-3b45ef04ae7d'), ('0', '424144ab-a05c-405b-93d8-186cbe45a92d'), ('0', '512cf70f-f7e3-49da-8587-70307f1395df'), ('0', '570c015a-230e-4f42-9dd0-9336d9da1161'), ('0', '9764045c-0152-4fe2-a2b0-244f6193d497'), ('0', 'actionConfigBrowser'), ('6', 'actionConfigBrowser'), ('0', 'c2017c27-eccf-4c7e-87b6-119ec050cc31'), ('0', 'cxfDemo'), ('0', 'd290bdd0-f0c4-4ee3-8b96-f630d6e9bb6f'), ('0', 'demo'), ('1', 'demo'), ('0', 'druid'), ('6', 'druid'), ('0', 'easyuiAPI'), ('1', 'easyuiAPI'), ('0', 'easyuiDemo'), ('1', 'easyuiDemo'), ('0', 'easyuiDownload'), ('1', 'easyuiDownload'), ('0', 'easyuiExtension'), ('1', 'easyuiExtension'), ('0', 'easyuiForum'), ('1', 'easyuiForum'), ('0', 'easyuiTutorial'), ('1', 'easyuiTutorial'), ('0', 'hdgl'), ('0', 'hdjllb'), ('0', 'hdjllbgl'), ('0', 'hdlb'), ('0', 'hdlbgl'), ('0', 'hdyhgl'), ('0', 'hdyhlb'), ('0', 'jgbj'), ('4', 'jgbj'), ('0', 'jgck'), ('1', 'jgck'), ('4', 'jgck'), ('0', 'jggl'), ('1', 'jggl'), ('4', 'jggl'), ('0', 'jglb'), ('1', 'jglb'), ('4', 'jglb'), ('0', 'jgsc'), ('4', 'jgsc'), ('0', 'jgsq'), ('4', 'jgsq'), ('0', 'jgtj'), ('4', 'jgtj'), ('0', 'jsbj'), ('3', 'jsbj'), ('0', 'jsck'), ('1', 'jsck'), ('3', 'jsck'), ('0', 'jsgl'), ('1', 'jsgl'), ('3', 'jsgl'), ('0', 'jslb'), ('1', 'jslb'), ('3', 'jslb'), ('0', 'jssc'), ('3', 'jssc'), ('0', 'jssq'), ('3', 'jssq'), ('0', 'jstj'), ('3', 'jstj'), ('0', 'monitoring'), ('6', 'monitoring'), ('0', 'online'), ('6', 'online'), ('0', 'onlineGrid'), ('6', 'onlineGrid'), ('0', 'userCreateDatetimeChart'), ('0', 'userRoleChart'), ('0', 'xshdjllb'), ('0', 'xtbb'), ('0', 'xtgl'), ('1', 'xtgl'), ('0', 'xtjk'), ('6', 'xtjk'), ('0', 'yhbj'), ('5', 'yhbj'), ('0', 'yhck'), ('1', 'yhck'), ('5', 'yhck'), ('0', 'yhgl'), ('1', 'yhgl'), ('5', 'yhgl'), ('0', 'yhjg'), ('5', 'yhjg'), ('0', 'yhjs'), ('5', 'yhjs'), ('0', 'yhlb'), ('1', 'yhlb'), ('5', 'yhlb'), ('0', 'yhsc'), ('5', 'yhsc'), ('0', 'yhtj'), ('5', 'yhtj'), ('0', 'zybj'), ('2', 'zybj'), ('0', 'zyck'), ('1', 'zyck'), ('2', 'zyck'), ('0', 'zygl'), ('1', 'zygl'), ('2', 'zygl'), ('0', 'zylb'), ('1', 'zylb'), ('2', 'zylb'), ('0', 'zysc'), ('2', 'zysc'), ('0', 'zytj'), ('2', 'zytj');
COMMIT;

-- ----------------------------
--  Table structure for `SYUSER`
-- ----------------------------
DROP TABLE IF EXISTS `SYUSER`;
CREATE TABLE `SYUSER` (
  `ID` varchar(36) NOT NULL,
  `AGE` int(11) DEFAULT NULL,
  `CREATEDATETIME` datetime DEFAULT NULL,
  `LOGINNAME` varchar(100) NOT NULL,
  `NAME` varchar(100) DEFAULT NULL,
  `PHOTO` varchar(200) DEFAULT NULL,
  `PWD` varchar(100) DEFAULT NULL,
  `SEX` varchar(1) DEFAULT NULL,
  `UPDATEDATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `SYUSER`
-- ----------------------------
BEGIN;
INSERT INTO `SYUSER` VALUES ('0', '30', '2017-06-01 11:11:58', 'nick', 'nick', '/ssheUploadFile/userPhoto/2017/06/02/96015a32226e46b6a3215c7ef9f8f848.jpg', 'e10adc3949ba59abbe56e057f20f883e', '1', '2017-06-02 10:19:18'), ('1', '30', '2017-06-01 11:11:58', 'guest', 'guest', null, 'e10adc3949ba59abbe56e057f20f883e', '1', '2017-06-01 11:11:58'), ('2', '30', '2017-06-01 11:11:58', 'admin1', 'admin1', null, 'e10adc3949ba59abbe56e057f20f883e', '0', '2017-06-01 11:11:58'), ('3', '30', '2017-06-01 11:11:58', 'admin2', 'admin2', null, 'e10adc3949ba59abbe56e057f20f883e', '0', '2017-06-01 11:11:58'), ('4', '30', '2017-06-01 11:11:58', 'admin3', 'admin3', null, 'e10adc3949ba59abbe56e057f20f883e', '0', '2017-06-01 11:11:58'), ('5', '30', '2017-06-01 11:11:58', 'admin4', 'admin4', null, 'e10adc3949ba59abbe56e057f20f883e', '0', '2017-06-01 11:11:58'), ('6', '30', '2017-06-01 11:11:58', 'admin5', 'admin5', null, 'e10adc3949ba59abbe56e057f20f883e', '0', '2017-06-01 11:11:58'), ('70375a98-4e19-45c2-a77d-ba50b9f9b510', null, '2017-06-02 14:22:54', '34', '23', null, null, '1', '2017-06-02 14:25:42'), ('c3e5dc81-c62b-483f-a489-400e2a717af6', null, '2017-06-01 15:31:47', '23', '34', '/ssheUploadFile/userPhoto/2017/06/02/9fe70cb9d57d4607ba98d4949435d659.jpg', null, '1', '2017-06-02 14:23:29');
COMMIT;

-- ----------------------------
--  Table structure for `SYUSER_SYORGANIZATION`
-- ----------------------------
DROP TABLE IF EXISTS `SYUSER_SYORGANIZATION`;
CREATE TABLE `SYUSER_SYORGANIZATION` (
  `SYUSER_ID` varchar(36) NOT NULL,
  `SYORGANIZATION_ID` varchar(36) NOT NULL,
  PRIMARY KEY (`SYORGANIZATION_ID`,`SYUSER_ID`),
  KEY `FK_14ewqc5wtscac0dd5rswrm5j2` (`SYORGANIZATION_ID`),
  KEY `FK_63bdmtxwlk259id13rp4iryy` (`SYUSER_ID`),
  CONSTRAINT `FK_14ewqc5wtscac0dd5rswrm5j2` FOREIGN KEY (`SYORGANIZATION_ID`) REFERENCES `SYORGANIZATION` (`ID`),
  CONSTRAINT `FK_63bdmtxwlk259id13rp4iryy` FOREIGN KEY (`SYUSER_ID`) REFERENCES `SYUSER` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `SYUSER_SYORGANIZATION`
-- ----------------------------
BEGIN;
INSERT INTO `SYUSER_SYORGANIZATION` VALUES ('0', '0'), ('1', '0'), ('0', '135d0f96-00c2-4dec-9010-74d556f575a3'), ('0', '8a845227-77d5-43e2-a1e4-42aabd4bb405'), ('0', 'd9b74b4d-4025-4e77-bfe8-360e44b12775');
COMMIT;

-- ----------------------------
--  Table structure for `SYUSER_SYROLE`
-- ----------------------------
DROP TABLE IF EXISTS `SYUSER_SYROLE`;
CREATE TABLE `SYUSER_SYROLE` (
  `SYUSER_ID` varchar(36) NOT NULL,
  `SYROLE_ID` varchar(36) NOT NULL,
  PRIMARY KEY (`SYROLE_ID`,`SYUSER_ID`),
  KEY `FK_j7iwtgslc2esrjx0ptieleoko` (`SYROLE_ID`),
  KEY `FK_1pi4p5h4y5ghbs5f4gdlgn620` (`SYUSER_ID`),
  CONSTRAINT `FK_1pi4p5h4y5ghbs5f4gdlgn620` FOREIGN KEY (`SYUSER_ID`) REFERENCES `SYUSER` (`ID`),
  CONSTRAINT `FK_j7iwtgslc2esrjx0ptieleoko` FOREIGN KEY (`SYROLE_ID`) REFERENCES `SYROLE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `SYUSER_SYROLE`
-- ----------------------------
BEGIN;
INSERT INTO `SYUSER_SYROLE` VALUES ('0', '0'), ('0', '1'), ('1', '1'), ('0', '2'), ('2', '2'), ('0', '3'), ('3', '3'), ('0', '4'), ('4', '4'), ('0', '5'), ('5', '5'), ('0', '6'), ('6', '6');
COMMIT;

-- ----------------------------
--  Table structure for `activity`
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `id` varchar(50) NOT NULL,
  `createdatetime` datetime DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `activity`
-- ----------------------------
BEGIN;
INSERT INTO `activity` VALUES ('1', '2017-06-02 15:09:34', '老虎机1', '/sshe/ssheUploadFile/userPhoto/2017/06/02/e31f2a20d603434498a4776cc9c529b1.jpg'), ('2b7648bf-9d2b-4e4d-9613-5af9d6cd4f7a', '2017-06-02 15:51:52', '老虎机3', '/sshe/ssheUploadFile/userPhoto/2017/06/02/5803792593fc476396cc801d6e7a15ea.jpg');
COMMIT;

-- ----------------------------
--  Table structure for `activityUser`
-- ----------------------------
DROP TABLE IF EXISTS `activityUser`;
CREATE TABLE `activityUser` (
  `id` varchar(36) NOT NULL,
  `nickname` varchar(100) DEFAULT NULL,
  `createdatetime` datetime DEFAULT NULL,
  `headurl` varchar(500) DEFAULT NULL,
  `lastlogindatetime` datetime DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `role` varchar(30) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `activityUser`
-- ----------------------------
BEGIN;
INSERT INTO `activityUser` VALUES ('b434fee5-0b63-47e0-a849-50cb0c2f8d31', '12', '2017-06-02 15:00:36', '/sshe/ssheUploadFile/userPhoto/2017/06/02/39d443cb766540eb9a1750cf3c949261.jpg', null, 'nick2', null, null, '1'), ('9de3f4fe-a05f-4ccf-887d-3ffa99304bb2', 'bobo', '2017-06-02 15:05:14', '/sshe/ssheUploadFile/userPhoto/2017/06/02/027fd6055126478c951f920aed34b147.jpg', null, 'nick1', null, null, '1');
COMMIT;

-- ----------------------------
--  Table structure for `record`
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `id` varchar(50) NOT NULL,
  `createdatetime` datetime DEFAULT NULL,
  `score` varchar(50) DEFAULT NULL,
  `activityid` varchar(50) DEFAULT NULL,
  `userid` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_comik54peobiuq1w51r74fjhl` (`activityid`),
  KEY `FK_mk8g930uld2j5qveb3pb6ggu` (`userid`),
  CONSTRAINT `FK_comik54peobiuq1w51r74fjh2` FOREIGN KEY (`activityid`) REFERENCES `activity` (`id`),
  CONSTRAINT `FK_comik54peobiuq1w51r74fjha` FOREIGN KEY (`userid`) REFERENCES `activityUser` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `record`
-- ----------------------------
BEGIN;
INSERT INTO `record` VALUES ('1', '2017-06-02 15:11:08', '90', '1', 'b434fee5-0b63-47e0-a849-50cb0c2f8d31');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
