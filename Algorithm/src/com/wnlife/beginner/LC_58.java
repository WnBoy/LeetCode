package com.wnlife.beginner;

/**
 * @author Wnlife
 * @create 2020-09-09 23:51
 */
public class LC_58 {
    public static void main(String[] args) {
        int string = new LC_58().lengthOfLastWord("    day");
        System.out.println(string);
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() < 1) return 0;
        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }
}
