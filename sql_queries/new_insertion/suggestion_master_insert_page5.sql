SET SQL_SAFE_UPDATES = 0;
delete from suggestion_master_table
where page_id =5;
commit;
-- PAGE - 5 : INCLUSIVE ROLES AND RESPONSIBILITIES : 25 - 30
---------------------------------------------------------------------
-- LEVEL 1
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(5,25,1,1,'', 'A', '<li>Communicate effectively with internal and external stakeholders important to your role using a range of methods.</li><li>Be transparent, objective and accessible. </li><li>Ensure that feedback information from clients is systematically sought, considered and used for the improvement of services.</li><li>Gain further developments in people skills through an accredited course.</li><li>Request peer review or coaching (coaching others and being coached in your subject or vocational area).</li><li>Work shadow a manager working in areas of diversity and inclusion.</li><li>Read and review books or journal articles in relation to creating inclusion in organisations, try to implement at least one idea that will benefit your immediate team.</li><li>Ensure that all voices feel they are being heard.</li>', ''),
(5,26,1,1,'', 'A', '', ''),
(5,27,1,1,'', 'A', '', ''),
(5,28,1,1,'', 'A', '', ''),
(5,29,1,1,'', 'A', '', ''),
(5,30,1,1,'', 'A', '', '<li>Strive to work flexibly in a way that proactively manages stress. Flexible working is linked to employee engagement.</li><li>Understand the importance of employee engagement and diversity as ‘two sides of the same coin.’</li><li>When working on wider organisational projects and engaging with either internal or external professionals, ensure you strive to identify following:\n   - What your desired <b>OUTCOMES</b> will be.\n   - A defined, and <b>REFINED</b> set of criteria that will ensure success.\n   - Determination of project requirements and <b>SCOPE</b>.\n   - Assessment of the <b>VALUE</b> of the project to the organisation.\n   - How any external professionals will fit into the <b>CULTURE</b> of the immediate environment.</li>');
commit;

---------------------------------------------------------------------
-- LEVEL 2
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(5,25,1,2,'', 'A', '<li> REPORT FLAVOR A .</li><li> LEVEL 2 statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(5,26,1,2,'', 'A', '<li> LEVEL 2 statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(5,27,1,2,'', 'A', '<li> LEVEL 2 statement.</li> <li> for assessment questiion 3 selected option 1.</li>', ''),
(5,28,1,2,'', 'A', '', '<li> LEVEL 2 statement.</li> <li> for assessment questiion 4 selected option 1.</li>'),
(5,29,1,2,'', 'A', '<li> LEVEL 2 statement.</li> <li> for assessment questiion 5 selected option 1.</li>', ''),
(5,30,1,2,'', 'A', '', '<li> LEVEL 2 statement.</li> <li> for assessment questiion 6 selected option 1.</li>');
commit;
---------------------------------------------------------------------
-- LEVEL 3
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(5,25,1,3,'', 'A', '<li> REPORT FLAVOR A .</li><li> LEVEL 3 statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(5,26,1,3,'', 'A', '<li> LEVEL 3 statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(5,27,1,3,'', 'A', '<li> LEVEL 3 statement.</li> <li> for assessment questiion 3 selected option 1.</li>', ''),
(5,28,1,3,'', 'A', '', '<li> LEVEL 3statement.</li> <li> for assessment questiion 4 selected option 1.</li>'),
(5,29,1,3,'', 'A', '<li> LEVEL 3 statement.</li> <li> for assessment questiion 5 selected option 1.</li>', ''),
(5,30,1,3,'', 'A', '', '<li> LEVEL 3 statement.</li> <li> for assessment questiion 6 selected option 1.</li>');
commit;
  
 

