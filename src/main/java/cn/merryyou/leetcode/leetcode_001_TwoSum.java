package cn.merryyou.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2017/2/10 0010.
 *
 * @author zlf
 * @since 1.0
 * 题意：
 * 在数组中找出两个数相加为target，并返回这两个数的索引
 * 要求：
 * 1.索引小的在前
 * 2.找出一组即可
 */
public class leetcode_001_TwoSum {
    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 11, 15};
        int[] arrayNew = twoSum(array, 9);
        for (int i : arrayNew) {
            System.out.println(i + "");
        }
        int[] arrayNew1 = twoSum1(array, 9);
        for (int i : arrayNew1) {
            System.out.println(i + "");
        }
    }

    /**
     * 思路一：双重循环
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        long start = System.currentTimeMillis();
        int[] intArr = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    intArr = new int[]{i, j};
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("end - start: = "+(end-start));
        return intArr;
    }

    /**
     * 大神思路
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
