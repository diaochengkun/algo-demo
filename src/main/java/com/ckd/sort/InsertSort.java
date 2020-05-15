package com.ckd.sort;

import java.util.Arrays;

/**
 * @auther: dck
 * @Date: 2020/3/3
 * @Description:
 * 插入排序
 */
public class InsertSort {

    public  void  sort(int[] nums){
        if (nums == null || nums.length <=1){
            return;
        }
        for (int i=1;i<nums.length;i++){
            int ele = nums[i];
            int j = i-1;
            while (j>=0 && ele < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = ele;
        }
    }
}
