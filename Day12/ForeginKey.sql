CREATE TABLE orders (
    ORD_NO NUMERIC(5) PRIMARY KEY,
    PURCH_AMT DECIMAL(8, 2),
    ORD_DATE DATE,
    CUSTOMER_ID NUMERIC(5),
    SALESMAN_ID NUMERIC(5) FOREIGN KEY REFERENCES salesman(SALESMAN_ID)
);
GO