package com.dataStructures.TopLeetcodeInterviewQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElements {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the Input");
        int[] arr = new int[n];
        for(int i =0; i< n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int result = majorityElement(arr);
        System.out.println(result);
    }
}
