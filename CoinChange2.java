package com.dataStructures.LeetcodeDailyChallange;

public class CoinChange2 {
    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (final int coin : coins)
            for (int i = coin; i <= amount; ++i)
                dp[i] += dp[i - coin];

        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 5;
        System.out.println(change(amount,coins));
    }
}
