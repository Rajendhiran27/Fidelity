SELECT orders.order_id, customers.customer_name, hotel_details.hotel_name, SUM(orders.order_amount) AS order_amount
FROM orders
INNER JOIN customers ON orders.customer_id = customers.customer_id
INNER JOIN hotel_details ON orders.hotel_id = hotel_details.hotel_id
GROUP BY orders.order_id, customers.customer_name, hotel_details.hotel_name
ORDER BY orders.order_id;