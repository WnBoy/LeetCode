package com.wnlife.string;

/**
 * @author Wnlife
 * @create 2020-09-14 23:39
 */
public class LC_28 {
    public int strStr(String haystack, String needle) {
        if(needle==null)
            return 0;
        return haystack.indexOf(needle);
    }
}
