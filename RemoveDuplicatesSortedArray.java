package com.dataStructures.TopLeetcodeInterviewQues;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        int uniqueCount = 1;

        for (int i = 1; i < nums.length; i++){

            if(nums[i] != nums[i-1]){
                nums[uniqueCount] = nums[i];
                uniqueCount += 1;
            }
        }

        return uniqueCount;
    }
    public static void print(int[] nums, int newLength) {
        System.out.println("Array after removing duplicates: " + Arrays.toString(nums));
        System.out.println("New Length: " + newLength);
        System.out.println();
    }
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 1, 2, 2, 3, 4, 4, 5};
        System.out.println("Test Case 1");
        System.out.println("Original Array: " + Arrays.toString(nums1));
        int Length1 = removeDuplicates(nums1);
        print(nums1, Length1);

        // Test Case 2
        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println("Test Case 2");
        System.out.println("Original Array: " + Arrays.toString(nums2));
        int Length2 = removeDuplicates(nums2);
        print(nums2, Length2);

        // Test Case 3
        int[] nums3 = {};
        System.out.println("Test Case 3");
        System.out.println("Original Array: " + Arrays.toString(nums3));
        int Length3 = removeDuplicates(nums3);
        print(nums3, Length3);

        // Test Case 4
        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 4");
        System.out.println("Original Array: " + Arrays.toString(nums4));
        int Length4 = removeDuplicates(nums4);
        print(nums4, Length4);
    }
}
