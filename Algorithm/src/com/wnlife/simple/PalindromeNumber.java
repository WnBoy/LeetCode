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
        //将数的后一半翻转，和前一半做对比
        while(x>reverse){
            reverse=reverse*10+x%10;
            x/=10;
        }
        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x==reverse||x==reverse/10;
    }
}
