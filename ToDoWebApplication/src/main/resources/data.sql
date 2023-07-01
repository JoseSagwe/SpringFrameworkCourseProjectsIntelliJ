create table ToDo
(

    ID          INTEGER not null,
    USERNAME    VARCHAR not null,
    DESCRIPTION VARCHAR not null,
    TARGET_DATE DATE    not null,
    DONE        BOOLEAN not null
);
insert into ToDo (ID, USERNAME, DESCRIPTION, TARGET_DATE, DONE)
values(10001,'Developer Joseph', 'Get AWS Certified', CURRENT_DATE(), false);


insert into ToDo (ID, USERNAME, DESCRIPTION, TARGET_DATE, DONE)
values(10002,'Developer Joseph', 'Get Azure Certified', CURRENT_DATE(), false);

insert into ToDo (ID, USERNAME, DESCRIPTION, TARGET_DATE, DONE)
values(10003,'Developer Joseph', 'Get GCP Certified', CURRENT_DATE(), false);

insert into todo (ID, USERNAME, DESCRIPTION, TARGET_DATE, DONE)
values(10004,'Developer Joseph', 'Learn DevOps', CURRENT_DATE(), false);