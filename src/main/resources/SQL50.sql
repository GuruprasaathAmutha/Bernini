--1633. Percentage of Users Attended a Contest
Create table If Not Exists Users (user_id int, user_name varchar(20));
Create table If Not Exists Register (contest_id int, user_id int);
Truncate table Users;
insert into Users (user_id, user_name) values ('6', 'Alice');
insert into Users (user_id, user_name) values ('2', 'Bob');
insert into Users (user_id, user_name) values ('7', 'Alex');
Truncate table Register;
insert into Register (contest_id, user_id) values ('215', '6');
insert into Register (contest_id, user_id) values ('209', '2');
insert into Register (contest_id, user_id) values ('208', '2');
insert into Register (contest_id, user_id) values ('210', '6');
insert into Register (contest_id, user_id) values ('208', '6');
insert into Register (contest_id, user_id) values ('209', '7');
insert into Register (contest_id, user_id) values ('209', '6');
insert into Register (contest_id, user_id) values ('215', '7');
insert into Register (contest_id, user_id) values ('208', '7');
insert into Register (contest_id, user_id) values ('210', '2');
insert into Register (contest_id, user_id) values ('207', '2');
insert into Register (contest_id, user_id) values ('210', '7');

select a.contest_id, round((a.usercount*100::decimal/b.totalusers::decimal),2) as percentage from (select contest_id, count(*) as usercount from Register group by contest_id order by contest_id) a cross join  (select count(*) as totalusers from Users) b order by percentage desc,contest_id asc;


--1211. Queries Quality and Percentage
Create table If Not Exists Queries (query_name varchar(30), result varchar(50), position int, rating int);
Truncate table Queries;
insert into Queries (query_name, result, position, rating) values ('Dog', 'Golden Retriever', '1', '5');
insert into Queries (query_name, result, position, rating) values ('Dog', 'German Shepherd', '2', '5');
insert into Queries (query_name, result, position, rating) values ('Dog', 'Mule', '200', '1');
insert into Queries (query_name, result, position, rating) values ('Cat', 'Shirazi', '5', '2');
insert into Queries (query_name, result, position, rating) values ('Cat', 'Siamese', '3', '3');
insert into Queries (query_name, result, position, rating) values ('Cat', 'Sphynx', '7', '4');

 select query_name, avg((rating::decimal/position::decimal))::decimal(10,2) as quality, ((sum(case when rating < 3 then 1::decimal else 0::decimal(10,2) end)/count(*)::decimal(10,2))*100)::decimal(10,2) as poor_query_percentage from queries group by query_name;