package com.wnlife.simple;

import java.math.BigInteger;

/**
 * @author Wnlife
 * @create 2020-05-21 21:51
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int reverse = reverse(-2147483648);
        System.out.println(reverse);
    }

    //翻转
    public static  int reverse(int x) {
        if(x==0)
            return 0;
        String s = Integer.toString(x);
        String c="";
        if(s.charAt(0)=='-'){
            s=s.substring(1);
            c="-";
        }
        StringBuilder sb=new StringBuilder(s);
        String ss = sb.reverse().toString();
        if("-".equals(c)){
            //负数
            ss=c+ss;
            if(judge(ss)){
                return 0;
            }
            return Integer.parseInt(ss);
        }
        int bengin=0;
        while(bengin<=ss.length()&&ss.charAt(bengin)=='0'){
            bengin++;
        }
        ss=ss.substring(bengin);
        if(judge(ss)){
            return 0;
        }
        return Integer.parseInt(ss);
    }

    public static boolean judge(String ss){
        BigInteger bigInteger = new BigInteger(ss);
        if((bigInteger.compareTo(new BigInteger(Integer.toString(Integer.MIN_VALUE)))==-1)||
                (bigInteger.compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE)))==1)){
            return true;
        }
        return false;
    }
}
