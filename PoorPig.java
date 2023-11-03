package com.dataStructures.LeetcodeDailyChallange;

import java.util.Scanner;

public class PoorPig {
    public static int poorPigs(int buckets, int m, int p) {
        int t = p/m + 1;
        // t^x >= buckets ==> x
        // <=> log(buckets) base t
        int x = 0;
        while (Math.pow(t, x) < buckets) x++;
        return x;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int buckets = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int result = poorPigs(buckets,m,p);
        System.out.println(result);
    }
}
