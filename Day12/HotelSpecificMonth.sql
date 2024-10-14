SELECT hotel_details.hotel_id, hotel_details.hotel_name, hotel_details.hotel_type
FROM hotel_details
LEFT JOIN orders ON hotel_details.hotel_id = orders.hotel_id
WHERE orders.order_id IS NULL AND MONTH(orders.order_date) != 5 AND YEAR(orders.order_date) = 19
ORDER BY hotel_details.hotel_id;