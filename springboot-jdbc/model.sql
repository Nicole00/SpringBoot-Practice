-- create table `modeling_task_info`
SET POREING_KEY_CHECKS=0;

DROP TABLE IF EXISTS `modeling_task_info`;
CREATE TABLE `modeling_task_info` (
  `task_id` int(11) NOT NULL COMMENT '主键',
  `task_name` varchar(45) DEFAULT NULL COMMENT '任务名称',
  `task_desc` varchar(45) DEFAULT NULL COMMENT '任务描述',
  `task_create_time` varchar(45) NOT NULL COMMENT '任务创建时间',
  `task_exec_time` varchar(45) DEFAULT NULL COMMENT '任务执行时间',
  `task_end_time` varchar(45) DEFAULT NULL COMMENT '任务结束时间',
  `task_state` varchar(45) NOT NULL COMMENT '任务状态',
  `miningtask_type` varchar(45) NOT NULL COMMENT '任务类型',
  `algo_id` int(11) NOT NULL COMMENT '算法id',
  `business_analysis_topic_id` varchar(45) NOT NULL COMMENT '业务分析主题id',
  `entity_id` int(11) NOT NULL COMMENT '实体id',
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO 'modeling_task_info' VALUES(2, 'task2', 'task2', '1', '1', '2', '0', '1', '44', '3', 45);
INSERT INTO 'modeling_task_info' VALUES(3, 'task3', 'task3', '1', '1', '2', '0', '1', '44', '4', 46);
INSERT INTO 'modeling_task_info' VALUES(4, 'task4', 'task4', '1', '1', '2', '0', '1', '44', '8', 46);