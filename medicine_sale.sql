/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : medicine_sale

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 08/05/2021 22:36:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for analysis
-- ----------------------------
DROP TABLE IF EXISTS `analysis`;
CREATE TABLE `analysis`  (
  `analysis_id` bigint(0) NOT NULL AUTO_INCREMENT,
  `today` date NOT NULL,
  `order_sum` bigint(0) NOT NULL,
  `order_sum_30` bigint(0) NOT NULL,
  `sales_sum` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sales_sum_30` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `loyal_customer` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`analysis_id`) USING BTREE,
  UNIQUE INDEX `analysis_id_today_unique`(`analysis_id`, `today`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '统计数据' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of analysis
-- ----------------------------
INSERT INTO `analysis` VALUES (2, '2021-05-08', 57, 8, '59945.68', '9309.27', 'Gloriane Massei');

-- ----------------------------
-- Table structure for customers
-- ----------------------------
DROP TABLE IF EXISTS `customers`;
CREATE TABLE `customers`  (
  `cust_id` bigint(0) NOT NULL AUTO_INCREMENT,
  `cust_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `cust_tel` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `cust_password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `cust_cardnum` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cust_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '顾客' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customers
-- ----------------------------
INSERT INTO `customers` VALUES (1, 'Thedric Strettle', '7853657151', 'lSFTznAQ7', '7717 6625 1878 8689');
INSERT INTO `customers` VALUES (2, 'Ulises Meysham', '5143525828', '6TzU2b', '0933 1459 7152 7191');
INSERT INTO `customers` VALUES (3, 'Josy Brader', '9833023021', '3aSxIzs', '9488 6258 2873 0849');
INSERT INTO `customers` VALUES (4, 'Nathanael Coldrick', '3547065067', '59EdMP', '5180 8653 3925 9991');
INSERT INTO `customers` VALUES (5, 'Willy Charrette', '1877770022', 'SmFxH3ilwB', '1528 2355 7743 2354');
INSERT INTO `customers` VALUES (6, 'Gae McWilliam', '8893537510', 'nDUdXNAGx2v', '4590 7620 5690 7996');
INSERT INTO `customers` VALUES (7, 'Gloriane Massei', '1822920021', 'JZRFRhvolJ', '3895 3170 0795 2726');
INSERT INTO `customers` VALUES (8, 'Glori Muffin', '6502887523', 'CiL01Gdd', '7420 5670 1134 6865');
INSERT INTO `customers` VALUES (9, 'Laryssa Welds', '6102921355', 'qkZOwsAgTI', '7900 6626 5840 0242');
INSERT INTO `customers` VALUES (10, 'Enrichetta Buddle', '8811016940', 'mJ7oa61U', '6984 9402 2172 5297');
INSERT INTO `customers` VALUES (11, 'Morrie Simkin', '7027199414', 'OjOO3yd', '0908 5035 0332 1609');
INSERT INTO `customers` VALUES (12, 'Emmalee Ely', '4397894391', 'IkU4THGoxlI', '4361 4873 9932 3159');
INSERT INTO `customers` VALUES (13, 'Poppy McLarnon', '8736780662', 'CPEvHT', '6300 2328 9361 6724');
INSERT INTO `customers` VALUES (14, 'Carrissa Audley', '4738829089', 'IHymq6DR7', '0498 0077 1683 5943');
INSERT INTO `customers` VALUES (15, 'Yoko Crannis', '1607973160', 'nh8t67Hpow', '0181 9821 5067 3620');
INSERT INTO `customers` VALUES (16, 'Ann-marie MacCartney', '3603020861', 'A2lKOSKQ', '4102 4701 1595 3510');
INSERT INTO `customers` VALUES (17, 'Penny Grimbleby', '5762348811', 'wTP2fk2p', '6844 9265 0201 9070');
INSERT INTO `customers` VALUES (18, 'Darnell Rosina', '7883744796', 'CNn9xvWXQXly', '8807 9176 7028 1613');
INSERT INTO `customers` VALUES (19, 'Ruy D\'Ruel', '9419045076', 'mmuqoa', '8130 6934 7447 9504');
INSERT INTO `customers` VALUES (20, 'Emalia Isacoff', '9265586102', '7kStZeB', '1067 6734 0418 7900');
INSERT INTO `customers` VALUES (21, 'Ravid Ridesdale', '9885725744', 'ZtU3ZNmrZpgH', '3212 2115 5833 1908');
INSERT INTO `customers` VALUES (22, 'Aylmer Crotch', '2019074158', 'B4yZshm', '4358 7371 3872 5602');
INSERT INTO `customers` VALUES (23, 'Scarlet Sheardown', '7729143764', 'oLrxVRBEf', '5481 3916 5685 0115');
INSERT INTO `customers` VALUES (24, 'Austina Mantione', '1837989136', 'QJBkge', '7290 4251 4432 7649');
INSERT INTO `customers` VALUES (25, 'Riobard Piegrome', '5572411563', 'fIIuy00oCu', '2527 5597 4499 1318');
INSERT INTO `customers` VALUES (26, 'Jareb Leney', '5668569705', 'xNb4VCmQ9BU', '5249 3007 4834 6006');
INSERT INTO `customers` VALUES (27, 'Ranee Edmand', '7241792249', '8kMmj1LmdVQ', '2081 7073 9244 5203');
INSERT INTO `customers` VALUES (28, 'Celestyn Weld', '6222852683', 'C5vZllwi6MA', '3759 2584 2110 2915');
INSERT INTO `customers` VALUES (29, 'Even McInteer', '2918891060', 'VW30NJt', '3283 8438 0398 5820');
INSERT INTO `customers` VALUES (30, 'Lezlie Garrioch', '7195613970', '2SLdOXwJ', '9817 5818 7202 2020');

-- ----------------------------
-- Table structure for drug
-- ----------------------------
DROP TABLE IF EXISTS `drug`;
CREATE TABLE `drug`  (
  `drug_id` bigint(0) NOT NULL,
  `drug_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sort_id` bigint(0) NOT NULL,
  `drug_stock` int(0) NULL DEFAULT NULL,
  `drug_price` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `production_date` date NULL DEFAULT NULL,
  `expire_date` date NULL DEFAULT NULL,
  `supplier_id` bigint(0) NULL DEFAULT NULL,
  PRIMARY KEY (`drug_id`) USING BTREE,
  INDEX `fk_drug_sort`(`sort_id`) USING BTREE,
  INDEX `fk_drug_supplier`(`supplier_id`) USING BTREE,
  CONSTRAINT `fk_drug_sort` FOREIGN KEY (`sort_id`) REFERENCES `sort` (`sort_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_drug_supplier` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '药品' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of drug
-- ----------------------------
INSERT INTO `drug` VALUES (1, 'Lovastatin', 3, 912, '¥259.28', '2020-07-23', '2022-08-16', 2);
INSERT INTO `drug` VALUES (2, 'RHODOTORULA MUCILAGINOSA', 3, 1092, '¥470.90', '2020-11-09', '2022-05-12', 5);
INSERT INTO `drug` VALUES (3, 'Hydromorphone Hydrochloride', 4, 1876, '¥136.08', '2021-03-31', '2021-06-02', 7);
INSERT INTO `drug` VALUES (4, 'Magnesium Citrate', 5, 1839, '¥285.88', '2020-06-22', '2022-07-03', 3);
INSERT INTO `drug` VALUES (5, 'Captopril', 9, 1100, '¥179.97', '2020-09-19', '2022-03-30', 7);
INSERT INTO `drug` VALUES (6, 'TRAMADOL HYDROCHLORIDE', 10, 1951, '¥132.94', '2021-03-26', '2023-02-24', 7);
INSERT INTO `drug` VALUES (7, 'Lidocaine Hydrochloride', 1, 1047, '¥297.88', '2020-09-12', '2021-07-05', 2);
INSERT INTO `drug` VALUES (8, 'LBEL Couleur Luxe Rouge Amplifier XP amplifying SPF 15', 2, 1417, '¥194.48', '2021-02-12', '2023-02-16', 7);
INSERT INTO `drug` VALUES (9, 'Equate Tussin CF', 1, 632, '¥183.70', '2021-04-21', '2021-12-05', 6);
INSERT INTO `drug` VALUES (10, 'HUMCO Merthiolate', 6, 1291, '¥205.63', '2020-07-06', '2021-10-18', 5);
INSERT INTO `drug` VALUES (11, 'Sulwhasoo Lumitouch', 5, 1088, '¥491.22', '2021-04-20', '2023-02-04', 2);
INSERT INTO `drug` VALUES (12, 'In Control Nicotine', 8, 1858, '¥239.82', '2021-03-23', '2022-04-15', 3);
INSERT INTO `drug` VALUES (13, 'lamotrigine', 4, 1071, '¥338.37', '2020-12-24', '2022-08-21', 5);
INSERT INTO `drug` VALUES (14, 'U-max Beauty', 6, 877, '¥151.40', '2020-07-14', '2021-10-26', 3);
INSERT INTO `drug` VALUES (15, 'Groundsel', 5, 1840, '¥263.24', '2020-08-09', '2022-08-24', 7);
INSERT INTO `drug` VALUES (16, 'Ifosfamide and Mesna', 6, 1830, '¥168.54', '2020-06-30', '2021-07-29', 5);
INSERT INTO `drug` VALUES (17, 'Lotrel', 10, 1514, '¥63.00', '2020-05-03', '2022-09-21', 5);
INSERT INTO `drug` VALUES (18, 'Clonazepam', 5, 1138, '¥373.25', '2021-03-20', '2021-10-20', 1);
INSERT INTO `drug` VALUES (19, 'Vivelle Dot', 3, 321, '¥229.06', '2020-12-04', '2023-02-18', 1);
INSERT INTO `drug` VALUES (20, 'Conney Exra Strength Aspirin Free', 3, 1048, '¥61.93', '2020-07-10', '2021-06-22', 2);

-- ----------------------------
-- Table structure for operators
-- ----------------------------
DROP TABLE IF EXISTS `operators`;
CREATE TABLE `operators`  (
  `opr_id` bigint(0) NOT NULL AUTO_INCREMENT,
  `opr_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `opr_tel` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `opr_sex` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `opr_pay` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `opr_password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `opr_hiredate` date NULL DEFAULT NULL,
  PRIMARY KEY (`opr_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '操作员' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of operators
-- ----------------------------
INSERT INTO `operators` VALUES (1, 'Tobin Farquharson', '3652891934', 'Male', '¥9592.12', 'DMcv3v8AxaKE', '2014-09-02');
INSERT INTO `operators` VALUES (2, 'Willy Ranscome', '6138437612', 'Agender', '¥9840.38', 'ILSwd5Pim', '2013-07-25');
INSERT INTO `operators` VALUES (3, 'Jo Bewick', '9921745544', 'Non-binary', '¥12706.09', '30BfuknBJIKT', '2008-05-25');
INSERT INTO `operators` VALUES (4, 'Anne-corinne Duly', '3107128439', 'Genderqueer', '¥9068.77', 'pdo9CVBHO29', '2017-10-03');
INSERT INTO `operators` VALUES (5, 'Zahara Lideard', '6265203266', 'Genderqueer', '¥8525.92', 'ArvDrsOV', '2006-07-02');
INSERT INTO `operators` VALUES (6, 'Kriste Wathall', '7175269331', 'Female', '¥10075.28', 'IT21om77r', '2010-12-19');
INSERT INTO `operators` VALUES (7, 'Dianne Croall', '4286822525', 'Genderfluid', '¥13101.07', 'VXmADcJ9dR6A', '2013-04-07');
INSERT INTO `operators` VALUES (8, 'Althea Somerton', '6115205458', 'Genderqueer', '¥11366.35', 'XTM8R52', '2018-07-16');
INSERT INTO `operators` VALUES (9, 'Leon Gaynor', '3741249341', 'Male', '¥9971.50', 'O7V9IBo3EIP', '2012-04-07');
INSERT INTO `operators` VALUES (10, 'Madella Taffrey', '1909232675', 'Polygender', '¥12934.22', '1kwdbq1', '2016-09-02');

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail`  (
  `detail_id` bigint(0) NOT NULL AUTO_INCREMENT,
  `order_id` bigint(0) NOT NULL,
  `drug_id` bigint(0) NOT NULL,
  `drug_num` int(0) NULL DEFAULT NULL,
  `drug_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`detail_id`) USING BTREE,
  INDEX `fk_order_detail_drug`(`drug_id`) USING BTREE,
  INDEX `fk_order_detail_orders`(`order_id`) USING BTREE,
  CONSTRAINT `fk_order_detail_drug` FOREIGN KEY (`drug_id`) REFERENCES `drug` (`drug_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_order_detail_orders` FOREIGN KEY (`order_id`) REFERENCES `sales_order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 86 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '订单细节' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES (1, 1, 5, 1, 'Captopril');
INSERT INTO `order_detail` VALUES (2, 2, 1, 3, 'Lovastatin');
INSERT INTO `order_detail` VALUES (3, 3, 20, 4, 'Conney Exra Strength Aspirin Free');
INSERT INTO `order_detail` VALUES (4, 4, 17, 4, 'Lotrel');
INSERT INTO `order_detail` VALUES (5, 5, 5, 2, 'Captopril');
INSERT INTO `order_detail` VALUES (6, 6, 3, 2, 'Hydromorphone Hydrochloride');
INSERT INTO `order_detail` VALUES (7, 7, 1, 5, 'Lovastatin');
INSERT INTO `order_detail` VALUES (8, 8, 19, 3, 'Vivelle Dot');
INSERT INTO `order_detail` VALUES (9, 9, 5, 4, 'Captopril');
INSERT INTO `order_detail` VALUES (10, 10, 9, 3, 'Equate Tussin CF');
INSERT INTO `order_detail` VALUES (11, 11, 4, 5, 'Magnesium Citrate');
INSERT INTO `order_detail` VALUES (12, 12, 7, 3, 'Lidocaine Hydrochloride');
INSERT INTO `order_detail` VALUES (13, 13, 3, 3, 'Hydromorphone Hydrochloride');
INSERT INTO `order_detail` VALUES (14, 14, 6, 4, 'TRAMADOL HYDROCHLORIDE');
INSERT INTO `order_detail` VALUES (15, 15, 12, 3, 'In Control Nicotine');
INSERT INTO `order_detail` VALUES (16, 16, 5, 5, 'Captopril');
INSERT INTO `order_detail` VALUES (17, 17, 6, 3, 'TRAMADOL HYDROCHLORIDE');
INSERT INTO `order_detail` VALUES (18, 18, 15, 5, 'Groundsel');
INSERT INTO `order_detail` VALUES (19, 19, 1, 3, 'Lovastatin');
INSERT INTO `order_detail` VALUES (20, 20, 14, 4, 'U-max Beauty');
INSERT INTO `order_detail` VALUES (21, 21, 20, 2, 'Conney Exra Strength Aspirin Free');
INSERT INTO `order_detail` VALUES (22, 22, 12, 3, 'In Control Nicotine');
INSERT INTO `order_detail` VALUES (23, 23, 17, 2, 'Lotrel');
INSERT INTO `order_detail` VALUES (24, 24, 13, 3, 'lamotrigine');
INSERT INTO `order_detail` VALUES (25, 25, 12, 1, 'In Control Nicotine');
INSERT INTO `order_detail` VALUES (26, 26, 17, 5, 'Lotrel');
INSERT INTO `order_detail` VALUES (27, 27, 13, 3, 'lamotrigine');
INSERT INTO `order_detail` VALUES (28, 28, 11, 3, 'Sulwhasoo Lumitouch');
INSERT INTO `order_detail` VALUES (29, 29, 7, 4, 'Lidocaine Hydrochloride');
INSERT INTO `order_detail` VALUES (30, 30, 8, 1, 'LBEL Couleur Luxe Rouge Amplifier XP amplifying SPF 15');
INSERT INTO `order_detail` VALUES (31, 31, 16, 3, 'Ifosfamide and Mesna');
INSERT INTO `order_detail` VALUES (32, 32, 20, 3, 'Conney Exra Strength Aspirin Free');
INSERT INTO `order_detail` VALUES (33, 33, 9, 4, 'Equate Tussin CF');
INSERT INTO `order_detail` VALUES (34, 34, 12, 3, 'In Control Nicotine');
INSERT INTO `order_detail` VALUES (35, 35, 3, 3, 'Hydromorphone Hydrochloride');
INSERT INTO `order_detail` VALUES (36, 36, 15, 2, 'Groundsel');
INSERT INTO `order_detail` VALUES (37, 37, 16, 1, 'Ifosfamide and Mesna');
INSERT INTO `order_detail` VALUES (38, 38, 5, 4, 'Captopril');
INSERT INTO `order_detail` VALUES (39, 39, 9, 2, 'Equate Tussin CF');
INSERT INTO `order_detail` VALUES (40, 40, 10, 1, 'HUMCO Merthiolate');
INSERT INTO `order_detail` VALUES (41, 41, 14, 5, 'U-max Beauty');
INSERT INTO `order_detail` VALUES (42, 42, 9, 2, 'Equate Tussin CF');
INSERT INTO `order_detail` VALUES (43, 43, 20, 3, 'Conney Exra Strength Aspirin Free');
INSERT INTO `order_detail` VALUES (44, 44, 18, 5, 'Clonazepam');
INSERT INTO `order_detail` VALUES (45, 45, 15, 1, 'Groundsel');
INSERT INTO `order_detail` VALUES (46, 46, 4, 5, 'Magnesium Citrate');
INSERT INTO `order_detail` VALUES (47, 47, 16, 1, 'Ifosfamide and Mesna');
INSERT INTO `order_detail` VALUES (48, 48, 15, 2, 'Groundsel');
INSERT INTO `order_detail` VALUES (49, 49, 7, 1, 'Lidocaine Hydrochloride');
INSERT INTO `order_detail` VALUES (50, 50, 7, 4, 'Lidocaine Hydrochloride');
INSERT INTO `order_detail` VALUES (51, 40, 14, 4, 'U-max Beauty');
INSERT INTO `order_detail` VALUES (52, 31, 13, 1, 'lamotrigine');
INSERT INTO `order_detail` VALUES (53, 15, 11, 4, 'Sulwhasoo Lumitouch');
INSERT INTO `order_detail` VALUES (54, 4, 8, 5, 'LBEL Couleur Luxe Rouge Amplifier XP amplifying SPF 15');
INSERT INTO `order_detail` VALUES (55, 28, 19, 5, 'Vivelle Dot');
INSERT INTO `order_detail` VALUES (56, 24, 1, 5, 'Lovastatin');
INSERT INTO `order_detail` VALUES (57, 15, 15, 5, 'Groundsel');
INSERT INTO `order_detail` VALUES (58, 17, 3, 2, 'Hydromorphone Hydrochloride');
INSERT INTO `order_detail` VALUES (59, 23, 11, 5, 'Sulwhasoo Lumitouch');
INSERT INTO `order_detail` VALUES (60, 28, 16, 5, 'Ifosfamide and Mesna');
INSERT INTO `order_detail` VALUES (61, 2, 17, 2, 'Lotrel');
INSERT INTO `order_detail` VALUES (62, 24, 2, 1, 'RHODOTORULA MUCILAGINOSA');
INSERT INTO `order_detail` VALUES (63, 39, 3, 2, 'Hydromorphone Hydrochloride');
INSERT INTO `order_detail` VALUES (64, 49, 13, 2, 'lamotrigine');
INSERT INTO `order_detail` VALUES (65, 27, 20, 3, 'Conney Exra Strength Aspirin Free');
INSERT INTO `order_detail` VALUES (66, 10, 1, 5, 'Lovastatin');
INSERT INTO `order_detail` VALUES (67, 31, 1, 2, 'Lovastatin');
INSERT INTO `order_detail` VALUES (68, 11, 7, 3, 'Lidocaine Hydrochloride');
INSERT INTO `order_detail` VALUES (69, 30, 14, 4, 'U-max Beauty');
INSERT INTO `order_detail` VALUES (70, 32, 11, 1, 'Sulwhasoo Lumitouch');
INSERT INTO `order_detail` VALUES (71, 38, 11, 2, 'Sulwhasoo Lumitouch');
INSERT INTO `order_detail` VALUES (72, 12, 7, 4, 'Lidocaine Hydrochloride');
INSERT INTO `order_detail` VALUES (73, 44, 15, 2, 'Groundsel');
INSERT INTO `order_detail` VALUES (74, 25, 18, 2, 'Clonazepam');
INSERT INTO `order_detail` VALUES (75, 11, 8, 2, 'LBEL Couleur Luxe Rouge Amplifier XP amplifying SPF 15');
INSERT INTO `order_detail` VALUES (76, 47, 4, 1, 'Magnesium Citrate');
INSERT INTO `order_detail` VALUES (77, 22, 9, 4, 'Equate Tussin CF');
INSERT INTO `order_detail` VALUES (78, 46, 3, 1, 'Hydromorphone Hydrochloride');
INSERT INTO `order_detail` VALUES (79, 8, 4, 5, 'Magnesium Citrate');
INSERT INTO `order_detail` VALUES (80, 27, 5, 4, 'Captopril');
INSERT INTO `order_detail` VALUES (81, 51, 7, 1, 'Lidocaine Hydrochloride');
INSERT INTO `order_detail` VALUES (82, 52, 4, 1, 'Magnesium Citrate');
INSERT INTO `order_detail` VALUES (83, 53, 1, 2, 'Lovastatin');
INSERT INTO `order_detail` VALUES (84, 54, 2, 2, 'RHODOTORULA MUCILAGINOSA');
INSERT INTO `order_detail` VALUES (85, 54, 3, 1, 'Hydromorphone Hydrochloride');
INSERT INTO `order_detail` VALUES (86, 55, 12, 1, 'In Control Nicotine');
INSERT INTO `order_detail` VALUES (87, 55, 13, 2, 'lamotrigine');
INSERT INTO `order_detail` VALUES (88, 56, 2, 1, 'RHODOTORULA MUCILAGINOSA');
INSERT INTO `order_detail` VALUES (89, 56, 3, 2, 'Hydromorphone Hydrochloride');
INSERT INTO `order_detail` VALUES (90, 57, 11, 1, 'Sulwhasoo Lumitouch');
INSERT INTO `order_detail` VALUES (91, 57, 12, 1, 'In Control Nicotine');
INSERT INTO `order_detail` VALUES (92, 57, 14, 1, 'U-max Beauty');

-- ----------------------------
-- Table structure for ordertotals
-- ----------------------------
DROP TABLE IF EXISTS `ordertotals`;
CREATE TABLE `ordertotals`  (
  `orderId` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `total` decimal(8, 2) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ordertotals
-- ----------------------------
INSERT INTO `ordertotals` VALUES ('7', 1296.40);
INSERT INTO `ordertotals` VALUES ('16', 899.85);
INSERT INTO `ordertotals` VALUES ('19', 777.84);
INSERT INTO `ordertotals` VALUES ('55', 916.56);
INSERT INTO `ordertotals` VALUES ('56', 743.06);
INSERT INTO `ordertotals` VALUES ('57', 882.44);

-- ----------------------------
-- Table structure for purchase_order
-- ----------------------------
DROP TABLE IF EXISTS `purchase_order`;
CREATE TABLE `purchase_order`  (
  `purchase_id` bigint(0) NOT NULL,
  `drug_id` bigint(0) NOT NULL,
  `drug_num` int(0) NOT NULL,
  `purchase_price` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `opr_id` bigint(0) NOT NULL,
  `supplier_id` bigint(0) NOT NULL,
  PRIMARY KEY (`purchase_id`) USING BTREE,
  INDEX `fk_purchase_order_supplier`(`supplier_id`) USING BTREE,
  INDEX `fk_purchase_order_operators`(`opr_id`) USING BTREE,
  INDEX `fk_purchase_order_drug`(`drug_id`) USING BTREE,
  CONSTRAINT `fk_purchase_order_drug` FOREIGN KEY (`drug_id`) REFERENCES `drug` (`drug_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_purchase_order_operators` FOREIGN KEY (`opr_id`) REFERENCES `operators` (`opr_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_purchase_order_supplier` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '进货订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of purchase_order
-- ----------------------------
INSERT INTO `purchase_order` VALUES (1, 8, 1950, '¥155.58', 5, 7);
INSERT INTO `purchase_order` VALUES (2, 11, 1375, '¥392.98', 9, 4);
INSERT INTO `purchase_order` VALUES (3, 5, 1311, '¥143.98', 1, 7);
INSERT INTO `purchase_order` VALUES (4, 19, 1267, '¥183.25', 6, 5);
INSERT INTO `purchase_order` VALUES (5, 13, 655, '¥270.70', 8, 3);
INSERT INTO `purchase_order` VALUES (6, 12, 1683, '¥191.86', 3, 7);
INSERT INTO `purchase_order` VALUES (7, 6, 1904, '¥106.35', 5, 2);
INSERT INTO `purchase_order` VALUES (8, 20, 635, '¥49.54', 5, 6);
INSERT INTO `purchase_order` VALUES (9, 7, 1307, '¥238.30', 8, 3);
INSERT INTO `purchase_order` VALUES (10, 11, 1759, '¥392.98', 2, 3);
INSERT INTO `purchase_order` VALUES (11, 18, 1480, '¥298.60', 5, 5);
INSERT INTO `purchase_order` VALUES (12, 13, 1938, '¥270.70', 2, 3);
INSERT INTO `purchase_order` VALUES (13, 12, 625, '¥191.86', 6, 3);
INSERT INTO `purchase_order` VALUES (14, 10, 1321, '¥164.50', 6, 1);
INSERT INTO `purchase_order` VALUES (15, 9, 1270, '¥146.96', 7, 6);
INSERT INTO `purchase_order` VALUES (16, 14, 1065, '¥121.12', 9, 3);
INSERT INTO `purchase_order` VALUES (17, 8, 1990, '¥155.58', 8, 4);
INSERT INTO `purchase_order` VALUES (18, 9, 655, '¥146.96', 7, 7);
INSERT INTO `purchase_order` VALUES (19, 17, 605, '¥50.40', 4, 1);
INSERT INTO `purchase_order` VALUES (20, 20, 1989, '¥49.54', 7, 7);
INSERT INTO `purchase_order` VALUES (21, 5, 1509, '¥143.98', 5, 1);
INSERT INTO `purchase_order` VALUES (22, 9, 1322, '¥146.96', 4, 4);
INSERT INTO `purchase_order` VALUES (23, 7, 800, '¥238.30', 1, 5);
INSERT INTO `purchase_order` VALUES (24, 10, 1850, '¥164.50', 1, 5);
INSERT INTO `purchase_order` VALUES (25, 18, 1258, '¥298.60', 5, 4);
INSERT INTO `purchase_order` VALUES (26, 13, 1019, '¥270.70', 7, 6);
INSERT INTO `purchase_order` VALUES (27, 20, 654, '¥49.54', 6, 3);
INSERT INTO `purchase_order` VALUES (28, 6, 1124, '¥106.35', 9, 3);
INSERT INTO `purchase_order` VALUES (29, 13, 1987, '¥270.70', 6, 3);
INSERT INTO `purchase_order` VALUES (30, 8, 1567, '¥155.58', 6, 7);
INSERT INTO `purchase_order` VALUES (31, 20, 610, '¥49.54', 3, 7);
INSERT INTO `purchase_order` VALUES (32, 16, 1771, '¥134.83', 5, 4);
INSERT INTO `purchase_order` VALUES (33, 9, 1204, '¥146.96', 5, 4);
INSERT INTO `purchase_order` VALUES (34, 8, 1047, '¥155.58', 4, 6);
INSERT INTO `purchase_order` VALUES (35, 11, 1753, '¥392.98', 2, 5);

-- ----------------------------
-- Table structure for sales_order
-- ----------------------------
DROP TABLE IF EXISTS `sales_order`;
CREATE TABLE `sales_order`  (
  `order_id` bigint(0) NOT NULL AUTO_INCREMENT,
  `cust_id` bigint(0) NOT NULL,
  `opr_id` bigint(0) NOT NULL,
  `opt_time` datetime(0) NULL DEFAULT NULL,
  `state` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE,
  INDEX `fk_sales_order_customers`(`cust_id`) USING BTREE,
  INDEX `fk_sales_order_operators`(`opr_id`) USING BTREE,
  CONSTRAINT `fk_sales_order_customers` FOREIGN KEY (`cust_id`) REFERENCES `customers` (`cust_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_sales_order_operators` FOREIGN KEY (`opr_id`) REFERENCES `operators` (`opr_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '销售订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sales_order
-- ----------------------------
INSERT INTO `sales_order` VALUES (1, 2, 10, NULL, '0');
INSERT INTO `sales_order` VALUES (2, 20, 4, '2020-06-09 20:39:13', '1');
INSERT INTO `sales_order` VALUES (3, 24, 10, '2020-05-06 11:10:12', '1');
INSERT INTO `sales_order` VALUES (4, 11, 10, '2021-04-19 07:38:57', '1');
INSERT INTO `sales_order` VALUES (5, 23, 9, NULL, '0');
INSERT INTO `sales_order` VALUES (6, 5, 2, '2021-01-10 02:50:02', '1');
INSERT INTO `sales_order` VALUES (7, 7, 8, '2020-05-10 22:47:57', '1');
INSERT INTO `sales_order` VALUES (8, 26, 2, NULL, '0');
INSERT INTO `sales_order` VALUES (9, 4, 3, '2020-11-15 04:59:17', '1');
INSERT INTO `sales_order` VALUES (10, 21, 8, '2020-05-20 21:27:43', '1');
INSERT INTO `sales_order` VALUES (11, 25, 8, NULL, '0');
INSERT INTO `sales_order` VALUES (12, 15, 1, '2021-05-05 17:11:13', '1');
INSERT INTO `sales_order` VALUES (13, 18, 10, NULL, '0');
INSERT INTO `sales_order` VALUES (14, 3, 5, '2020-09-26 02:09:07', '1');
INSERT INTO `sales_order` VALUES (15, 4, 2, NULL, '0');
INSERT INTO `sales_order` VALUES (16, 7, 9, '2020-09-03 02:54:50', '1');
INSERT INTO `sales_order` VALUES (17, 15, 10, NULL, '0');
INSERT INTO `sales_order` VALUES (18, 11, 9, '2021-04-18 19:06:10', '1');
INSERT INTO `sales_order` VALUES (19, 7, 6, NULL, '0');
INSERT INTO `sales_order` VALUES (20, 1, 5, NULL, '0');
INSERT INTO `sales_order` VALUES (21, 12, 6, '2020-10-12 11:27:50', '1');
INSERT INTO `sales_order` VALUES (22, 11, 3, '2020-05-10 04:27:09', '1');
INSERT INTO `sales_order` VALUES (23, 10, 7, '2021-03-24 12:01:08', '1');
INSERT INTO `sales_order` VALUES (24, 14, 3, '2020-08-09 12:15:59', '1');
INSERT INTO `sales_order` VALUES (25, 30, 1, '2020-06-28 03:52:42', '1');
INSERT INTO `sales_order` VALUES (26, 14, 10, '2021-02-12 04:02:38', '1');
INSERT INTO `sales_order` VALUES (27, 17, 9, '2020-10-09 03:28:55', '1');
INSERT INTO `sales_order` VALUES (28, 20, 7, '2021-01-02 10:16:06', '1');
INSERT INTO `sales_order` VALUES (29, 5, 10, '2020-05-13 09:44:24', '1');
INSERT INTO `sales_order` VALUES (30, 9, 6, NULL, '0');
INSERT INTO `sales_order` VALUES (31, 23, 2, NULL, '0');
INSERT INTO `sales_order` VALUES (32, 17, 4, '2020-09-24 12:49:58', '1');
INSERT INTO `sales_order` VALUES (33, 3, 4, '2020-10-01 03:36:16', '1');
INSERT INTO `sales_order` VALUES (34, 11, 9, NULL, '0');
INSERT INTO `sales_order` VALUES (35, 4, 1, '2020-11-17 21:16:51', '1');
INSERT INTO `sales_order` VALUES (36, 22, 7, '2021-02-02 08:16:24', '1');
INSERT INTO `sales_order` VALUES (37, 26, 5, NULL, '0');
INSERT INTO `sales_order` VALUES (38, 24, 6, '2020-11-29 11:53:01', '1');
INSERT INTO `sales_order` VALUES (39, 9, 9, '2020-12-20 06:50:51', '1');
INSERT INTO `sales_order` VALUES (40, 15, 8, NULL, '0');
INSERT INTO `sales_order` VALUES (41, 11, 5, NULL, '0');
INSERT INTO `sales_order` VALUES (42, 10, 2, '2021-04-25 02:47:02', '1');
INSERT INTO `sales_order` VALUES (43, 23, 4, NULL, '0');
INSERT INTO `sales_order` VALUES (44, 13, 1, '2021-05-07 21:20:06', '1');
INSERT INTO `sales_order` VALUES (45, 4, 4, NULL, '0');
INSERT INTO `sales_order` VALUES (46, 9, 6, '2020-04-30 09:55:25', '1');
INSERT INTO `sales_order` VALUES (47, 22, 10, '2021-01-19 09:47:53', '1');
INSERT INTO `sales_order` VALUES (48, 24, 1, NULL, '0');
INSERT INTO `sales_order` VALUES (49, 23, 6, '2020-09-05 08:16:22', '1');
INSERT INTO `sales_order` VALUES (50, 24, 2, NULL, '0');
INSERT INTO `sales_order` VALUES (51, 1, 1, '2021-05-07 17:39:50', '1');
INSERT INTO `sales_order` VALUES (52, 1, 2, NULL, '0');
INSERT INTO `sales_order` VALUES (53, 1, 2, NULL, '0');
INSERT INTO `sales_order` VALUES (54, 1, 2, NULL, '0');
INSERT INTO `sales_order` VALUES (55, 7, 10, NULL, '0');
INSERT INTO `sales_order` VALUES (56, 7, 7, '2021-05-08 22:06:19', '1');
INSERT INTO `sales_order` VALUES (57, 7, 8, '2021-05-08 22:18:50', '1');

-- ----------------------------
-- Table structure for sort
-- ----------------------------
DROP TABLE IF EXISTS `sort`;
CREATE TABLE `sort`  (
  `sort_id` bigint(0) NOT NULL,
  `sort_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`sort_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '药品类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sort
-- ----------------------------
INSERT INTO `sort` VALUES (1, '抗生素类');
INSERT INTO `sort` VALUES (2, '心脑血管用药');
INSERT INTO `sort` VALUES (3, '消化系统用药');
INSERT INTO `sort` VALUES (4, '呼吸系统用药');
INSERT INTO `sort` VALUES (5, '泌尿系统用药');
INSERT INTO `sort` VALUES (6, '血液系统用药');
INSERT INTO `sort` VALUES (7, '注射剂类');
INSERT INTO `sort` VALUES (8, '激素类');
INSERT INTO `sort` VALUES (9, '滋补类');
INSERT INTO `sort` VALUES (10, '清热解毒药品');

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier`  (
  `supplier_id` bigint(0) NOT NULL,
  `supplier_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`supplier_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '厂商' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES (1, 'Alcon Laboratories, Inc.');
INSERT INTO `supplier` VALUES (2, 'Tec Laboratories, Inc.');
INSERT INTO `supplier` VALUES (3, 'Dollar General');
INSERT INTO `supplier` VALUES (4, 'HyVee Inc');
INSERT INTO `supplier` VALUES (5, 'Save-A-Lot Food Stores Ltd');
INSERT INTO `supplier` VALUES (6, 'Safeway');
INSERT INTO `supplier` VALUES (7, 'Johnson & Johnson Healthcare Products, Division of McNEIL-PPC, Inc.');

-- ----------------------------
-- Procedure structure for ordertotal
-- ----------------------------
DROP PROCEDURE IF EXISTS `ordertotal`;
delimiter ;;
CREATE PROCEDURE `ordertotal`(IN orderId LONG,
   OUT ototal DECIMAL(8,2))
  COMMENT 'Obtain order total'
BEGIN
   -- Declare variable for total
   DECLARE total DECIMAL(8,2);

   -- Get the order total
   SELECT Sum(order_detail.drug_num*substring(drug_price,2))
   FROM order_detail
   left join drug d on d.drug_id = order_detail.drug_id
   left join sales_order so on so.order_id = order_detail.order_id
   WHERE so.order_id = orderId
   INTO total;

   SELECT total INTO ototal;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for processorders
-- ----------------------------
DROP PROCEDURE IF EXISTS `processorders`;
delimiter ;;
CREATE PROCEDURE `processorders`(IN custId LONG)
BEGIN
    -- Declare local variables
    DECLARE done BOOLEAN DEFAULT 0;
    DECLARE o INT;
    DECLARE t DECIMAL(8,2);
    -- Declare the cursor
    DECLARE ordernumbers CURSOR
    FOR
    SELECT order_id FROM sales_order where cust_id=custId;
    -- Declare continue handler,SQLSTATE '02000' 是一个“未找到”条件
    DECLARE CONTINUE HANDLER FOR SQLSTATE '02000' SET done=1;
    -- Create a table to store the results
    CREATE TABLE IF NOT EXISTS ordertotals
    (orderId Long, total DECIMAL(8,2));
    delete from ordertotals;
    -- Open the cursor
    OPEN ordernumbers;
    -- Loop through all rows
    REPEAT
        -- Get order number
        FETCH ordernumbers INTO o;
        -- Get the total for this order
        CALL ordertotal(o, t);
        -- Insert order and total into ordertotals
        if o not in (select orderId from ordertotals) then
            INSERT INTO ordertotals(orderId, total)
            VALUES(o, t);
        end if;
        -- End of loop
    UNTIL done END REPEAT;
    -- Close the cursor
    CLOSE ordernumbers;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for random_detail_generate
-- ----------------------------
DROP PROCEDURE IF EXISTS `random_detail_generate`;
delimiter ;;
CREATE PROCEDURE `random_detail_generate`()
BEGIN
DECLARE num INT;
SET num = 1;
set @id = 1;
set @name = "";
WHILE num < 31 DO
	select drug_id,drug_name into @id,@name from drug ORDER BY RAND() LIMIT 1;
	insert into `order_detail` (detail_id, order_id, drug_id, drug_num, drug_name) values (0,floor(1+rand()*(50-1+1)),@id, floor(1+rand()*(5-1+1)),@name);
SET num = num + 1;
END WHILE;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for test
-- ----------------------------
DROP PROCEDURE IF EXISTS `test`;
delimiter ;;
CREATE PROCEDURE `test`()
BEGIN
DECLARE num INT;
SET num = 1;
set @id = 1;
set @name = "";
WHILE num < 51 DO
	select drug_id,drug_name into @id,@name from drug ORDER BY RAND() LIMIT 1;
	insert into `order_detail` (detail_id, order_id, drug_id, drug_num, drug_name) values (num, num,@id, floor(1+rand()*(5-1+1)),@name);
SET num = num + 1;
END WHILE;
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table order_detail
-- ----------------------------
DROP TRIGGER IF EXISTS `neworder`;
delimiter ;;
CREATE TRIGGER `neworder` AFTER INSERT ON `order_detail` FOR EACH ROW update drug set drug_stock=drug_stock-NEW.drug_num
        where drug.drug_id=NEW.drug_id
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
