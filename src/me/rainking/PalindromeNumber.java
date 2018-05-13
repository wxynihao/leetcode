package me.rainking;

/**
 * @author Rain
 * @description 简单题，但是如果需要返回回文后的整数，就需要考虑溢出
 *              ps：忽略掉运行时吧，最前面的几种解法思路完全一样
 * @date 2018/5/13
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber o = new PalindromeNumber();
        System.out.println(o.isPalindrome(121));
        System.out.println(o.isPalindrome(-121));
        System.out.println(o.isPalindrome(10))
    }

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int temp = x;
        int num = 0;
        while (temp != 0) {
            num = num * 10 + temp % 10;
            temp = temp / 10;
        }
        if (num == x)
            return true;
        else
            return false;
    }



}
