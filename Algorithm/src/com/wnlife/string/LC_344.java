package com.wnlife.string;

import java.util.Arrays;

/**
 * @author Wnlife
 * @create 2020-09-14 23:54
 */
public class LC_344 {
    public static void main(String[] args) {
        char[]s={'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
