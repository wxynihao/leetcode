package me.rainking;

/**
 * @author Rain
 * @description 这题是对二进制表示与位运算的考察。
 * @date 2018/5/17
 */
public class NumberComplement {
    public static void main(String[] args) {
        NumberComplement o = new NumberComplement();
        int[] intArr = {5, 1};
        for (int i : intArr) {
            System.out.println(o.findComplement(i));
        }
    }

    public int findComplement(int num) {
        //得出与num二进制形式等长的111……1
        int re = (1 << binaryLength(num)) - 1;
        //与1异或可将0、1互换
        return num ^ re;
    }

    /**
     * 计算正整数的二进制表示的长度
     * @param num 正整数
     * @return 二进制表示的长度，如5，二进制101，长度为3
     */
    private int binaryLength(int num) {
        int result = 0;
        while (num != 0) {
            num = num >> 1;
            result++;
        }
        return result;
    }

}
