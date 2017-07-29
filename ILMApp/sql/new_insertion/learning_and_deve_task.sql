SET SQL_SAFE_UPDATES = 0;
update suggestion_master_table set learning_tasks = "<li>Inclusive Leadership</li><li>Unconscious Bias</li><li>Managing Diversity &amp; Inclusion</li>"
where page_id =1 and question_id =1;
commit;
update suggestion_master_table set learning_tasks = "<li>Diversity in the Workplace Managers</li><li>Equality and Diversity in the Workplace for Staff</li><li>Equality Analysis</li>"
where page_id =2 and question_id =7;
commit;
update suggestion_master_table set learning_tasks = "<li>Diversity in the Workplace Managers</li><li>Equality and Diversity in the Workplace for Staff</li><li>Stress Management</li>"
where page_id =3 and question_id =10;
commit;
-- page 4 data need to check for all flavor
update suggestion_master_table set learning_tasks = ""
where page_id =4 and question_id =16;
commit;
update suggestion_master_table set learning_tasks = "<li>Unconscious Bias</li><li>Inclusive Leadership</li><li>Managing Disciplines &amp; Grievances</li><li>Performance Management</li>"
where page_id =5 and question_id =25;
commit;
update suggestion_master_table set learning_tasks = ""
where page_id =6 and question_id =31;
commit;
update suggestion_master_table set learning_tasks = ""
where page_id =7 and question_id =37;
commit;
update suggestion_master_table set learning_tasks = ""
where page_id =8 and question_id =42;
commit;
update suggestion_master_table set learning_tasks = ""
where page_id =9 and question_id =47;
commit;
update suggestion_master_table set learning_tasks = ""
where page_id =10 and question_id =53;
commit;