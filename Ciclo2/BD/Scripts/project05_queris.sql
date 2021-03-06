SELECT * FROM EMPLOYEES;

SELECT EMPLOYEEID, FIRSTNAME, BIRTHDATE 
FROM EMPLOYEES;

SELECT DISTINCT EMPLOYEEID-- , SHIPPERID
FROM ORDERS;

SELECT COUNT(DISTINCT EMPLOYEEID)
FROM ORDERS;

SELECT ORDERID, SHIPPERID 
FROM ORDERS
WHERE SHIPPERID = 3;

SELECT ORDERID, SHIPPERID 
FROM ORDERS
WHERE SHIPPERID > 2;

SELECT ORDERID, SHIPPERID 
FROM ORDERS
WHERE EMPLOYEEID > 2;

SELECT ORDERID, SHIPPERID
FROM ORDERS
WHERE EMPLOYEEID > 2 AND EMPLOYEEID <6;

SELECT ORDERID, SHIPPERID, CUSTOMERID
FROM ORDERS
WHERE CUSTOMERID <= 20 OR CUSTOMERID > 76;

SELECT ORDERID, SHIPPERID, CUSTOMERID
FROM ORDERS
WHERE NOT CUSTOMERID <= 20 AND NOT CUSTOMERID >= 76;

SELECT ORDERID, SHIPPERID, CUSTOMERID
FROM ORDERS
WHERE NOT CUSTOMERID <= 20 AND (CUSTOMERID>=40 OR CUSTOMERID<60);

SELECT *
FROM ORDERS
ORDER BY EMPLOYEEID, SHIPPERID DESC;

SELECT *
FROM ORDERS
WHERE CUSTOMERID > 20 
ORDER BY SHIPPERID ASC, EMPLOYEEID DESC;

SELECT ORDERID, SHIPPERID, EMPLOYEEID
FROM ORDERS
WHERE CUSTOMERID > 20
ORDER BY SHIPPERID ASC, EMPLOYEEID DESC;

SELECT *
FROM ORDERS
WHERE ORDERID = 10248;

UPDATE ORDERS
SET SHIPPERID =1 
WHERE ORDERID = 10248;

SELECT *
FROM ORDERS
WHERE ORDERID = 10248;

SELECT *
FROM ORDERS
WHERE ORDERID = 10278;

DELETE 
FROM ORDERS
WHERE ORDERID = 10278;

SELECT *
FROM ORDERS
WHERE ORDERID = 10278;