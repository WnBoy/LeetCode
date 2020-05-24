package com.wnlife.simple;

/**
 * @author Wnlife
 * @create 2020-05-24 8:24
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber number = new PalindromeNumber();
        boolean palindrome = number.isPalindrome(10);
        System.out.println(palindrome);
    }

    /**
     * 自己的暴力解法
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        StringBuilder sb=new StringBuilder(Integer.toString(x));
        sb.reverse();
        return sb.toString().equals(Integer.toString(x));
    }


}
