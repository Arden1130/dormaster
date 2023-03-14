use dormitory;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `d_class`
-- ----------------------------
DROP TABLE IF EXISTS `d_class`;
CREATE TABLE `d_class` (
  `c_id` varchar(10) NOT NULL ,
  `c_classname` varchar(30) NOT NULL,
  `c_counsellor` varchar(30) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for `d_admin`
-- ----------------------------
DROP TABLE IF EXISTS `d_admin`;
CREATE TABLE `d_admin` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `a_username` varchar(20) NOT NULL,
  `a_password` varchar(50) NOT NULL,
  `a_name` varchar(20) NOT NULL,
  `a_gender` varchar(2) NOT NULL, 
  `a_role` varchar(20) NOT NULL,
  `a_phone` varchar(20) NOT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;/*ENGINE=InnoDB表示将数据库的引擎设置为InnoDB，但是从MySQL5.6开始就默认使用该引擎；
AUTO_INCREMENT=10表示自动增长的值从1开始；CHARSET=utf8mb4指明建表使用的字符集，不加可能会乱码*/


-- ----------------------------
-- Table structure for `d_visitor_info`
-- ----------------------------
DROP TABLE IF EXISTS `d_visitor_info`;
CREATE TABLE `d_visitor_info` (
  `v_indentity_id` char(18) NOT NULL,
  `v_phone` char(11) NOT NULL,
  `v_name` varchar(20) NOT NULL,
  PRIMARY KEY (`v_indentity_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


-- ----------------------------
-- Table structure for `d_dormitoryinfo`
-- ----------------------------
DROP TABLE IF EXISTS `d_dormitoryinfo`;
CREATE TABLE `d_dormitoryinfo` (
  `d_building_id` int(2) NOT NULL,
  `d_dormitory_id` int(3) NOT NULL, 
  `d_bedtotal` int(1) NOT NULL,
  `d_charge_left` int(4) NOT NULL,
  `d_bed` int(1) NOT NULL,
  PRIMARY KEY (`d_building_id`,`d_dormitory_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


-- ----------------------------
-- Table structure for `d_dormrepair`
-- ----------------------------
DROP TABLE IF EXISTS `d_dormrepair`;
CREATE TABLE `d_dormrepair` (
  `r_id` int(10) NOT NULL AUTO_INCREMENT,
  `d_building_id` int(2) NOT NULL,
  `d_dormitory_id` int(3) NOT NULL,
  `reason` varchar(100) NOT NULL,
  `update_time` datetime NOT NULL,
  `r_name` varchar(10),
  `create_time` datetime ,
  `state` varchar(10) NOT NULL,
  PRIMARY KEY (`r_id`),
  FOREIGN KEY (`d_building_id`,`d_dormitory_id`) REFERENCES `d_dormitoryinfo` (`d_building_id`,`d_dormitory_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


-- ----------------------------
-- Table structure for `d_dormhygiene`
-- ----------------------------
DROP TABLE IF EXISTS `d_dormhygiene`;
CREATE TABLE `d_dormhygiene` (
  `d_clean_id` int(10) NOT NULL AUTO_INCREMENT,
  `d_building_id` int(2) NOT NULL,
  `d_dormitory_id` int(3) NOT NULL,
  `d_check_date` date NOT NULL,
  `d_hygiene_level` char(1) NOT NULL,
  PRIMARY KEY (`d_clean_id`),
  FOREIGN KEY (`d_building_id`,`d_dormitory_id`) REFERENCES `d_dormitoryinfo` (`d_building_id`,`d_dormitory_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for `d_visitor`
-- ----------------------------
DROP TABLE IF EXISTS `d_visitor`;
CREATE TABLE `d_visitor` (
  `v_id` int(10) NOT NULL AUTO_INCREMENT,
  `d_building_id` int(2) NOT NULL,
  `d_dormitory_id` int(3) NOT NULL,
  `v_indentity_id` char(18) NOT NULL,
  `v_time` datetime NOT NULL,
  `v_left` char(1) NOT NULL,
  PRIMARY KEY (`v_id`),
	FOREIGN KEY (`d_building_id`,`d_dormitory_id`) REFERENCES `d_dormitoryinfo` (`d_building_id`,`d_dormitory_id`),
	FOREIGN KEY (`v_indentity_id`) REFERENCES `d_visitor_info` (`v_indentity_id`) 
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for `d_student`
-- ----------------------------
DROP TABLE IF EXISTS `d_student`;
CREATE TABLE `d_student` (
  `s_id` int(10) NOT NULL,
  `s_name` varchar(20) NOT NULL,
  `s_sex` varchar(2) NOT NULL,
  `s_age` int(2) NOT NULL,
  `s_phone` char(11) NOT NULL,
  `s_identityid` char(18) NOT NULL,
  `s_home` varchar(10) NOT NULL,
  `c_id` varchar(10) NOT NULL ,
  `d_building_id` int(2) NOT NULL,
  `d_dormitory_id` int(3) NOT NULL,
  `bed_id` int(1) NOT NULL,
  `s_indorm` varchar(6) NOT NULL,
  PRIMARY KEY (`s_id`),
  FOREIGN KEY(`c_id`) REFERENCES `d_class`(`c_id`) ON DELETE CASCADE,
  FOREIGN KEY (`d_building_id`,`d_dormitory_id`) REFERENCES `d_dormitoryinfo` (`d_building_id`,`d_dormitory_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for `d_inout`
-- ----------------------------
DROP TABLE IF EXISTS `d_inout`;
CREATE TABLE `d_inout` (
  `d_inout_id` int(10) NOT NULL AUTO_INCREMENT,
  `s_id` int(10) NOT NULL,
  `d_inorout` char(2) NOT NULL,
  `d_inouttime` datetime NOT NULL,
  PRIMARY KEY (`d_inout_id`),
  FOREIGN KEY(`s_id`) REFERENCES `d_student`(`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
