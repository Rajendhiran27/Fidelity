CREATE OR REPLACE FUNCTION get_worker_count_by_nth_highest_salary(
    nth_highest_salary INTEGER
)
RETURNS INTEGER AS
$$
DECLARE
    worker_count INTEGER;
BEGIN
    WITH ranked_workers AS (
        SELECT
            ROW_NUMBER() OVER (ORDER BY salary DESC) AS rank,
            worker_id
        FROM
            worker
    )
    SELECT COUNT(*) INTO worker_count
    FROM ranked_workers
    WHERE rank = nth_highest_salary;

    RETURN worker_count;
END;
$$
LANGUAGE plpgsql;
SELECT get_worker_count_by_nth_highest_salary(4);
