SET SQL_SAFE_UPDATES = 0;
delete from suggestion_master_table
where page_id =2;
commit;
-- PAGE - 2 : COMMERCIAL IMPACT DIVERSITY: 7 - 9
---------------------------------------------------------------------
-- LEVEL 1
---------------------------------------------------------------------
INSERT INTO `suggestion_master_table` 
(`page_id`, `question_id`, `option_id`, `level_id`, `suggestion`, `report_type`, `left_suggestion`, `right_suggestion`)
VALUES 
(2,7,1,1,'', 'A', '<li>Gain access to different perspectives and sources of information.</li><li>Gain greater understanding of customers. </li><li>Strive to ensure better communication with customers with different perspectives.</li><li>Provide multilingual service and support to improve customer satisfaction and open up opportunities in different sectors of the market.</li><li>Ensure that product and service concepts do not conflict with different cultural values.</li><li>Fend off the dangers of groupthink by offering fresh blood and alternative solutions.</li><li>Understand the cost of integrating workers poorly, as demographic diversity increases.</li><li>Adopt a diversity management approach to attract more talented women, ethnic minorities and other groups than otherwise</li>', ''),
(2,8,1,1,'', 'A', '', ''),
(2,9,1,1,'', 'A', '', '<li>Examine how to realise market gains from improved insight and cultural sensitivity.</li><li>Examine how customers are becoming more diverse and aim to reflect this diversity.</li><li>Increase creativity and problem solving by providing a wider range of perspectives to customers.</li><li>Create more flexibility to react to environmental changes.</li><li>Utilize multiple communication vehicles such as web sites, brochures, talking points, and more.</li><li>Elaborate on benefits of diversity and inclusion (D&I).</li><li>Acknowledge and addresses possible unfavourable impact of procedures and processes on customers.</li><li>Track and communicates D&I strategy progress and setbacks.</li>');
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
  
 

