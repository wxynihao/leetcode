--  方法一
SELECT
	class
FROM
	( SELECT DISTINCT ( student ) AS student, class FROM courses ) t
GROUP BY
	class
HAVING
	count( * ) >4

--  方法二
SELECT
	class
FROM
	( SELECT class, count( DISTINCT student ) AS count FROM courses GROUP BY class ) t
WHERE
	t.count > 4

-- 方法三
SELECT
	class
FROM
	courses
GROUP BY
	class
HAVING
	COUNT( DISTINCT ( student ) ) >4