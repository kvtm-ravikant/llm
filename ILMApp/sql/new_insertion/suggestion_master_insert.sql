-- truncate table suggestion_master_table;
-- PAGE - 1 : INCLUSIVE LEADERSHIP : 1 - 6
-- PAGE - 2 : COMMERCIAL IMPACT DIVERSITY: 7 - 9
-- PAGE - 3 : INCLUSIVE TEAMS AND TEAMWORK : 10 - 15
-- PAGE - 4 : INCLUSIVE GOALS AND OBJECTIVES : 16 - 24
-- PAGE - 5 : INCLUSIVE ROLES AND RESPONSIBILITIES : 25 - 30
-- PAGE - 6 : CHALLENGING PREJUDICE : 31 - 36
-- PAGE - 7 : INCLUSIVE LEADERSHIP : 37 - 41
-- PAGE - 8 : COMMITMENT TO DIFFERENCE :  42 - 46
-- PAGE - 9 : COLLABORATIVE PRACTICE VALUES : 47 - 52
-- PAGE - 10 : COLLABORATIVE COMMUNICATION : 53 - 58
---------------------------------------------------------------------
-- LEVEL 1
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(1,1,1,1,'', 'A', '<li> <strong>Learn </strong>about the cultural backgrounds, lives and interests of employees outside of the workplace.</li> <li> Be creative, flexible and look for new ways of doing things.</li> <li> Acknowledge all faiths present in your workplace. </li>', ''),
(1,2,1,1,'', 'A', '<li>Demonstrate a knowledge and interest in other cultures.</li> <li>Admit that you don’t have the answer when you don’t, and seek opinions from those around you. </li> <li>Exert effort to identify their own biases, and find ways to manage them in the workplace.</li>', ''),
(1,3,1,1,'', 'A', '<li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas.</li> <li>Ensure that information systems that guide decision-making are free of bias.</li>', ''),
(1,4,1,1,'', 'A', '', '<li>Get involved in mentoring another person who requires support within the business, or seek mentoring to develop a new skill that is of interest and use.</li> <li>Formulate employee resource groups, or networks of employees who share an affiliation (such as women, ethnic minorities, or young professionals).</li> <li>Within the resource groups seek real assignments that are of tangible benefit to the business. </li>'),
(1,5,1,1,'', 'A', '<li>Model and promotes a culture of respect, fairness and trust where people feel appreciated and valued for their unique contribution.</li>', ''),
(1,6,1,1,'', 'A', '', '<li>Model and promotes a culture of respect, fairness and trust where people feel appreciated and valued for their unique contribution.</li> <li>Recognise individual\`s achievements, knowledge and capabilities.</li> <li>Demonstrates openness to other\`s ideas or to being influenced about another person (e.g., believing that others have something valuable to say or offer, no matter what position(s) they hold).</li>');
commit;

---------------------------------------------------------------------
-- LEVEL 2
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(1,1,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(1,2,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(1,3,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 3 selected option 1.</li>', ''),
(1,4,1,2,'', 'A', '', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 4 selected option 1.</li>'),
(1,5,1,2,'', 'A', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 5 selected option 1.</li>', ''),
(1,6,1,2,'', 'A', '', '<li> <strong>LEVEL 2 </strong>statement.</li> <li> for assessment questiion 6 selected option 1.</li>');
commit;
---------------------------------------------------------------------
-- LEVEL 3
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(1,1,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 1 selected option 1.</li>', ''),
(1,2,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 2 selected option 1.</li>', ''),
(1,3,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 3 selected option 1.</li>', ''),
(1,4,1,3,'', 'A', '', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 4 selected option 1.</li>'),
(1,5,1,3,'', 'A', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 5 selected option 1.</li>', ''),
(1,6,1,3,'', 'A', '', '<li> <strong>LEVEL 3 </strong>statement.</li> <li> for assessment questiion 6 selected option 1.</li>');
commit;
  
 

