package com.wnlife.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Wnlife
 * @create 2020-09-14 23:24
 *
 * 翻转字符串里的单词
 */
public class OJ_151 {
    public String reverseWords(String s) {
        String trim = s.trim();
        List<String> list = Arrays.asList(trim.split("\\s+"));
        Collections.reverse(list);
        return String.join(" ", list);
    }
}
