CREATE DATABASE Orders;
USE Orders;
CREATE TABLE tblCustomers (
    CustomerID INT PRIMARY KEY IDENTITY(1, 1),
    CompanyName NVARCHAR(50) NOT NULL,
    ContactName NVARCHAR(50),
    ContactTitle NVARCHAR(30),
    Address NVARCHAR(60),
    City NVARCHAR(40),
    Region NVARCHAR(40),
    PostalCode NVARCHAR(10),
    Country NVARCHAR(40) DEFAULT 'Canada'
);

CREATE TABLE tblSuppliers (
    SupplierID INT PRIMARY KEY IDENTITY(1, 1),
    CompanyName NVARCHAR(50) NOT NULL,
    ContactName NVARCHAR(50),
    ContactTitle NVARCHAR(30),
    Address NVARCHAR(60),
    City NVARCHAR(40),
    Region NVARCHAR(40),
    PostalCode NVARCHAR(10),
    Country NVARCHAR(40),
    Phone NVARCHAR(20),
    Fax NVARCHAR(20)
);

CREATE TABLE tblShippers (
    ShipperID INT PRIMARY KEY IDENTITY(1, 1),
    CompanyName NVARCHAR(50) NOT NULL UNIQUE,
    Phone NVARCHAR(20)
);

CREATE TABLE tblProducts (
    ProductID INT PRIMARY KEY IDENTITY(1, 1),
    ProductName NVARCHAR(40) NOT NULL,
    SupplierID INT FOREIGN KEY REFERENCES tblSuppliers(SupplierID),
    CategoryID INT,
    QuantityPerUnit NVARCHAR(20),
    UnitPrice DECIMAL(10, 2),
    UnitsInStock INT,
    UnitsOnOrder INT,
    ReorderLevel INT,
    Discontinued BIT
);

CREATE TABLE tblOrders (
    OrderID INT PRIMARY KEY IDENTITY(1, 1),
    CustomerID INT FOREIGN KEY REFERENCES tblCustomers(CustomerID),
    EmployeeID INT,
    OrderDate DATE,
    RequiredDate DATE,
    ShippedDate DATE,
    ShipVia INT FOREIGN KEY REFERENCES tblShippers(ShipperID),
    Freight DECIMAL(10, 2)
);

CREATE TABLE tblOrderDetails (
    OrderID INT FOREIGN KEY REFERENCES tblOrders(OrderID),
    ProductID INT FOREIGN KEY REFERENCES tblProducts(ProductID),
    UnitPrice DECIMAL(10, 2),
    Quantity INT CHECK (Quantity > 0),
    Discount DECIMAL(10, 2),
    PRIMARY KEY (OrderID, ProductID)
);