package com.wnlife.array;

/**
 * @author Wnlife
 * @create 2020-09-01 0:07
 */
public class InsertPosition {
    public static void main(String[] args) {
        int[] num={1,3,5,6};
        System.out.println(searchInsert(num,5));
    }
    public static int searchInsert(int[] nums, int target) {
        if(target<nums[0])return 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == target) return i;
            if (nums[i] < target && target < nums[i + 1])
                return i + 1;
        }
        if(target==nums[nums.length-1])
            return nums.length-1;
        return nums.length;
    }
}
