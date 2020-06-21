package com.wnlife.simple;

/**
 * @author Wnlife
 * @create 2020-06-13 20:33
 *
 * 爬楼梯问题
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        int stairs = climbStairs(3);
        System.out.println(stairs);
    }

    public static int climbStairs(int n) {
        if(n==1)return 1;
        if (n==2)return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }

    public static int climbStairs2(int n) {
        int p=0,q=0,r=1;
        for (int i = 1; i <=n ; i++) {
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
