ALTER TABLE Supplier
ADD CHECK (LEN(contact) = 10);
GO