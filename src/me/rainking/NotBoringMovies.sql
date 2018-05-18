-- 字符串匹配可以使用 != 或者 not like
-- 取模可以使用 % 或者 MOD

-- 方式1
SELECT
	id,
	movie,
	description,
	rating 
FROM
	cinema 
WHERE
	description != 'boring' 
	AND id % 2 = 1 
ORDER BY
	rating DESC

-- 方式2
SELECT
	id,
	movie,
	description,
	rating
FROM
	cinema
WHERE
	description NOT LIKE 'boring'
	AND id MOD 2 = 1
ORDER BY
	rating DESC