/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50559
Source Host           : 127.0.0.1:3306
Source Database       : mytest

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-05-07 14:03:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for abilitypoint
-- ----------------------------
DROP TABLE IF EXISTS `abilitypoint`;
CREATE TABLE `abilitypoint` (
  `id_ap` int(11) NOT NULL,
  `name_ap` varchar(50) DEFAULT NULL,
  `aspect_ap` varchar(50) DEFAULT NULL,
  `class_ap` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_ap`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of abilitypoint
-- ----------------------------
INSERT INTO `abilitypoint` VALUES ('1', '问题的符号表示', '模型（ML）', '计算思维能力');
INSERT INTO `abilitypoint` VALUES ('2', '问题求解过程的符号表示', '模型（ML）', '计算思维能力');
INSERT INTO `abilitypoint` VALUES ('3', '逻辑思维', '模型（ML）', '计算思维能力');
INSERT INTO `abilitypoint` VALUES ('4', '抽象思维', '模型（ML）', '计算思维能力');
INSERT INTO `abilitypoint` VALUES ('5', '形式化证明', '模型（ML）', '计算思维能力');
INSERT INTO `abilitypoint` VALUES ('6', '建立模型', '模型（ML）', '计算思维能力');
INSERT INTO `abilitypoint` VALUES ('7', '实现类计算', '模型（ML）', '计算思维能力');
INSERT INTO `abilitypoint` VALUES ('8', '实现模型计算', '模型（ML）', '计算思维能力');
INSERT INTO `abilitypoint` VALUES ('9', '利用计算机技术', '模型（ML）', '计算思维能力');
INSERT INTO `abilitypoint` VALUES ('10', '简单算法的设计', '算法（AL）', '算法设计与分析能力');
INSERT INTO `abilitypoint` VALUES ('11', '复杂算法的设计', '算法（AL）', '算法设计与分析能力');
INSERT INTO `abilitypoint` VALUES ('12', '简单算法的分析', '算法（AL）', '算法设计与分析能力');
INSERT INTO `abilitypoint` VALUES ('13', '复杂算法的分析', '算法（AL）', '算法设计与分析能力');
INSERT INTO `abilitypoint` VALUES ('14', '证明理论结果', '算法（AL）', '算法设计与分析能力');
INSERT INTO `abilitypoint` VALUES ('15', '开发程序设计问题的解', '算法（AL）', '算法设计与分析能力');
INSERT INTO `abilitypoint` VALUES ('16', '概念验证性程序开发', '算法（AL）', '算法设计与分析能力');
INSERT INTO `abilitypoint` VALUES ('17', '确定是否有更优的解', '算法（AL）', '算法设计与分析能力');
INSERT INTO `abilitypoint` VALUES ('18', '设计应用程序（基本办公软件）', '应用程序（AP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('19', '实现应用程序', '应用程序（AP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('20', '配置应用程序', '应用程序（AP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('21', '使用应用程序', '应用程序（AP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('22', '小型程序设计', '计算机程序设计（BP）', '程序设计与实现能力');
INSERT INTO `abilitypoint` VALUES ('23', '大型程序设计', '计算机程序设计（BP）', '程序设计与实现能力');
INSERT INTO `abilitypoint` VALUES ('24', '系统程序设计', '计算机程序设计（BP）', '程序设计与实现能力');
INSERT INTO `abilitypoint` VALUES ('25', '开发新的软件环境', '计算机程序设计（BP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('26', '创建安全系统', '计算机程序设计（BP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('27', '管理高级别安全要求项目', '计算机程序设计（BP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('28', '基本系统软件使用', '计算机程序设计（BP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('29', '系统软件构成', '计算机程序设计（BP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('30', '软件系统的性能', '计算机程序设计（BP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('31', '管理一个组织的网站', '通过集成开发系统（ID）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('32', '配置和集成电子商务软件', '通过集成开发系统（ID）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('33', '开发多媒体解决方案', '通过集成开发系统（ID）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('34', '配置和集成e-learning系统', '通过集成开发系统（ID）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('35', '开发业务解决方案', '通过集成开发系统（ID）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('36', '评价新型搜索引擎', '通过集成开发系统（ID）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('37', '设计数字电路', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('38', '实现数字电路', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('39', '设计功能部件', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('40', '设计嵌入式系统', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('41', '实现嵌入式系统', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('42', '设计计算机外设', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('43', '设计复杂传感器系统', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('44', '设计芯片', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('45', '对芯片进行程序设计', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('46', '设计计算机', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('47', '基本的计算机硬件系统构成', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('48', '硬件系统的性能', '硬件与设备（HW）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('49', '创建软件用户界面', '人机界面（HM）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('50', '制作图形或者游戏软件', '人机界面（HM）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('51', '设计人机友好的设备', '人机界面（HM）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('52', '定义信息系统需求', '信息系统（IS）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('53', '设计信息系统', '信息系统（IS）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('54', '实现信息系统', '信息系统（IS）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('55', '培训用户使用信息系统', '信息系统（IS）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('56', '维护和更新信息系统', '信息系统（IS）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('57', '设计数据库管理系统', '信息管理（IM）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('58', '数据库建模和设计', '信息管理（IM）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('59', '实现信息检索软件', '信息管理（IM）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('60', '配置数据库产品', '信息管理（IM）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('61', '选择数据库产品', '信息管理（IM）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('62', '管理数据库', '信息管理（IM）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('63', '数据库用户的培训与支持', '信息管理（IM）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('64', '制定企业信息规划', 'IT资源规划（IP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('65', '制定计算机资源规划', 'IT资源规划（IP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('66', '资源升级调度与预算', 'IT资源规划（IP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('67', '计算机安装与升级', 'IT资源规划（IP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('68', '计算机软件安装与升级', 'IT资源规划（IP）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('69', '设计智能系统', '智能系统（AI）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('70', '实现智能系统', '智能系统（AI）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('71', '安装计算机网络', '网络与通信（NC）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('72', '设计网络结构', '网络与通信（NC）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('73', '选择网络部件', '网络与通信（NC）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('74', '实现通信软件', '网络与通信（NC）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('75', '实现移动计算系统', '网络与通信（NC）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('76', '管理计算机网络', '网络与通信（NC）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('77', '管理通信资源', '网络与通信（NC）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('78', '管理移动计算资源', '网络与通信（NC）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('79', '网络系统的构成', '网络与通信（NC）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('80', '实验设计', '实验与分析（EA）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('81', '实验实现', '实验与分析（EA）', '系统能力');
INSERT INTO `abilitypoint` VALUES ('82', '实验分析', '实验与分析（EA）', '系统能力');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id_c` varchar(32) NOT NULL,
  `id_m` varchar(32) DEFAULT NULL,
  `name_c` varchar(50) DEFAULT NULL,
  `leader_c` varchar(50) DEFAULT NULL,
  `introduction_c` text,
  PRIMARY KEY (`id_c`),
  KEY `fk_major_course` (`id_m`),
  CONSTRAINT `fk_major_course` FOREIGN KEY (`id_m`) REFERENCES `major` (`id_m`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('c201', 'm101', '数据库技术', '王XX', '这是课程的简介');
INSERT INTO `course` VALUES ('c202', 'm101', '编译原理', '王XX', '这是课程的简介');
INSERT INTO `course` VALUES ('c203', 'm101', '计算机网络', '王XX', '这是课程的简介');

-- ----------------------------
-- Table structure for evaluationrecord
-- ----------------------------
DROP TABLE IF EXISTS `evaluationrecord`;
CREATE TABLE `evaluationrecord` (
  `id_t` varchar(32) NOT NULL,
  `id_s` varchar(32) NOT NULL,
  `id_er` varchar(32) NOT NULL,
  `begin_er` varchar(20) DEFAULT NULL,
  `end_er` varchar(20) DEFAULT NULL,
  `consumption_er` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_t`,`id_s`,`id_er`),
  KEY `fk_student_evaluation` (`id_s`),
  CONSTRAINT `fk_student_evaluation` FOREIGN KEY (`id_s`) REFERENCES `student` (`id_s`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluationrecord
-- ----------------------------
INSERT INTO `evaluationrecord` VALUES ('5210', '631406010101', 'er11102', '2018-04-10 10:12:10', '2018-04-10 11:20:20', '1:08:10');
INSERT INTO `evaluationrecord` VALUES ('5210', '631406010102', 'er11100', '2018-04-10 10:12:10', '2018-04-10 11:20:20', '1:08:10');
INSERT INTO `evaluationrecord` VALUES ('5210', '631406010102', 'er11101', '2018-04-10 10:12:10', '2018-04-10 11:20:20', '1:08:10');

-- ----------------------------
-- Table structure for fivemajor
-- ----------------------------
DROP TABLE IF EXISTS `fivemajor`;
CREATE TABLE `fivemajor` (
  `id_fm` varchar(32) NOT NULL,
  `name_fm` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_fm`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fivemajor
-- ----------------------------
INSERT INTO `fivemajor` VALUES ('1', '计算机工程');
INSERT INTO `fivemajor` VALUES ('2', '计算机科学');
INSERT INTO `fivemajor` VALUES ('3', '系统工程');
INSERT INTO `fivemajor` VALUES ('4', '信息系统');
INSERT INTO `fivemajor` VALUES ('5', '信息技术');

-- ----------------------------
-- Table structure for historytestpaper
-- ----------------------------
DROP TABLE IF EXISTS `historytestpaper`;
CREATE TABLE `historytestpaper` (
  `id_t` varchar(32) NOT NULL,
  `id_s` varchar(32) NOT NULL,
  `id_er` varchar(32) NOT NULL,
  `id_q` varchar(32) NOT NULL,
  `answer_htp` text,
  `score_htp` varchar(10) DEFAULT NULL,
  `timeconsuming_htp` varchar(20) DEFAULT NULL,
  `timeproportion_htp` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_t`,`id_s`,`id_er`,`id_q`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of historytestpaper
-- ----------------------------
INSERT INTO `historytestpaper` VALUES ('5210', '631406010102', 'er11100', 'que1', '学生的试题答案', '5', '3', '1');
INSERT INTO `historytestpaper` VALUES ('5210', '631406010102', 'er11100', 'que2', '学生的试题答案', '5', '3', '1');
INSERT INTO `historytestpaper` VALUES ('5210', '631406010102', 'er11100', 'que3', '学生的试题答案', '5', '3', '1');
INSERT INTO `historytestpaper` VALUES ('5210', '631406010102', 'er11100', 'que4', '学生的试题答案', '5', '3', '1');
INSERT INTO `historytestpaper` VALUES ('5210', '631406010102', 'er11100', 'que5', '学生的试题答案', '5', '3', '1');

-- ----------------------------
-- Table structure for knowledgepoint
-- ----------------------------
DROP TABLE IF EXISTS `knowledgepoint`;
CREATE TABLE `knowledgepoint` (
  `id_kp` varchar(32) NOT NULL,
  `id_ap` int(11) DEFAULT NULL,
  `name_kp` varchar(50) DEFAULT NULL,
  `proportion_kp` varchar(10) DEFAULT NULL,
  `note_kp` text,
  PRIMARY KEY (`id_kp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of knowledgepoint
-- ----------------------------

-- ----------------------------
-- Table structure for latestabilityscore
-- ----------------------------
DROP TABLE IF EXISTS `latestabilityscore`;
CREATE TABLE `latestabilityscore` (
  `id_s` varchar(32) NOT NULL,
  `id_ap` int(11) NOT NULL,
  `score_las` varchar(10) DEFAULT NULL,
  `proportion_las` varchar(10) DEFAULT NULL,
  `time_las` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_s`,`id_ap`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of latestabilityscore
-- ----------------------------
INSERT INTO `latestabilityscore` VALUES ('631406010101', '1', '8', '20%', '2018-03-20 10:12:20');
INSERT INTO `latestabilityscore` VALUES ('631406010101', '2', '8', '20%', '2018-03-20 10:12:20');
INSERT INTO `latestabilityscore` VALUES ('631406010101', '3', '8', '20%', '2018-03-20 10:12:20');
INSERT INTO `latestabilityscore` VALUES ('631406010101', '4', '8', '20%', '2018-03-20 10:12:20');
INSERT INTO `latestabilityscore` VALUES ('631406010101', '5', '8', '20%', '2018-03-20 10:12:20');
INSERT INTO `latestabilityscore` VALUES ('631406010102', '1', '8', '27%', '2018-03-20 10:12:20');
INSERT INTO `latestabilityscore` VALUES ('631406010102', '2', '7', '23%', '2018-03-20 10:12:20');
INSERT INTO `latestabilityscore` VALUES ('631406010102', '3', '6', '20%', '2018-03-20 10:12:20');
INSERT INTO `latestabilityscore` VALUES ('631406010102', '4', '5', '17%', '2018-03-20 10:12:20');
INSERT INTO `latestabilityscore` VALUES ('631406010102', '5', '4', '13%', '2018-03-20 10:12:20');

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `id_m` varchar(32) NOT NULL,
  `name_m` varchar(100) DEFAULT NULL,
  `leader_m` varchar(50) DEFAULT NULL,
  `id_fm` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id_m`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of major
-- ----------------------------
INSERT INTO `major` VALUES ('m101', '计算机科学与技术', '王XX', '2');
INSERT INTO `major` VALUES ('m102', '电子技术', '黄XX', '2');
INSERT INTO `major` VALUES ('m103', '物联网', '王XX', '2');

-- ----------------------------
-- Table structure for professionalabilitypontrequirements
-- ----------------------------
DROP TABLE IF EXISTS `professionalabilitypontrequirements`;
CREATE TABLE `professionalabilitypontrequirements` (
  `id_ap` int(11) NOT NULL,
  `id_fm` varchar(32) NOT NULL,
  `requiredlevel_papr` int(11) DEFAULT NULL,
  `conversionratio_papr` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_ap`,`id_fm`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of professionalabilitypontrequirements
-- ----------------------------
INSERT INTO `professionalabilitypontrequirements` VALUES ('1', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('1', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('2', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('2', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('3', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('3', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('4', '1', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('4', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('5', '1', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('5', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('6', '1', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('6', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('7', '1', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('7', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('8', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('8', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('9', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('9', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('10', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('10', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('11', '1', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('11', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('12', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('12', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('13', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('13', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('14', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('14', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('15', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('15', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('16', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('16', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('17', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('17', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('18', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('18', '2', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('19', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('19', '2', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('20', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('20', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('21', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('21', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('22', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('22', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('23', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('23', '2', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('24', '1', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('24', '2', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('25', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('25', '2', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('26', '1', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('26', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('27', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('27', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('28', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('28', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('29', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('29', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('30', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('30', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('31', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('31', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('32', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('32', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('33', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('33', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('34', '1', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('34', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('35', '1', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('35', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('36', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('36', '2', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('37', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('37', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('38', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('38', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('39', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('39', '2', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('40', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('40', '2', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('41', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('41', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('42', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('42', '2', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('43', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('43', '2', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('44', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('44', '2', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('45', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('45', '2', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('46', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('46', '2', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('47', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('47', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('48', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('48', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('49', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('49', '2', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('50', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('50', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('51', '1', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('51', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('52', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('52', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('53', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('53', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('54', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('54', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('55', '1', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('55', '2', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('56', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('56', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('57', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('57', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('58', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('58', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('59', '1', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('59', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('60', '1', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('60', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('61', '1', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('61', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('62', '1', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('62', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('63', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('63', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('64', '1', '0', '0');
INSERT INTO `professionalabilitypontrequirements` VALUES ('64', '2', '0', '0');
INSERT INTO `professionalabilitypontrequirements` VALUES ('65', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('65', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('66', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('66', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('67', '1', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('67', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('68', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('68', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('69', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('69', '2', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('70', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('70', '2', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('71', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('71', '2', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('72', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('72', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('73', '1', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('73', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('74', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('74', '2', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('75', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('75', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('76', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('76', '2', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('77', '1', '1', '0.2');
INSERT INTO `professionalabilitypontrequirements` VALUES ('77', '2', '0', '0');
INSERT INTO `professionalabilitypontrequirements` VALUES ('78', '1', '3', '0.6');
INSERT INTO `professionalabilitypontrequirements` VALUES ('78', '2', '2', '0.4');
INSERT INTO `professionalabilitypontrequirements` VALUES ('79', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('79', '2', '4', '0.8');
INSERT INTO `professionalabilitypontrequirements` VALUES ('80', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('80', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('81', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('81', '2', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('82', '1', '5', '1');
INSERT INTO `professionalabilitypontrequirements` VALUES ('82', '2', '5', '1');

-- ----------------------------
-- Table structure for questions
-- ----------------------------
DROP TABLE IF EXISTS `questions`;
CREATE TABLE `questions` (
  `id_q` varchar(32) NOT NULL,
  `id_c` varchar(32) DEFAULT NULL,
  `datatime_q` varchar(20) DEFAULT NULL,
  `context_q` text,
  `score_q` varchar(10) DEFAULT NULL,
  `time_q` varchar(10) DEFAULT NULL,
  `id_t` varchar(32) DEFAULT NULL,
  `answer_q` text,
  `style_q` varchar(20) DEFAULT NULL,
  `automaticscoring_q` varchar(10) DEFAULT NULL,
  `deleteornot_q` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_q`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of questions
-- ----------------------------
INSERT INTO `questions` VALUES ('que1', 'c201', '2018-04-12 10:12:10', '这是试题内容', '5', '5', '5210', '试题答案', '选择题', '是', '否');
INSERT INTO `questions` VALUES ('que2', 'c201', '2018-04-12 10:12:10', '这是试题内容', '5', '5', '5210', '试题答案', '选择题', '是', '否');
INSERT INTO `questions` VALUES ('que3', 'c201', '2018-04-12 10:12:10', '这是试题内容', '5', '5', '5210', '试题答案', '判断题', '是', '否');
INSERT INTO `questions` VALUES ('que4', 'c201', '2018-04-12 10:12:10', '这是试题内容', '5', '5', '5210', '试题答案', '选择题', '是', '否');
INSERT INTO `questions` VALUES ('que5', 'c201', '2018-04-12 10:12:10', '这是试题内容', '5', '5', '5210', '试题答案', '选择题', '是', '否');

-- ----------------------------
-- Table structure for questionspoint
-- ----------------------------
DROP TABLE IF EXISTS `questionspoint`;
CREATE TABLE `questionspoint` (
  `id_q` varchar(32) NOT NULL,
  `id_kp` varchar(32) NOT NULL,
  `proportion_qp` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_q`,`id_kp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of questionspoint
-- ----------------------------

-- ----------------------------
-- Table structure for scoredetail
-- ----------------------------
DROP TABLE IF EXISTS `scoredetail`;
CREATE TABLE `scoredetail` (
  `id_t` varchar(32) NOT NULL,
  `id_s` varchar(32) NOT NULL,
  `id_er` varchar(32) NOT NULL,
  `id_q` varchar(32) NOT NULL,
  `id_ap` int(11) NOT NULL,
  `score_sd` varchar(10) DEFAULT NULL,
  `time_sd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_t`,`id_s`,`id_er`,`id_q`,`id_ap`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scoredetail
-- ----------------------------
INSERT INTO `scoredetail` VALUES ('5210', '631406010101', 'er11102', 'que1', '1', '5', '2018-04-10 11:20:20');
INSERT INTO `scoredetail` VALUES ('5210', '631406010101', 'er11102', 'que1', '2', '5', '2018-04-10 11:20:20');
INSERT INTO `scoredetail` VALUES ('5210', '631406010101', 'er11102', 'que2', '1', '5', '2018-04-10 11:20:20');
INSERT INTO `scoredetail` VALUES ('5210', '631406010102', 'er11100', 'que1', '1', '5', '2018-04-10 11:20:20');
INSERT INTO `scoredetail` VALUES ('5210', '631406010102', 'er11100', 'que1', '2', '5', '2018-04-10 11:20:20');
INSERT INTO `scoredetail` VALUES ('5210', '631406010102', 'er11100', 'que2', '1', '5', '2018-04-10 11:20:20');
INSERT INTO `scoredetail` VALUES ('5210', '631406010102', 'er11100', 'que2', '2', '5', '2018-04-10 11:20:20');
INSERT INTO `scoredetail` VALUES ('5210', '631406010102', 'er11100', 'que3', '1', '5', '2018-04-10 11:20:20');
INSERT INTO `scoredetail` VALUES ('5210', '631406010102', 'er11100', 'que3', '2', '5', '2018-04-10 11:20:20');
INSERT INTO `scoredetail` VALUES ('5210', '631406010102', 'er11100', 'que4', '2', '5', '2018-04-10 11:20:20');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id_s` varchar(32) NOT NULL,
  `data_s` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_s`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('631406010101', '2014-09');
INSERT INTO `student` VALUES ('631406010102', '2014-09');
INSERT INTO `student` VALUES ('631406010103', '2014-09');
INSERT INTO `student` VALUES ('631406010104', '2014-09');
INSERT INTO `student` VALUES ('631406010105', '2014-09');
INSERT INTO `student` VALUES ('631406010106', '2014-09');
INSERT INTO `student` VALUES ('631406010107', '2014-09');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id_t` varchar(32) NOT NULL,
  `name_t` varchar(50) DEFAULT NULL,
  `id_m` varchar(50) DEFAULT NULL,
  `majorleader_t` varchar(50) DEFAULT NULL,
  `courseleader_t` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_t`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('5210', '王XX', 'm101', '是', '是');
INSERT INTO `teacher` VALUES ('5211', '黄XX', 'm102', '是', '是');
