# 日拱一卒之LeetCode


## 1. 题库
[LeetCode](https://leetcode.com/problemset/all/)

[LeetCode-CN](https://leetcode-cn.com/problemset/all/)

## 2. 原则
通过，且运行时优于90%的其他java方案。

## 3. 方案

* [001. Two Sum](src/me/rainking/TwoSum.java)

* [002. Add Two Numbers](src/me/rainking/AddTwoNumbers.java)

* [003. Longest Substring Without Repeating Characters](src/me/rainking/LongestSubstringWithoutRepeatingCharacters.java)

* [006. ZigZag Conversion](src/me/rainking/ZigZagConversion.java)

* [007. Reverse Integer](src/me/rainking/ReverseInteger.java)

* [077. Jewels and Stones](src/me/rainking/JewelsAndStones.java)

* [175. Combine Two Tables](src/me/rainking/CombineTwoTables.sql) 运气有点好，188ms，一个遥遥领先的100%(滑稽)

* [176. Second Highest Salary](src/me/rainking/SecondHighestSalary.sql) 

* [461. Hamming Distance](src/me/rainking/HammingDistance.java)

* [535. Encode and Decode TinyURL](src/me/rainking/EncodeAndDecodeTinyURL.java)

* [595. Big Countries](src/me/rainking/BigCountries.sql)

* [627. Swap Salary](src/me/rainking/SwapSalary.sql)

* [804. Unique Morse Code Words](src/me/rainking/UniqueMorseCodeWords.java) 第一个100%成就达成

* [807. Max Increase to Keep City Skyline](src/me/rainking/MaxIncreaseToKeepCitySkyline.java)

## 4. 对性能有影响的因素
### 4.1 字符串
* 在涉及大量字符串拼接的操作时StringBuilder的效率远远优于String。

### 4.1 数值
* 位运算效率远高于算术运算

### 4.1 格式
* 删除 if/for 的非必需大括号可提高执行效率(为了可维护性还是加上吧)

* 长数组分行会影响效率

### 4.1 数据结构
* 适时引入引入HashXxx可以显著提升效率
