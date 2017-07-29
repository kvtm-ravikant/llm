SET SQL_SAFE_UPDATES = 0;
delete from suggestion_master_table
where page_id =8;
commit;
-- truncate table suggestion_master_table;
-- PAGE - 8 : COMMITMENT TO DIFFERENCE :  42 - 46
---------------------------------------------------------------------
-- LEVEL 1
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(8,42,1,1,'', 'A', '<li>Never operate in crisis mode, manage boundaries in relation to any delegated deliverables, and communicate what you can realistically can achieve.</li><li>Have a fundamental desire to complete things, maintain your focus even in the context of challenge.</li><li>Seek, give, and summariseinformation to ensure that the situation/issue at hand is understood.</li><li>Use appropriate influence strategies (such as demonstrating benefits orgiving rewards) to gain genuine agreement; persist by using different approaches as needed to gain commitment from different audiences.</li><li>Close discussions with clear summaries; summarise outcomes of discussions and establish next steps if needed.</li><li>Establish good interpersonal relationship by helping people feel valued, appreciated, and included in discussions.</li>', ''),
(8,43,1,1,'', 'A', '', ''),
(8,44,1,1,'', 'A', '', ''),
(8,45,1,1,'', 'A', '', ''),
(8,46,1,1,'', 'A', '', '<li>Capitalise on personal initiatives that support others by harnessing the support of the line manager.</li><li>Actively seek a mix of developmental activities from classroom to teamwork to individual projects that improve workplace wellbeing.</li><li>Enhance life management skills such as how to manage stress.</li><li>Examine how to make a good/persuasive argument to persuade/influence a positive change to a procedure or process.</li><li>Work to make others feel ownership of any new solutions they may put forward.</li><li>Identify key decision-makers on issues of diversity with a view to identifying opportunities for change within own business area, and communicate this to management.</li>');
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
  
 

