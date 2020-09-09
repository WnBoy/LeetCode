package com.wnlife.beginner;

import java.util.Arrays;

/**
 * @author Wnlife
 * @create 2020-09-09 23:30
 */
public class LC_01 {
    public static void main(String[] args) {
        int[] num={2, 7, 11, 15};
        int[] ints = twoSum(num,9);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] reqs = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            int temp=target-nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(temp==nums[j]){
                    reqs[0]=i;
                    reqs[1]=j;
                    break;
                }

            }
        }
        return reqs;
    }
}
