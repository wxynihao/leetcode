package me.rainking;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rain
 * @description 1. 最容易想到的是双循环了，注意break只能跳出当前循环，虽然结果也对，但是在找到结果后仍然会继续，
 * 所以要采用带标签的break。
 * TreeMap在本题并无优势。
 * ps:目前效率最高的实现，是一个闲的蛋疼的实现
 * @date 2018/5/7
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum.twoSum(nums, target);
        System.out.printf("[%d,%d]", result[0], result[1]);

    }

    //最容易想到版
    public int[] twoSum2(int[] nums, int target) {

        int[] result = new int[2];
        int length = nums.length;
        loop:
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break loop;
                }
            }
        }
        return result;
    }

    //效率更高版，运气好的时候7ms
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    //和上面一样，看着简单版
    public int[] twoSumSimple(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i]))
                return new int[]{numMap.get(target - nums[i]), i};
            else
                numMap.put(nums[i], i);
        }
        return null;
    }
}

