-- 有以下几个要点
-- 1. 最高工资可能多次出现，所以需要DISTINCT
-- 2. 当只有一条记录的时候，返回[]，这时需要使用IFNULL处理为[[NULL]]

SELECT IFNULL( ( SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT 1 OFFSET 1 ), NULL ) AS SecondHighestSalary




