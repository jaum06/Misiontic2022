CREATE DATABASE TESTDB;

USE TESTDB;

CREATE TABLE Employees(
	EmployeeID INT NOT NULL PRIMARY KEY,
    LastName VARCHAR(20) NOT NULL,
    FirstName VARCHAR(20) NOT NULL, 
    BirthDate DATE NOT NULL,
    Photo TEXT NOT NULL,
    Notes TEXT NOT NULL
);

CREATE TABLE Categories(
	CategoryID INT NOT NULL PRIMARY KEY,
    CategoryName VARCHAR(20) NOT NULL,
    Description TEXT NOT NULL
);

CREATE TABLE Orders(
	OrderID INT NOT NULL PRIMARY KEY,
    CustomerID INT NOT NULL,
    EmployeeID INT NOT NULL,
    orderDate DATE NOT NULL,
    shipperID INT NOT NULL
);

CREATE TABLE Customers(
	CustomerID INT NOT NULL PRIMARY KEY,
    CustomerName VARCHAR(100) NOT NULL,
    ContactName VARCHAR(100) NOT NULL,
    Address TEXT NOT NULL,
    City VARCHAR(50),
    PostalCode VARCHAR(20) NOT NULL,
    Country VARCHAR(50) NOT NULL
);

CREATE TABLE OrderDetails(
	OrderDetailID INT NOT NULL PRIMARY KEY,
    OrderID INT NOT NULL,
    ProductID INT NOT NULL,
    Quantity INT NOT NULL
);

CREATE TABLE Products(
	ProductID INT NOT NULL PRIMARY KEY,
    ProductName VARCHAR(50) NOT NULL,
    SupplierID INT NOT NULL,
    CategoryID INT NOT NULL,
    Unit VARCHAR(50) NOT NULL,
    Price FLOAT NOT NULL
);

CREATE TABLE Shippers(
	ShipperID INT NOT NULL PRIMARY KEY,
    ShipperName VARCHAR(50) NOT NULL,
    Phone VARCHAR(20) NOT NULL
);

CREATE TABLE Suppliers(
	SupplierID INT NOT NULL PRIMARY KEY,
    SupplierName VARCHAR(100) NOT NULL,
    ContactName VARCHAR(50) NOT NULL, 
    Address VARCHAR(100) NOT NULL,
    City VARCHAR(50) NOT NULL,
    PostalCode VARCHAR(20) NOT NULL,
    Country VARCHAR(50) NOT NULL,
    Phone VARCHAR(20) NOT NULL
);

select * from categories;

SELECT * FROM CUSTOMERS 
-- WHERE CUSTOMERID = 11
;

select * from employees;

SELECT * FROM ORDERDETAILS;

SELECT * FROM ORDERS;

SELECT * FROM PRODUCTS;

SELECT * FROM SHIPPERS;

SELECT * FROM SUPPLIERS;






