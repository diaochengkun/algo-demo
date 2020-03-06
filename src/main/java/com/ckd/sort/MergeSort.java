package com.ckd.sort;

import java.util.Arrays;

/**
 * @auther: dck
 * @Date: 2020/3/6
 * @Description:
 */
public class MergeSort {
    public void sort(int[] nums){
        if (nums == null || nums.length <=1){
            return;
        }
        sortHelper(nums,0,nums.length-1);
    }

    private void sortHelper(int[] nums,int start,int end){
       if (start >= end){
           return;
       }
       int middle = start + (end -start)/2;
       sortHelper(nums,start,middle);
       sortHelper(nums,middle+1,end);
       merge(nums,start,middle,middle+1,end);
    }

    private void merge(int[] nums, int s1, int e1, int s2, int e2) {
        int[] tmp = new int[e1-s1+1 + e2-s2+1];
        int i = s1,j=s2,k=0;
        while (i<=e1 && j<=e2){
            if (nums[i] <= nums[j]){
                tmp[k++] = nums[i];
                i++;
            }else {
                tmp[k++] = nums[j];
                j++;
            }
        }
        while (i<=e1){
            tmp[k++] = nums[i++];
        }
        while (j<=e2){
            tmp[k++] = nums[j++];
        }

        for (int l = 0;l<tmp.length;l++){
            nums[s1+l] = tmp[l];
        }
    }

    public static void main(String[] args) {
        int[] nums = ArrayUtils.toArrays(20);
        System.out.println(Arrays.toString(nums));
        MergeSort sort = new MergeSort();
        sort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
