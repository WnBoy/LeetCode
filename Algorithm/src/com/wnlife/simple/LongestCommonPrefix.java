package com.wnlife.simple;

import java.util.Arrays;

/**
 * @author Wnlife
 * @create 2020-06-01 21:42
 * 最长公共前缀
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len <= 0) return "";
        if (len == 1) return strs[0];
        StringBuilder sb = new StringBuilder("");
        Integer min = Arrays.stream(strs).map((s) -> s.length()).min(Integer::compareTo).get();
        tag:
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < len-1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    break tag;
                }
            }
            sb.append(strs[0].charAt(i));
        }

        return sb.toString();
    }

    public static String longestCommonPrefix2(String[] strs) {
        if(strs.length==0)return "";
        String preString=strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(preString)!=0){
                preString=preString.substring(0,preString.length()-1);
                if(preString.isEmpty())return "";
            }
        }
        return preString;
    }

}
