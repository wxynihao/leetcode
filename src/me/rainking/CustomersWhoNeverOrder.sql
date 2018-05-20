-- 子查询实现
select Name as Customers from Customers where Id not in ( select CustomerId from Orders)

-- 连表查询实现
select Name as Customers from Customers left join Orders on Customers.id=Orders.CustomerId where Orders.id is null