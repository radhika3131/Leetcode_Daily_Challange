package com.dataStructures.LeetcodeDailyChallange;

import java.util.Scanner;

public class SumOfAbsDiff {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        // Initialize the total sum of the array elements to 0
        int totalSum = 0;

        // Calculate the total sum of the array elements
        for (int num : nums) {
            totalSum += num;
        }

        int n = nums.length; // Store the length of the array
        int[] result = new int[n]; // Initialize the result array to store answers
        int prefixSum = 0; // Initialize the prefix sum to keep track of the sum of elements till the current index

        // Loop through each element to calculate the sum of absolute differences
        for (int i = 0; i < n; ++i) {

            int sumAbsoluteDifferences = nums[i] * i - prefixSum + totalSum - prefixSum - nums[i] * (n - i);
            result[i] = sumAbsoluteDifferences;
            prefixSum += nums[i];
        }

        // Return the final result array
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the value in sorted manner");
        for(int i=0 ; i< n ; i++ )
        {
            nums[i] = sc.nextInt();
        }

        int[] result = getSumAbsoluteDifferences(nums);
        for(int i =0 ; i<result.length ; i++) {
            System.out.println(result[i]);
        }
    }
}
