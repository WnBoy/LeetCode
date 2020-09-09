package com.wnlife.simple;

import java.util.Arrays;
import java.util.List;

/**
 * @author Wnlife
 * @create 2020-06-25 7:42
 */
public class WordBreak {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        String s="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        boolean b = new WordBreak().wordBreak(s, stringList);
        System.out.println(b);
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        for (String str : wordDict) {
            if (s.startsWith(str)) {
                String value = String.copyValueOf(s.toCharArray(), str.length(), s.length()-str.length());
                if (!value.isEmpty())
                    if (wordBreak(value, wordDict))
                        return true;
                    else
                        continue;
                else
                    return true;
            }
        }
        return false;
    }
}
