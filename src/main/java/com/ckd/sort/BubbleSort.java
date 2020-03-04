package com.ckd.sort;

import java.util.Arrays;

/**
 * @auther: dck
 * @Date: 2020/3/3
 * @Description:
 * 冒泡排序
 */
public class BubbleSort {

    public void sort(int[] nums){
        if (nums == null || nums.length ==0){
            return;
        }
        //外层控制冒泡次数
        for(int i=0;i<nums.length;i++){
            //是否排好序标志
            boolean flag = false;
            //内层控制每次冒泡从头开始比较
            for (int j=0;j<nums.length-i-1;j++){
                if (nums[j] > nums[j+1]){
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = ArrayUtils.toArrays(20);
        System.out.println(Arrays.toString(nums));
        BubbleSort sort = new BubbleSort();
        sort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
