package com.ckd.sort;

/**
 * 冒泡排序
 * 最好时间复杂：O(1)
 * 最坏时间复杂度：O(n^2)
 * 平均时间复杂度：O(n^2)
 */
public class BubbleSort implements Sort{

    @Override
    public void sort(int[] nums) {
        if (nums == null || nums.length <= 1){
            return;
        }
        //第一层控制排序次数
        for (int i=0;i<nums.length;i++){
            //提前退出冒泡排序标志位
            boolean swapSingleSort = false;
            //第二轮控制每轮比较次数
            for (int j=0;j<nums.length-i-1;j++){
                if (nums[j] > nums[j+1]){
                    swapSingleSort = true;
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
            if (!swapSingleSort){
                break;
            }
        }
    }
}
