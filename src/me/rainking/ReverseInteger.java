package me.rainking;

/**
 * @author Rain
 * @description 7.本题的难点在于意识到int值在反转之后可能溢出的问题
 * @date 2018/5/3
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-120));
        System.out.println(reverse(1000000009));
    }

    public static int reverse(int x) {
        int result = 0;
        int temp;
        while (x != 0) {
            temp = x % 10;
            result = result * 10 + temp;
            //通过检查末位是否为新增的数字确定是否溢出
            if (result % 10 != temp) {
                return 0;
            }
            x = x / 10;
        }
        return result;
    }
}
