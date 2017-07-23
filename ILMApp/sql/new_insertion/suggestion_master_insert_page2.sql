-- truncate table suggestion_master_table;
-- PAGE - 2 : COMMERCIAL IMPACT DIVERSITY: 7 - 9
---------------------------------------------------------------------
-- LEVEL 1
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(2,7,1,1,'', 'A', '<li> <strong>LEVEL 1 </strong>statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(2,8,1,1,'', 'A', '<li> <strong>LEVEL 1 </strong>statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(2,9,1,1,'', 'A', '', '<li> <strong>LEVEL 1 </strong>statement.</li> <li> for assessment questiion 3 selected option 1.</li>');
commit;

---------------------------------------------------------------------
-- LEVEL 2
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(2,7,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(2,8,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(2,9,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 3 selected option 1.</li>', '');
commit;
---------------------------------------------------------------------
-- LEVEL 3
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(2,7,1,3,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(2,8,1,3,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(2,9,1,3,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 3 selected option 1.</li>', '');
commit;
  
 

