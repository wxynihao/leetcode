package me.rainking;

/**
 * @author Rain
 * @description
 * @date 2018/5/14
 */
public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        String[] strArr = {"III", "IV", "IX", "LVIII", "MCMXCIV"};

        for (String str : strArr)
            System.out.println(obj.romanToInt(str));
    }


    /**
     * 不开心不想写代码版
     */
    public int romanToInt(String s) {
        int[] chArr = new int['Y'];
        chArr['I'] = 1;
        chArr['V'] = 5;
        chArr['X'] = 10;
        chArr['L'] = 50;
        chArr['C'] = 100;
        chArr['D'] = 500;
        chArr['M'] = 1000;
        int sum = 0;
        char preCh;
        for (char ch : s.toCharArray()) {
            sum += chArr[ch];
        }
        if (s.contains("IV") || s.contains("IX"))
            sum -= 2;
        if (s.contains("XL") || s.contains("XC"))
            sum -= 20;
        if (s.contains("CD") || s.contains("CM"))
            sum -= 200;
        return sum;
    }

    /**
     * 生活还得继续版
     */
    public int romanToInt2(String s) {
        int result = 0;
        int prev = 1001;

        for (char c : s.toCharArray()) {
            int curr = 0;
            switch (c) {
                case 'I':
                    curr = 1;
                    break;
                case 'V':
                    curr = 5;
                    break;
                case 'X':
                    curr = 10;
                    break;
                case 'L':
                    curr = 50;
                    break;
                case 'C':
                    curr = 100;
                    break;
                case 'D':
                    curr = 500;
                    break;
                case 'M':
                    curr = 1000;
                    break;
            }

            if (prev < curr) {
                result = result - 2 * prev;
            }
            result += curr;
            prev = curr;
        }

        return result;
    }

}
