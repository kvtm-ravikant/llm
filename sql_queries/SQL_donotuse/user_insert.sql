truncate table USER_TABLE;

INSERT INTO `ilm_db`.`USER_TABLE`
(
	`FIRST_NAME`, `MIDDLE_NAME`, `LAST_NAME`, `JOB_TITLE`, `WORK_EMAIL`, `ORGANISATION`,`BUSINESS_UNIT`,`ASSESSMENT_LEVEL`, `COUNTRY`)
VALUES
	('Dan','','Gallagher ','CLIENT','dan@articasearch.com','articasearch','research','1','UK'),
	('Puneet','','Shekhar','SW','abc@mail.com','SELF','SELF','2','IN'),
	('User','','One ','CLIENT','lvl1@mail.com','articasearch','research','1','UK'),
	('User','','Two ','CLIENT','lvl2@mail.com','articasearch','research','2','UK'),
	('User','','Three ','CLIENT','lvl3@mail.com','articasearch','research','3','UK'),
	('User','','Four ','CLIENT','lvl4@mail.com','articasearch','research','4','UK'),
	('User','','Fhree ','CLIENT','lvl5@mail.com','articasearch','research','5','UK');
commit;
