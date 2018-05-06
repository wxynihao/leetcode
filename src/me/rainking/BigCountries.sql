# 595. Big Countries
# 很简单，没有操作空间，超过90%全凭运气

SELECT name,population,area FROM world WHERE area > 3000000 OR population > 25000000