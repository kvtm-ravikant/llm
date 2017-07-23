-- truncate table suggestion_master_table;
-- PAGE - 8 : COMMITMENT TO DIFFERENCE :  42 - 46
---------------------------------------------------------------------
-- LEVEL 1
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(8,42,1,1,'', 'A', '<li> <strong>LEVEL 1 </strong>statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(8,43,1,1,'', 'A', '<li> <strong>LEVEL 1 </strong>statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(8,44,1,1,'', 'A', '<li> <strong>LEVEL 1 </strong>statement.</li> <li> for assessment questiion 3 selected option 1.</li>', ''),
(8,45,1,1,'', 'A', '', '<li> <strong>LEVEL 1 </strong>statement.</li> <li> for assessment questiion 4 selected option 1.</li>'),
(8,46,1,1,'', 'A', '<li> <strong>LEVEL 1 </strong>statement.</li> <li> for assessment questiion 5 selected option 1.</li>', '');
commit;

---------------------------------------------------------------------
-- LEVEL 2
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(8,42,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(8,43,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(8,44,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 3 selected option 1.</li>', ''),
(8,45,1,2,'', 'A', '', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 4 selected option 1.</li>'),
(8,46,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 5 selected option 1.</li>', '');
commit;
---------------------------------------------------------------------
-- LEVEL 3
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(8,42,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(8,43,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(8,44,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 3 selected option 1.</li>', ''),
(8,45,1,3,'', 'A', '', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 4 selected option 1.</li>'),
(8,46,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 5 selected option 1.</li>', '');
commit;
  
 

