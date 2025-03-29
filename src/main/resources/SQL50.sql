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



-- 1193. Monthly Transactions I

 Create table If Not Exists Transactions (id int, country varchar(4), state enum('approved', 'declined'), amount int, trans_date date)
 Truncate table Transactions
 insert into Transactions (id, country, state, amount, trans_date) values ('121', 'US', 'approved', '1000', '2018-12-18')
 insert into Transactions (id, country, state, amount, trans_date) values ('122', 'US', 'declined', '2000', '2018-12-19')
 insert into Transactions (id, country, state, amount, trans_date) values ('123', 'US', 'approved', '2000', '2019-01-01')
 insert into Transactions (id, country, state, amount, trans_date) values ('124', 'DE', 'approved', '2000', '2019-01-07')

 select  month,country,sum(trans_count) as trans_count,sum(approved_count) as approved_count,  sum(trans_total_amount) as trans_total_amount,sum(app_amount) as approved_total_amount from ( select to_char(trans_date,'YYYY/MM') as month,country,count(*) as trans_count,case when state='approved' then count(*) end approved_count,case when state='declined' then count(*) end declined_count, case when state='approved' then sum(amount) end app_amount, case when state='declined' then sum(amount) end declined_amt ,sum(amount) as trans_total_amount from transactions group by month ,state,country) a group by month,country;

 -- 1174. Immediate Food Delivery II
 Create table If Not Exists Delivery (delivery_id int, customer_id int, order_date date, customer_pref_delivery_date date);
 Truncate table Delivery;
 insert into Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date) values ('1', '1', '2019-08-01', '2019-08-02');
 insert into Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date) values ('2', '2', '2019-08-02', '2019-08-02');
 insert into Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date) values ('3', '1', '2019-08-11', '2019-08-12');
 insert into Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date) values ('4', '3', '2019-08-24', '2019-08-24');
 insert into Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date) values ('5', '3', '2019-08-21', '2019-08-22');
 insert into Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date) values ('6', '2', '2019-08-11', '2019-08-13');
 insert into Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date) values ('7', '4', '2019-08-09', '2019-08-09');

 select round( ((select count(*) from (select customer_id,min(order_date) f_order_date,min(customer_pref_delivery_date) f_customer_pref_delivery_date from Delivery group by customer_id order by customer_id) a where a.f_order_date=a.f_customer_pref_delivery_date)::decimal(10,2) / (select count(*) from (select customer_id,min(order_date) f_order_date,min(customer_pref_delivery_date) f_customer_pref_delivery_date from Delivery group by customer_id order by customer_id) a ))::decimal(10,2) * 100,2) immediate_percentage;


Create table If Not Exists Activity (player_id int, device_id int, event_date date, games_played int);
Truncate table Activity;
insert into Activity (player_id, device_id, event_date, games_played) values ('1', '2', '2016-03-01', '5');
insert into Activity (player_id, device_id, event_date, games_played) values ('1', '2', '2016-03-02', '6');
insert into Activity (player_id, device_id, event_date, games_played) values ('2', '3', '2017-06-25', '1');
insert into Activity (player_id, device_id, event_date, games_played) values ('3', '1', '2016-03-02', '0');
insert into Activity (player_id, device_id, event_date, games_played) values ('3', '4', '2018-07-03', '5');



insert into Activity values ('1', '2', '2016-03-01', '5') ;
insert into Activity values ('1', '2', '2016-03-02', '1') ;
insert into Activity values ('3', '1', '2016-01-02', '10') ;
insert into Activity values ('3', '4', '2016-01-03', '15') ;

with cte as (select count(distinct player_id) as active_user from (select *,
rank() over (partition by player_id order by event_date asc) as rank,
lag(event_date) over(partition by player_id order by event_date asc) as lag_date
from activity) as x where x.rank <=2 and event_date = lag_date + interval '1 day'),
cte2 as (select count(distinct player_id) as total_user from activity)

select ROUND(active_user*1.0/total_user,2) as fraction from cte,cte2;   -- Need to check this!
