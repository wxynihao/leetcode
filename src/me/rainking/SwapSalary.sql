-- 627. Swap Salary
-- 拼运气，未达到90%以上时，多次尝试

-- # 常规，单行效率更高
UPDATE salary SET sex=CASE WHEN sex='f' THEN 'm' WHEN sex='m' THEN 'f' END

-- # 可能有更高效率的写法
UPDATE salary SET sex=CASE WHEN sex='f' THEN 'm' ELSE 'f' END

-- # 看上去很高端，其实也是拼运气的写法
-- # 利用异或实现字母a与字母f之间的互转，异或所需值为字母之间异或值， 即 a^f = 11
UPDATE salary SET sex = CHAR ( ASCII( sex ) ^ 11 );