package com.dataStructures.LeetcodeDailyChallange;

import java.util.Arrays;

public class MaximumNumberofCoins {
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum =0;
        int i = piles.length - 2;
        int j = 0;
        while(j++ < piles.length/3)
        {
            sum = sum + piles[i];
            i -= 2;

        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,1,2,3,4};
        int ans=  maxCoins(arr);
        System.out.println(ans);
    }
}
