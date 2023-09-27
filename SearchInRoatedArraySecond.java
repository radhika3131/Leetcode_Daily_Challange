package com.dataStructures.LeetcodeDailyChallange;

import java.util.Scanner;

public class SearchInRoatedArraySecond {
    public static boolean search(int[] nums, int target) {
        int left=0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right -left)/2;
            if(nums[mid] == target)
                return true;
            if(nums[mid] > nums[left]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid-1;
                }
                else{
                    left = mid +1;
                }
            }
            else if (nums[mid] < nums[left]){
                if(nums[mid] <= target && target <= nums[right]){
                    left = mid +1;
                }
                else{
                    right = mid -1;
                }
            }else{
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();


        System.out.println( search(nums, target));
    }

}
