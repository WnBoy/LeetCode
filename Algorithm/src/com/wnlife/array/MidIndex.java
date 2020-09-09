package com.wnlife.array;

import java.util.Arrays;

/**
 * @author Wnlife
 * @create 2020-08-31 23:39
 */
public class MidIndex {
    public static void main(String[] args) {
        int nums[] = {-1,-1,-1,0,1,1};
        int index = pivotIndex(nums);
        System.out.println(index);
    }

    public static int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (temp == (sum - nums[i] - temp)) {
                return i;
            }
            temp += nums[i +1];
        }
        return -1;
    }
}
