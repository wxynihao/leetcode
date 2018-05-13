-- 方法1 注意t1必须存在
SELECT
	Email 
FROM
	( SELECT Email, count( * ) AS count FROM Person GROUP BY Email ) t1
WHERE
	count >1;

-- 方法2
SELECT
	Email
FROM
	Person
GROUP BY
	Email
HAVING
	count( * ) > 1;