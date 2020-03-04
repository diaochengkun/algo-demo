package com.ckd.sort;

import java.util.Random;

/**
 * @auther: dck
 * @Date: 2020/3/3
 * @Description:
 */
public class ArrayUtils {

    public static int[] toArrays(int size){
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
        }
        return nums;
    }
}
