SELECT customer_id, customer_name, address, phone_number
FROM Customers
WHERE email_id LIKE '%@gmail.com'
ORDER BY customer_id;
