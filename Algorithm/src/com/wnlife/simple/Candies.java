package com.wnlife.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author Wnlife
 * @create 2020-06-01 20:54
 *
 */
public class Candies {

    public static void main(String[] args) {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> kids = kidsWithCandies2(candies, extraCandies);
        System.out.println(kids);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    public static List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList();
        int max = Arrays.stream(candies).max().getAsInt();
        Arrays.stream(candies).forEach((c) -> {
            if (c + extraCandies > max)
                list.add(true);
            else
                list.add(false);
        });

        return list;
    }

}
