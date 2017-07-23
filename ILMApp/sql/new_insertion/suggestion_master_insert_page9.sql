SET SQL_SAFE_UPDATES = 0;
delete from suggestion_master_table
where page_id =9;
commit;
-- PAGE - 9 : COLLABORATIVE PRACTICE VALUES : 47 - 52
---------------------------------------------------------------------
-- LEVEL 1
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(9,47,1,1,'', 'A', '<li>Critique own performance from the perspective of a diverse range of colleagues as a means of self-improvement.</li><li>Gauge standards of work performance in terms of the impact it has on fairness and wellbeing.</li><li>Set high standards for supporting others so that team members might follow lead.</li><li>Complete own work on time, and against agreed commitments; act on promises to others.</li><li>Support others’ work giving due consideration to how different views and attitudes lead to quality of output.</li><li>Suggest new ways to apply existing knowledge.</li><li>Look beyond tried-and-true methods of solving problems.</li>', ''),
(9,48,1,1,'', 'A', '', ''),
(9,49,1,1,'', 'A', '', ''),
(9,50,1,1,'', 'A', '', ''),
(9,51,1,1,'', 'A', '', ''),
(9,52,1,1,'', 'A', '', '<li><b>Seek to understand the invisible manifestations of organisational culture:</b> \n       - Values \n       - Private Conversations (with self or confidants) \n      - Invisible Rules \n       - Attitudes \n       - Beliefs \n       - Worldviews \n       - Moods and Emotions \n       - Standards of Behaviour \n       - Assumption</li><li>Ensure these cultural drivers are positive in nature, and do not hinder rather contribute to effective performance and wellbeing.</li><li>Take responsibility for your own professional and career development.</li><li>Seek support as required to further understand your role.</li>');
commit;

---------------------------------------------------------------------
-- LEVEL 2
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(9,47,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(9,48,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(9,49,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 3 selected option 1.</li>', ''),
(9,50,1,2,'', 'A', '', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 4 selected option 1.</li>'),
(9,51,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 5 selected option 1.</li>', ''),
(9,52,1,2,'', 'A', '', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 6 selected option 1.</li>');
commit;
---------------------------------------------------------------------
-- LEVEL 3
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 

(9,47,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(9,48,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(9,49,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 3 selected option 1.</li>', ''),
(9,50,1,3,'', 'A', '', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 4 selected option 1.</li>'),
(9,51,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 5 selected option 1.</li>', ''),
(9,52,1,3,'', 'A', '', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 6 selected option 1.</li>');
commit;
  
 

