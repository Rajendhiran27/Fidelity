SELECT hotel_details.hotel_id, hotel_details.hotel_name, COUNT(orders.order_id) AS NO_OF_ORDERS
FROM hotel_details
INNER JOIN orders ON hotel_details.hotel_id = orders.hotel_id
GROUP BY hotel_details.hotel_id, hotel_details.hotel_name
HAVING COUNT(orders.order_id) > 5
ORDER BY hotel_details.hotel_id;