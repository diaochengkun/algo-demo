package com.ckd.sort;

import java.util.Arrays;

/**
 * @auther: dck
 * @Date: 2020/3/4
 * @Description:
 */
public class SelectSort {

    public void  sort(int[] nums){
        if (nums == null || nums.length <=1){
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j= i+1;j<nums.length;j++){
                if (nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] =  tmp;
        }
    }

}
