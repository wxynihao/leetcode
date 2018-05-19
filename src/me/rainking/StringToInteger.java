package me.rainking;

/**
 * @author Rain
 * @date 2018/5/19
 */
public class StringToInteger {
    public static void main(String[] args) {
        StringToInteger o = new StringToInteger();

        String[] strArr = {"42", "   -42", "4193 with words",
                "words and 987", "-91283472332", "", "     "};

        for (String str : strArr) {
            System.out.println(o.myAtoi2(str));
        }

    }

    // - 45 0 48 - 57

    public int myAtoi(String str) {
        str = str.trim();
        int length = str.length();

        if (length < 1) {
            return 0;
        }

        boolean isPositive;
        int start;

        if (str.charAt(0) == '-') {
            isPositive = false;
            start = 1;
        } else if (str.charAt(0) == '+') {
            isPositive = true;
            start = 1;
        } else {
            isPositive = true;
            start = 0;
        }

        int sum = 0;
        for (int index = start; index < length; index++) {

            int intValue = str.charAt(index) - 48;

            if (intValue < 0 || 9 < intValue) {
                break;
            } else {
                sum = sum * 10 + intValue;
            }

            if (sum % 10 != intValue) {
                if (isPositive) {
                    return 2147483647;
                } else {
                    return -2147483648;
                }
            }
        }

        if (!isPositive) {
            sum = -sum;
        }

        return sum;
    }

    public int myAtoi2(String str) {
        return 0;
    }

}
