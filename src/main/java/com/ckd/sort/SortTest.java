package com.ckd.sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

    private static Sort sort = new BubbleSort();

    public static int[] generateNums(int numLength){
        Random random = new Random();
        int[] nums = new int[numLength];
        for (int i=0;i<numLength;i++){
            nums[i] = random.nextInt(numLength);
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = generateNums(10);
        System.out.println("before sort: "+Arrays.toString(nums));
        sort.sort(nums);
        System.out.println("after sort: "+Arrays.toString(nums));
    }
}
