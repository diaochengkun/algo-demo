package com.ckd.leetcode.list;

import java.util.Arrays;

/**
 * @auther: dck
 * @Date: 2020/2/20
 * @Description:
 */
public class LeetCode_27_removeEle {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length==0){
            return 0;
        }
        int point = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val && point ==-1){
                point = i;
            }
            if (nums[i] != val && point !=-1){
                nums[point++] = nums[i];
            }
        }
        return point == -1 ? nums.length:point;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println("移除指定元前:"+ Arrays.toString(nums));
        LeetCode_27_removeEle removeEle = new LeetCode_27_removeEle();
        int removeEleNum = removeEle.removeElement(nums, -2);
        System.out.println("移除指定元后:"+ Arrays.toString(nums));
        System.out.println("元素个数"+removeEleNum);
    }
}
