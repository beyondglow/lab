package com.yifeng.lab.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 编号：1
 *
 * @author hui 给定 一个整数数组，nums和一个目标值target，请你在该数组中导出和为目标值的那两个整数 并返回他们的数组下标。
 *     <p>你可以假设每种输入只会对应一个答案，但是，数组中同一个元素不能使用两遍 示例： 给定 nums = [2, 7, 11, 15]，target=9 因为nums[0] +
 *     nums[1] = 2 + 7 = 9 所以返回[0,1]
 *     <p>解体思路： （1）同一个元素元素不能使用两遍;(2)需要返回下标 根据以上两点总结元素唯一需要找到下标（映射关系）用hashMap存储方式比较合适 步骤
 *     1）对数组进行循环，然后存入map集合中 2）使用containsKey方法判断key值为target-nums[i]的键值对是否存在 3）不存在，继续循环
 *     4）存在则将i和map.get(target-nums[i])获得的下标存入数组 5）立即跳出循环
 *     <p>时间复杂度：O(n)
 */
public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 18;
    int[] ts = twoSum(nums, target);
    List<Integer> resultList = new ArrayList<>(ts.length);
    for (Integer s : ts) {
      resultList.add(s);
    }
    System.out.println(resultList);
  }

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int[] ret = new int[2];
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            ret[0] = map.get(target - nums[i]);
            ret[1] = i;
            break;
        } else {
        	map.put(nums[i], i);
        }
    }
    return ret;
  }
}