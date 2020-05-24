package com.wnlife.simple;

/**
 * @author Wnlife
 * @create 2020-05-24 8:24
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber number = new PalindromeNumber();
        boolean palindrome = number.isPalindrome2(121);
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

    /**
     * 记录一下
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        if(x==0)return true;
        if(x<0||x%10==0){
            return false;
        }
        int reverse=0;
        while(x>reverse){
            reverse=reverse*10+x%10;
            x/=10;
        }
        return x==reverse||x==reverse/10;
    }
}
