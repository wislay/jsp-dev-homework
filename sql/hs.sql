-- MySQL dump 10.13  Distrib 5.5.21, for Win32 (x86)
--
-- Host: localhost    Database: hs
-- ------------------------------------------------------
-- Server version	5.5.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `uname` varchar(255) DEFAULT NULL,
  `passwd` varchar(255) DEFAULT NULL,
  `utype` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('09211001','kenan','passwd',1),('09211002','huiyuanai','1234',1),('09211003','buerzhouzhu','passwd',1),('09211004','shenle','passwd',1),('09211005','chongtianzongsi','passwd',1),('09211006','bashenjiaer','passwd',1),('09211007','xiaozhi','passwd',1),('09211008','cangqicheng','passwd',1),('09211009','xiliansichuncai','passwd',1),('09211010','jierbate','passwd',1),('09211011','zhongyezi','passwd',1),('09211012','tufangsuisan','passwd',1),('09211013','wugengliuli','passwd',1),('09211014','anchengmingzi','passwd',1),('09211015','yubanmeiqin','passwd',1),('09211016','zejinaili','passwd',1),('09211017','bomoquaner','passwd',1),('09211018','mulaihonglixi','passwd',1),('09211019','qingpuchana','passwd',1),('09211020','gongzeyoujining','passwd',1),('09211021','lanranzongyoujie','passwd',1),('09211022','chiyemengxiang','passwd',1),('09211023','zetiangangji','passwd',1),('09211024','bofengshuimen','passwd',1),('09211025','xingli','passwd',1),('09211026','qianlangqiancao','passwd',1),('09211027','bentangyinghai','passwd',1),('09211028','chongyeyangzi','passwd',1),('09211029','chimugangxian','passwd',1),('09211030','zaolaihaoyi','passwd',1),('09211031','jiechengyeming','passwd',1),('09211032','yingxiaochana','passwd',1),('09211033','babanshennaizi','passwd',1),('09211034','macanghua','passwd',1),('09211035','lingnaixuemi','passwd',1),('09211036','keluokedaer','passwd',1),('09211037','xumei','passwd',1),('09211038','shenbanchunji','passwd',1),('09211039','qingshuishenyou','passwd',1),('09211040','likelisi','passwd',1),('09211041','gangqipengye','passwd',1),('09211042','guhezhu','passwd',1),('09211043','zhenyouli','passwd',1),('09211044','huazexiangcai','passwd',1),('09211045','pingyeling','passwd',1),('09211046','chuanchenglingzi','passwd',1),('09211047','yingmuhuadao','passwd',1),('09211048','lufei','passwd',1),('09211049','weigongqiesi','passwd',1),('09211050','yuanbanlin','passwd',1),('201301','li','passwd',2),('201302','wang','passwd',2),('201303','zhang','passwd',2),('201304','yuan','passwd',2),('201305','hao','passwd',2),('201306','yu','passwd',2),('201307','wu','passwd',2),('201308','xie','passwd',2),('201309','niao','passwd',2),('201310','zhou','passwd',2),('201311','huang','passwd',2),('201312','sun','passwd',2),('201313','chen','passwd',2),('201314','xiong','passwd',2),('201315','zeng','passwd',2),('201316','tan','passwd',2),('201317','fan','passwd',2),('201318','zhao','passwd',2),('201319','qian','passwd',2),('201320','zheng','passwd',2),('admin','admin','admin',3);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `courseId` varchar(255) NOT NULL,
  `courseName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`courseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('C1','计算机网络\r'),('C10','组成原理\r'),('C2','操作系统\r'),('C3','网络工程\r'),('C4','数据结构\r'),('C5','高等数学\r'),('C6','交换原理\r'),('C7','数据库\r'),('C8','概率论\r'),('C9','离散数学\r');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curriculum`
--

DROP TABLE IF EXISTS `curriculum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `curriculum` (
  `listNo` varchar(255) NOT NULL,
  `termNo` varchar(255) DEFAULT NULL,
  `teacherNo` varchar(255) DEFAULT NULL,
  `classNo` varchar(255) DEFAULT NULL,
  `classroom` varchar(255) DEFAULT NULL,
  `courseNo` varchar(255) DEFAULT NULL,
  `startWeek` varchar(255) DEFAULT NULL,
  `endWeek` varchar(255) DEFAULT NULL,
  `startClass` varchar(255) DEFAULT NULL,
  `endClass` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`listNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curriculum`
--

LOCK TABLES `curriculum` WRITE;
/*!40000 ALTER TABLE `curriculum` DISABLE KEYS */;
INSERT INTO `curriculum` VALUES ('00002','S1','201302','1315','337','C2','1','20','7','8\r'),('00003','S1','201303','1314','237','C3','1','20','5','6\r'),('00004','S1','201304','1314','339','C4','1','20','1','2\r'),('00005','S1','201305','1313','519','C5','1','20','3','4\r'),('00006','S1','201306','1313','539','C6','1','20','7','8\r'),('00007','S1','201307','1312','207','C7','1','20','5','6\r'),('00008','S1','201308','1312','135','C8','2','20','1','2'),('00009','S1','201309','1311','319','C9','1','20','5','6\r'),('00010','S1','201310','1311','224','C10','1','20','7','8\r'),('﻿00001','S1','201301','1315','437','C1','1','20','3','4\r');
/*!40000 ALTER TABLE `curriculum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `studentNo` varchar(255) NOT NULL,
  `studentName` varchar(255) NOT NULL,
  `studentGender` int(11) NOT NULL,
  `studentHometown` varchar(255) NOT NULL,
  `studentBirthday` varchar(255) NOT NULL,
  `studentNoInClass` varchar(255) DEFAULT NULL,
  `studentEmail` varchar(255) DEFAULT NULL,
  `studentMobile` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`studentNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('09211001','柯南',1,'河北','19901025','1315','10001@ujc.edu.com','15210830001\n'),('09211002','灰原哀',2,'东京','19890205','1315','greysad@ujc.edu.com','15210837002'),('09211003','不二周助',1,'北京','19910506','1315','10003@ujc.edu.com','15210830003\r'),('09211004','神乐',2,'上海','19900621','1315','10004@ujc.edu.com','15210830004\r'),('09211005','冲田总司',1,'河南','19881212','1315','10005@ujc.edu.com','15210830005\r'),('09211006','八神嘉儿',2,'广东','19901007','1315','10006@ujc.edu.com','15210830006\r'),('09211007','小智',1,'新疆','19920101','1315','10007@ujc.edu.com','15210830007\r'),('09211008','苍崎橙',2,'河北','19891008','1315','10008@ujc.edu.com','15210830008\r'),('09211009','西连寺春菜',2,'天津','19930109','1315','10009@ujc.edu.com','15210830009\r'),('09211010','基尔巴特',2,'北京','19890529','1314','10010@ujc.edu.com','15210830010'),('09211011','中野梓',2,'上海','19901114','1314','10011@ujc.edu.com','15210830011\r'),('09211012','土方岁三',1,'河南','19910204','1314','10012@ujc.edu.com','15210830012\r'),('09211013','五更琉璃',2,'广东','19891231','1314','10013@ujc.edu.com','15210830013\r'),('09211014','安城鸣子',2,'新疆','19901022','1314','10014@ujc.edu.com','15210830014\r'),('09211015','御坂美琴',2,'河北','19910527','1314','10015@ujc.edu.com','15210830015\r'),('09211016','泽近爱理',2,'天津','19901106','1314','10016@ujc.edu.com','15210830016\r'),('09211017','播磨拳儿',1,'北京','19880706','1314','10017@ujc.edu.com','15210830017\r'),('09211018','牧濑红莉栖',2,'上海','19920630','1314','10018@ujc.edu.com','15210830018\r'),('09211019','清浦刹那',2,'河南','19900704','1314','10019@ujc.edu.com','15210830019\r'),('09211020','宫泽有纪宁',2,'广东','19900517','1313','10020@ujc.edu.com','15210830020\r'),('09211021','蓝染惣右介',1,'新疆','19910115','1313','10021@ujc.edu.com','15210830021\r'),('09211022','赤夜萌香',2,'河北','19900501','1313','10022@ujc.edu.com','15210830022\r'),('09211023','泽田纲吉',1,'天津','19910608','1313','10023@ujc.edu.com','15210830023\r'),('09211024','波风水门',1,'北京','19920102','1313','10024@ujc.edu.com','15210830024\r'),('09211025','星璃',2,'上海','19891112','1313','10025@ujc.edu.com','15210830025\r'),('09211026','千锒千艸',1,'河南','19901015','1312','10026@ujc.edu.com','15210830026\r'),('09211027','本堂瑛海',1,'广东','19911216','1312','10027@ujc.edu.com','15210830027\r'),('09211028','冲野洋子',2,'新疆','19880603','1312','10028@ujc.edu.com','15210830028\r'),('09211029','赤木刚宪',1,'河北','19850101','1312','10029@ujc.edu.com','15210830029\r'),('09211030','早濑浩一',1,'天津','19900508','1312','10030@ujc.edu.com','15210830030\r'),('09211031','结成野名',2,'北京','19911212','1312','10031@ujc.edu.com','15210830031\r'),('09211032','樱咲刹那',2,'上海','19900709','1312','10032@ujc.edu.com','15210830032\r'),('09211033','八坂神奈子',2,'河南','19900907','1312','10033@ujc.edu.com','15210830033\r'),('09211034','麻仓花 ',2,'广东','19900816','1312','10034@ujc.edu.com','15210830034\r'),('09211035','绫濑雪弥',2,'新疆','19890926','1312','10035@ujc.edu.com','15210830035\r'),('09211036','克洛克达尔',1,'河北','19881213','1312','10036@ujc.edu.com','15210830036\r'),('09211037','虚妹',2,'天津','19901108','1312','10037@ujc.edu.com','15210830037\r'),('09211038','神坂春姬',2,'北京','19881229','1312','10038@ujc.edu.com','15210830038\r'),('09211039','清水神悠',2,'上海','19910514','1312','10039@ujc.edu.com','15210830039\r'),('09211040','莉可莉丝',2,'河南','19901008','1311','10040@ujc.edu.com','15210830040\r'),('09211041','冈崎朋也',1,'广东','19910528','1311','10041@ujc.edu.com','15210830041\r'),('09211042','古河渚',2,'新疆','19881019','1311','10042@ujc.edu.com','15210830042\r'),('09211043','真由理',2,'河北','19891225','1311','10043@ujc.edu.com','15210830043\r'),('09211044','花泽香菜',2,'天津','19901231','1311','10044@ujc.edu.com','15210830044\r'),('09211045','平野绫',2,'北京','19890523','1311','10045@ujc.edu.com','15210830045\r'),('09211046','川澄绫子',2,'上海','19930211','1311','10046@ujc.edu.com','15210830046\r'),('09211047','樱木花道',1,'河南','19901219','1311','10047@ujc.edu.com','15210830047\r'),('09211048','路飞',1,'广东','19890416','1311','10048@ujc.edu.com','15210830048\r'),('09211049','卫宫切嗣',1,'新疆','19901111','1311','10049@ujc.edu.com','15210830049\r'),('09211050','远坂凛',2,'北京','19891219','1311','10050@ujc.edu.com','15210830050\r'),('﻿09211001','柯南',1,'河北','19901025','1315','10001@ujc.edu.com','15210830001\r');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `teacherNo` varchar(255) NOT NULL,
  `teacherName` varchar(255) DEFAULT NULL,
  `teacherGender` int(11) DEFAULT NULL,
  `teacherEmail` varchar(255) DEFAULT NULL,
  `teacherMobile` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`teacherNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('201301','李某',1,'T00001@bupt.com','13510830001'),('201302','王某',2,'T00002@bupt.com','13510830002'),('201303','张某',1,'T00003@bupt.com','13510830003'),('201304','袁某',2,'T00004@bupt.com','13510830004'),('201305','郝某',1,'T00005@bupt.com','13510830005'),('201306','于某',2,'T00006@bupt.com','13510830006'),('201307','吴某',1,'T00007@bupt.com','13510830007'),('201308','谢某',2,'T00008@bupt.com','13510830008'),('201309','尿某',1,'T00009@bupt.com','13510830009'),('201311','黄某',2,'T00011@bupt.com','13510830011'),('201312','孙某',2,'T00012@bupt.com','13510830012'),('201313','陈某',1,'T00013@bupt.com','13510830013'),('201314','熊某',1,'T00014@bupt.com','13510830014'),('201315','曾某',2,'T00015@bupt.com','13510830015'),('201316','谭某',1,'T00016@bupt.com','13510830016'),('201317','樊某',2,'T00017@bupt.com','13510830017'),('201318','赵某',1,'T00018@bupt.com','13510830018'),('201319','钱某',1,'T00019@bupt.com','13510830019'),('201320','郑某',2,'T00020@bupt.com','13510830020');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-01-06 18:24:43
