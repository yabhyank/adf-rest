create table xx_custom_balance (id number not null primary key, cust_name varchar2(30), balance number, group_id number);

insert into xx_custom_balance values (100, 'DELL INC', 24000, 90);
insert into xx_custom_balance values (101, 'TATA MOTORS', 4000, 90);
insert into xx_custom_balance values (102, 'ITC LTD', 36900, 90);
insert into xx_custom_balance values (103, 'RELIANCE INDUSTRIES', 30590, 90);
insert into xx_custom_balance values (105, 'L'||'&'||'T LTD', 12050, 90);
insert into xx_custom_balance values (107, 'BHARAT FORGE', 14150, 90);
insert into xx_custom_balance values (109, 'VEDANTA LTD', 1720, 90);
commit;


