package com.yifeng.lab.ec;

import java.util.Arrays;

/**
 * 
 * @author yh
 * 概述：
 * 归并排序
 * 是创建在归并操作上的一种有效的排序算法。
 * 算法是采用分治法（Divide and Conquer）的一个非常典型的应用，且各层分治递归可以同时进行。
 * 归并排序思路简单，速度仅次于快速排序，为稳定排序算法，一般用于对总体无序，但是各子项相对有序的数列。
 * 
 * 归并排序法时间复杂度、空间复杂度分析
 * 平均时间复杂度：O(nlogn)
 * 最佳时间复杂度：O(n)
 * 最差时间复杂度：O(nlogn)
 * 空间复杂度：O(n)
 * 排序方式：In-place
 * 稳定性：稳定
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {14,12,15,13,11,16};
		merge_sort(arr);
	}

	// 归并排序（Java-迭代版）
	public static void merge_sort(int[] arr) {
	    int len = arr.length;
	    int[] result = new int[len];
	    int block, start;

	    // 原版代码的迭代次数少了一次，没有考虑到奇数列数组的情况
	    for(block = 1; block < len*2; block *= 2) {
	        for(start = 0; start <len; start += 2 * block) {
	            int low = start;
	            int mid = (start + block) < len ? (start + block) : len;
	            int high = (start + 2 * block) < len ? (start + 2 * block) : len;
	            //两个块的起始下标及结束下标
	            int start1 = low, end1 = mid;
	            int start2 = mid, end2 = high;
	            //开始对两个block进行归并排序
	            while (start1 < end1 && start2 < end2) {
	            result[low++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
	            }
	            while(start1 < end1) {
	            result[low++] = arr[start1++];
	            }
	            while(start2 < end2) {
	            result[low++] = arr[start2++];
	            }
	        }
	    int[] temp = arr;
	    arr = result;
	    result = temp;
	    }
	    result = arr;     
	    System.out.println(Arrays.toString(result));
	}
}
