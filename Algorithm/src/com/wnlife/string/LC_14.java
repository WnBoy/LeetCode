package com.wnlife.string;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Wnlife
 * @create 2020-09-13 22:24
 */
public class LC_14 {

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
            return "";
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String temp = strs[0];
        while (temp.length() > 0) {
            boolean flag=true;
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(temp)) {
                    flag=false;
                    break;
                }
            }
            if (flag)return temp;
            temp = temp.substring(0, temp.length() - 1);
        }
        return "";
    }
}
