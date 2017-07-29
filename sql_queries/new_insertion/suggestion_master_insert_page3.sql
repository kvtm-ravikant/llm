SET SQL_SAFE_UPDATES = 0;
delete from suggestion_master_table
where page_id =3;
commit;
-- PAGE - 3 : INCLUSIVE TEAMS AND TEAMWORK : 10 - 15
---------------------------------------------------------------------
-- LEVEL 1
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(3,10,1,1,'', 'A', '<li>Develop an atmosphere that is safe for all team members to ask for help.</li><li>Actively seek information from people from a variety of backgrounds and cultures, including multiple parties where possible on the problem solving and decision making process.</li><li>Create a team spirit where every member feels valued.</li><li>Ensure you place a high value on the ideas of others.</li><li>Allow time to foster creativity.</li><li>Develop your own teamwork definition that you all share and fits your context.</li><li>Provide immediate feedback on performance (so that it is clear how well everyone is doing) and encourage others to support and provide feedback to each other.</li><li>Create and/or review the team’s charter. </li><li>Discuss why the team exists.</li>', ''),
(3,11,1,1,'', 'A', '', ''),
(3,12,1,1,'', 'A', '', ''),
(3,13,1,1,'', 'A', '', ''),
(3,14,1,1,'', 'A', '', ''),
(3,15,1,1,'', 'A', '', '<li>Allow each team member to express commitment.</li><li>Use the common purpose to prioritize team actions.</li><li>Be honest.</li><li>Work to eliminate conflicts of interests.</li><li>Trust teammates (you must trust them before they will trust you.)</li><li>Request solutions; get each party to identify how the situation could be changed.</li><li><b>Go beyond the role of a diversity advocate by being a:</b>\n      - Individual that sets the example andbecomes a role model.\n      - Team builder that pulls people into a unified team.\n     - Team builder that pulls people into a unified team.\n     - Devil’s advocate, raising issues for better understanding.</li>');
commit;

---------------------------------------------------------------------
-- LEVEL 2
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(3,10,1,2,'', 'A', '<li> LEVEL 2 statement.</li> <li> for assessment questiion 1 selected option 1.</li><li> This is report flavor A.</li>', ''),
(3,11,1,2,'', 'A', '<li> LEVEL 2 statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(3,12,1,2,'', 'A', '<li> LEVEL 2 statement.</li> <li> for assessment questiion 3 selected option 1.</li>', ''),
(3,13,1,2,'', 'A', '', '<li> LEVEL 2 statement.</li> <li> for assessment questiion 4 selected option 1.</li>'),
(3,14,1,2,'', 'A', '<li> LEVEL 2 statement.</li> <li> for assessment questiion 5 selected option 1.</li>', ''),
(3,15,1,2,'', 'A', '', '<li> LEVEL 2 statement.</li> <li> for assessment questiion 6 selected option 1.</li>');
commit;
---------------------------------------------------------------------
-- LEVEL 3
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(3,10,1,3,'', 'A', '<li> LEVEL 3 statement.</li> <li> for assessment questiion 1 selected option 1.</li><li> This is report flavor A.</li>', ''),
(3,11,1,3,'', 'A', '<li> LEVEL 3 statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(3,12,1,3,'', 'A', '<li> LEVEL 3 statement.</li> <li> for assessment questiion 3 selected option 1.</li>', ''),
(3,13,1,3,'', 'A', '', '<li> LEVEL 3 statement.</li> <li> for assessment questiion 4 selected option 1.</li>'),
(3,14,1,3,'', 'A', '<li> LEVEL 3 statement.</li> <li> for assessment questiion 5 selected option 1.</li>', ''),
(3,15,1,3,'', 'A', '', '<li> LEVEL 3 statement.</li> <li> for assessment questiion 6 selected option 1.</li>');
commit;
  
 

