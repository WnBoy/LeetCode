package com.wnlife.array;

import java.util.*;

/**
 * 合并区间
 *
 * @author Wnlife
 * @create 2020-09-02 23:18
 */
public class MergeInterval {
    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {2, 3}};
        int[][] merge = new MergeInterval().merge(arr);
        Arrays.stream(merge).forEach((a) -> {
            System.out.println(Arrays.toString(a));
        });
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            return o1[0] - o2[0];
        });

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (!stack.isEmpty() && intervals[i][0] <= stack.peek()) {
                    if (intervals[i][1] > stack.peek()) {
                        stack.pop();
                        stack.push(intervals[i][1]);
                    }
                    continue;
                }
                stack.push(intervals[i][0]);
                stack.push(intervals[i][1]);
            }
        }
        int[][] arr = new int[stack.size() / 2][2];
        int i = stack.size() / 2 - 1;
        while (i >= 0 && !stack.isEmpty()) {
            arr[i][1] = stack.pop();
            arr[i--][0] = stack.pop();
        }
        return arr;
    }
}
