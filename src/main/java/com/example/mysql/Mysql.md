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
SELECT * FROM cities WHERE country = 'USA';
select * from cities where population Between 5000000 And 10000000;
SELECT * FROM cities WHERE state = 'New York' AND country = 'USA';
SELECT * FROM cities WHERE area > 1000;
SELECT * FROM cities WHERE state IS NOT NULL;
SELECT * FROM cities WHERE population < 1000000;
SELECT * FROM cities WHERE country = 'India' AND population > 5000000;
SELECT * FROM cities WHERE city_name LIKE 'B%';


<font color="red"> SQL ORDER BY </font>
---------
SELECT * FROM table_name ORDER BY column1;

//SELECT * FROM (SELECT * FROM table_name ORDER BY column1) AS subquery;
