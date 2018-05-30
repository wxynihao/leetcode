package me.rainking;

/**
 * @author Rain
 * @date 2018/5/30
 */
public class ReverseString {
    public static void main(String[] args) {
        ReverseString o = new ReverseString();

        String[] strArr = {"hello"};
        for (String str : strArr) {
            System.out.println(o.reverseString2(str));
        }
    }

    /**
     * 版本一
     */
    public String reverseString(String s) {
        int length = s.length();
        char[] chArr = new char[length];

        for (int i = length - 1, j = 0; 0 <= i; i--, j++) {
            chArr[j] = s.charAt(i);
        }

        return new String(chArr);
    }

    /**
     * 版本二
     */
    public String reverseString2(String s) {
        int j = s.length() - 1;
        int i = 0;
        char[] chArr = s.toCharArray();
        char temp;

        while (i < j) {
            temp = chArr[i];
            chArr[i++] = chArr[j];
            chArr[j--] = temp;
        }

        return new String(chArr);
    }

}
