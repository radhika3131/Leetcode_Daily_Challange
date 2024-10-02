package com.dataStructures.TopLeetcodeInterviewQues;

import java.util.Scanner;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (k >= 0) {
            if (j < 0 || (i >= 0 && nums1[i] > nums2[j]))
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
    }
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         int m = sc.nextInt();
         int n = sc.nextInt();
         int[] num1 = new int[m];
         int[] num2 = new int[n];

         for(int i =0 ; i<m ; i++)
         {
             num1[i] = sc.nextInt();
         }

        for(int i =0 ; i<n ; i++)
        {
            num2[i] = sc.nextInt();
        }

        merge(num1 , m , num2 , n);
    }
}
