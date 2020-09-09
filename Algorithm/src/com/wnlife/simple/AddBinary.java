package com.wnlife.simple;

/**
 * @author Wnlife
 * @create 2020-06-23 15:20
 */
public class AddBinary {

    public static void main(String[] args) {
        String s = new AddBinary().addBinary2("1010", "1011");
        System.out.println(s);

    }

    public String addBinary(String a, String b) {
        int num_a=Integer.parseInt(a,2);
        int num_b=Integer.parseInt(b,2);

        return Integer.toBinaryString(num_a+num_b);
    }

    public String addBinary2(String a, String b) {
        int x=Integer.parseInt(a,2);
        int y=Integer.parseInt(b,2);
        while (y!=0){
            int answer = x ^ y;
            int carry = (x & y) << 1;
            x=answer;
            y=carry;
        }
        return Integer.toBinaryString(x);
    }
}
