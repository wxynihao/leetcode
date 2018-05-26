package me.rainking;

/**
 * @author Rain
 * @date 2018/5/26
 */
public class ArrayPartitionI {
    public static void main(String[] args) {
        ArrayPartitionI o = new ArrayPartitionI();

        int[][] numsArr = {{1, 4, 3, 2}, {-470, 66, -4835, -5623}};

        for (int[] nums : numsArr) {
            System.out.println(o.arrayPairSum2(nums));
        }
    }


    /**
     * 方法一： 使用快速排序，排序后获取基数位数字
     */
    public int arrayPairSum(int[] nums) {

        quickSort(nums);

        int index = 0;
        int result = 0;
        for (int num : nums) {
            if (index % 2 == 0) {
                result += num;
            }
            index++;
        }

        return result;
    }

    /**
     * 快速排序
     *
     * @param a
     * @param low
     * @param hight
     */
    private static void sort(int a[], int low, int hight) {
        int i, j, index;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = a[i];
        while (i < j) {
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];
            while (i < j && a[i] < index)
                i++;
            if (i < j)
                a[j--] = a[i];
        }
        a[i] = index;
        sort(a, low, i - 1);
        sort(a, i + 1, hight);

    }

    private static void quickSort(int a[]) {
        sort(a, 0, a.length - 1);
    }

    /**
     * 方法二：使用数组下标指代数值本身，存放的值指代该数值出现的次数，
     * 顺序遍历，每两个数字取前面一个。
     * 万万没想到，这个方法在这个场景中居然效率这么高。
     */
    public int arrayPairSum2(int[] nums) {
        int res = 0;
        int[] count = new int[20001];
        for (int i : nums) {
            count[i + 10000]++;
        }

        boolean odd = true;
        for (int i = 0; i < 20001; i++) {
            while (count[i] > 0) {
                if (odd) {
                    res += i - 10000;
                }
                odd = !odd;
                count[i]--;
            }
        }

        return res;
    }
}
