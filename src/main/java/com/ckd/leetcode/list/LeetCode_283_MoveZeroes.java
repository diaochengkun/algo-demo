package com.ckd.leetcode.list;

import java.util.Arrays;

/**
 * @auther: dck
 * @Date: 2020/2/19
 * @Description:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class LeetCode_283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <=1){
            return;
        }
        int zeroPoint = 0;
        for (int noneZeroPoint = 0; noneZeroPoint < nums.length; noneZeroPoint++) {
            if (nums[noneZeroPoint] !=0){
                int tmp = nums[zeroPoint];
                nums[zeroPoint++] = nums[noneZeroPoint];
                nums[noneZeroPoint] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        LeetCode_283_MoveZeroes moveZeroes = new LeetCode_283_MoveZeroes();
        moveZeroes.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
