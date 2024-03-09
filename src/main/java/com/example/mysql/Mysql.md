                                             Mysql

<font color="red">Create Database</font>
---------
CREATE DATABASE query_practice;

<font color="red">Create Table</font>
---------
CREATE TABLE cities (id INT PRIMARY KEY, city_name VARCHAR(255) NOT NULL, population INT, area FLOAT, country VARCHAR(255) NOT NULL, state VARCHAR(255));

<font color="red">Insert Table</font>
---------
INSERT INTO cities (id, city_name, population, area, country, state)
VALUES
(1, 'City1', 100000, 50.2, 'Country1', 'State1'),
(2, 'City2', 150000, 45.8, 'Country2', 'State2'),
(3, 'City3', 80000, 30.5, 'Country3', 'State3'),
-- Add 17 more records with similar structure
(18, 'City18', 120000, 55.6, 'Country4', 'State4'),
(19, 'City19', 90000, 40.3, 'Country5', 'State5'),
(20, 'City20', 110000, 48.7, 'Country6', 'State6');


<font color="red">SELECT DISTINCT</font>
---------
SELECT DISTINCT country FROM cities;
SELECT DISTINCT state FROM cities WHERE state IS NOT NULL;
SELECT DISTINCT city_name, state FROM cities WHERE state IS NOT NULL;

<font color="red">Clause</font>
---------
- SELECT Clause
- FROM Clause
- WHERE Clause
- ORDER BY Clause
- GROUP BY Clause
- HAVING Clause Clause
- LIMIT Clause
- JOIN Clause

This are some clauses in mysql

<font color="red"> Where Clause </font>
---------
1) SELECT * FROM cities WHERE country = 'USA';
2) select * from cities where population Between 5000000 And 10000000;
3) SELECT * FROM cities WHERE state = 'New York' AND country = 'USA';
4) SELECT * FROM cities WHERE area > 1000;
5) SELECT * FROM cities WHERE state IS NOT NULL;
6) SELECT * FROM cities WHERE population < 1000000;
7) SELECT * FROM cities WHERE country = 'India' AND population > 5000000;
8) SELECT * FROM cities WHERE city_name LIKE 'B%';


<font color="red"> SQL ORDER BY </font>
---------
1) SELECT * FROM table_name ORDER BY column1;
2) SELECT * FROM table_name ORDER BY column1 * column2 DESC;
3) SELECT * FROM orders ORDER BY order_date DESC;
4) select * from cities where area > 1000 order by city_name desc;



<font color="red"> MySQL NULL Values </font>
---------
1) SELECT column_names FROM table_name WHERE column_name IS NULL;
2) SELECT column_names FROM table_name WHERE column_name IS NOT NULL;
3) select * from cities where city_name is null;
4) select * from cities where state is not null order by id desc;

<font color="red"> MySQL LIMIT Clause </font>
---------
1) SELECT column_name(s)FROM table_name WHERE condition LIMIT number;
2) select * from cities limit 10;
3) SELECT * FROM cities LIMIT 3 OFFSET 3;(What if we want to select records 4 - 6 (inclusive)?)
4) select * from cities order by area desc limit 5;
5) SELECT * FROM cities WHERE area > 1000 ORDER BY id desc LIMIT 5;


<font color="red"> Aggregate Functions MIN(),MAX(),COUNT(), AVG() and SUM() </font>
---------
1) SELECT MIN(column_name) FROM table_name WHERE condition;
2) SELECT MIN(sales_amount) AS min_sales_amount
   FROM sales;
3) SELECT MAX(sales_amount) AS max_sales_amount
   FROM sales;
4) SELECT COUNT(*) AS total_sales_records
   FROM sales;
5) SELECT AVG(sales_amount) AS avg_sales_amount
   FROM sales;
6) SELECT SUM(sales_amount) AS total_sales_amount
   FROM sales;


<font color="red"> In and Between </font>
---------
SELECT * FROM table_name WHERE column_name IN ('value1', 'value2', 'value3');
SELECT * FROM table_name WHERE column_name BETWEEN value1 AND value2;
SELECT * FROM products WHERE price BETWEEN 10 AND 50;

