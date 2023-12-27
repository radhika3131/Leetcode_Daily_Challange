package com.dataStructures.LeetcodeDailyChallange;

import java.util.Scanner;

public class MinTimeToMakeRopeColorful {
    public static int minCost(String colors, int[] neededTime) {
        int start = 0;
        int end =0;
        int totaltime = 0;
        int n = colors.length();
        while(start<n && end < n)
        {
            int maxtime = 0;
            int grouptotal = 0;
            while(end < n && colors.charAt(start) == colors.charAt(end))
            {
                maxtime = Math.max(maxtime , neededTime[end]);
                grouptotal += neededTime[end];
                end++;
            }

            totaltime += (grouptotal - maxtime);
            start = end ;


        }
        return totaltime;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String colors = sc.nextLine();
        int n = sc.nextInt();
        int[] neededTime = new int[n];

        for(int i = 0; i< n ; i++)
        {
            neededTime[i] = sc.nextInt();
        }
        int result = minCost(colors,neededTime);
        System.out.println(result);
    }
}
