package me.rainking;

/**
 * @author Rain
 * @description 461. 本题重点在于掌握异或运算和计算数字的二进制表示中有多少个“1”
 * @date 2018/5/8
 */
public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance obj = new HammingDistance();

        System.out.println(obj.hammingDistance(1, 4));
    }

    /**
     * 一般解法
     * 异或可以将相同位置0，不同位置1
     * 再使用十进制转二进制的过程，可得出有多少个1
     */
    public int hammingDistance(int x, int y) {
        int t = x ^ y;
        int count = 0;
        while (t != 0) {
            if (t % 2 == 1)
                count++;
            t = t / 2;
        }
        return count;
    }

    /**
     * 效率更高的解法
     * 效率更高的原因是使用高效的位运算代替了相对较慢的算术运算
     * 把x的二进制位表示为
     * x=a[n-1]a[n-2]...a[0]。
     * 按从低位到高位的顺序，不失一般性，假设x的第i位为第一个为1的二进制位，即：ai=1。此时有：
     * (x) = a[n-1]a[n-2]...a[i]+1100...0              <1>
     * (x-1) = a[n-1]a[n-2]...a[i]+1011...1              <2>
     * 很明显，从式1和式2可以得出，在第一次 x & (x-1) 后：
     * x=a[n-1]a[n-2]...a[i]+1000...0
     * 之后重复同样操作，直到x的二进制位中没有1为止
     * 从上面可以看出，每执行过一次 x & (x-1) 后，都会将x的二进制位中为1的最低位的值变为0，并记数加1。
     */
    public int hammingDistance2(int x, int y) {
        int t = x ^ y;
        int count = 0;
        while (t != 0) {
            t = t & (t - 1);
            count++;
        }
        return count;
    }


}
