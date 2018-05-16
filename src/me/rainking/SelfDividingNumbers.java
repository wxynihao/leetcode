package me.rainking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rain
 * @description
 * @date 2018/5/16
 */
public class SelfDividingNumbers {
    public static void main(String[] args) {
        SelfDividingNumbers o = new SelfDividingNumbers();

        System.out.println(o.selfDividingNumbers(1, 22));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> resultList = new ArrayList<>(16);
        for (int pos = left; pos < right + 1; pos++) {
            if (isSelfDividingNumber(pos)) {
                resultList.add(pos);
            }

        }
        return resultList;
    }

    /**
     * 典型的一顿操作猛如虎，一看战绩零杠五
     * 效率并不理想
     */
    boolean isSelfDividingNumber(int num) {
        int[] intArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int t = num;
        while (t != 0) {
            int endNum = t % 10;
            if (endNum == 0) {
                return false;
            }
            intArr[endNum] = 1;
            t /= 10;
        }
        for (int i = 1; i < 10; i++) {
            if (intArr[i] == 1 && num % i != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 根据子除数定义的解决方式
     */
    private boolean isSelfDividingNumber2(int num) {
        int inputNumber = num;
        while (inputNumber >= 10) {
            int digit = inputNumber % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            inputNumber /= 10;
        }
        if (num % inputNumber != 0) {
            return false;
        }
        return true;
    }
}
