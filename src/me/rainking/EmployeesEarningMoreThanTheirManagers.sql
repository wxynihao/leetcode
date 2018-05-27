SELECT
	t1.NAME AS Employee
FROM
	employee t1
	INNER JOIN employee t2 ON t1.ManagerId = t2.Id
WHERE
	t1.Salary > t2.Salary