# 日拱一卒之LeetCode

## 1. 题库
[LeetCode](https://leetcode.com/problemset/all/)

[LeetCode-CN](https://leetcode-cn.com/problemset/all/)

## 2. 原则
通过，且运行时优于90%的其他java方案。

## 3. 方案

1. [001. Two Sum](src/me/rainking/TwoSum.java)

1. [002. Add Two Numbers](src/me/rainking/AddTwoNumbers.java)

1. [003. Longest Substring Without Repeating Characters](src/me/rainking/LongestSubstringWithoutRepeatingCharacters.java)

1. [006. ZigZag Conversion](src/me/rainking/ZigZagConversion.java)

1. [007. Reverse Integer](src/me/rainking/ReverseInteger.java)

1. [008. String to Integer (atoi)](src/me/rainking/StringToInteger.java) 待优化

1. [009. Palindrome Number](src/me/rainking/PalindromeNumber.java)

1. [013. Roman to Integer](src/me/rainking/RomanToInteger.java)

1. [014. Longest Common Prefix](src/me/rainking/LongestCommonPrefix.java)

1. [020. Valid Parentheses](src/me/rainking/ValidParentheses.java)

1. [151. Reverse Words in a String](src/me/rainking/ReverseInteger.java)

1. [175. Combine Two Tables](src/me/rainking/CombineTwoTables.sql) 运气有点好，188ms，一个遥遥领先的100%(滑稽)

1. [176. Second Highest Salary](src/me/rainking/SecondHighestSalary.sql) 

1. [182. Duplicate Emails](src/me/rainking/DuplicateEmails.sql) 

1. [183. Customers Who Never Order](src/me/rainking/CustomersWhoNeverOrder.sql) 

1. [461. Hamming Distance](src/me/rainking/HammingDistance.java)

1. [476. Number Complement](src/me/rainking/NumberComplement.java)

1. [535. Encode and Decode TinyURL](src/me/rainking/EncodeAndDecodeTinyURL.java)

1. [561. Array Partition I](src/me/rainking/ArrayPartitionI.java)

1. [595. Big Countries](src/me/rainking/BigCountries.sql)

1. [596. Classes More Than 5 Students](src/me/rainking/ClassesMoreThan5Students.sql)待优化（滑稽）

1. [620. Not Boring Movies](src/me/rainking/NotBoringMovies.sql)

1. [627. Swap Salary](src/me/rainking/SwapSalary.sql)

1. [657. Judge Route Circle](src/me/rainking/JudgeRouteCircle.java) 第二个100%成就达成

1. [728. Self Dividing Numbers](src/me/rainking/SelfDividingNumbers.java) 

1. [771. Jewels and Stones](src/me/rainking/JewelsAndStones.java)

1. [804. Unique Morse Code Words](src/me/rainking/UniqueMorseCodeWords.java) 第一个100%成就达成

1. [807. Max Increase to Keep City Skyline](src/me/rainking/MaxIncreaseToKeepCitySkyline.java)

1. [832. Flipping an Image](src/me/rainking/FlippingAnImage.java)

## 4. 对性能有影响的因素
### 4.1 字符串
1. 在涉及大量字符串拼接的操作时StringBuilder的效率远远优于String。

1. StringBuilder的append效率远远优于String的+。

### 4.1 数值
1. 位运算效率远高于算术运算

### 4.1 格式
1. 删除 if/for 的非必需大括号可提高执行效率(为了可维护性还是加上吧)

1. 长数组分行会影响效率

### 4.1 数据结构
1. 适时引入引入HashXxx可以显著提升效率

## 5. Trick

1. 利用数组下标和ASCII码记录字符，见[003. Longest Substring Without Repeating Characters](src/me/rainking/LongestSubstringWithoutRepeatingCharacters.java)

1. 利用数组下标记录数值，其值记录次数，见[561. Array Partition I](src/me/rainking/ArrayPartitionI.java)

1. 利用位运算高效计算二进制中1的数量，见[461. Hamming Distance](src/me/rainking/HammingDistance.java)

1. 利用异或运算及char的整型特性，实现字符之间的互相转换，见[627. Swap Salary](src/me/rainking/SwapSalary.sql)
