package com.dataStructures.LeetcodeDailyChallange;

import java.util.Stack;

public class SlindingWindowMaximum {
    public static int[] NGER(int nums[])
    {
        Stack<Integer> st = new Stack<>();
        int nger[] = new int[nums.length];

        for(int i =nums.length -1; i>= 0; i--)
        {
            while(st.size() > 0 && nums[i] > nums[st.peek()])
            {
                st.pop();
            }

            if(st.size() ==0)
            {
                nger[i] = nums.length;
            }else
            {
                nger[i] = st.peek();
            }

            st.push(i);
        }

        return nger;
    }
    public static  int[] maxSlidingWindow(int[] nums, int k) {
        int nger[] = NGER(nums);

        int sidx = 0;
        int gidx = 0;
        int ans[] = new int[nums.length - k+1];
        while(sidx <= nums.length - k)
        {
            if(sidx > gidx)
            {
                gidx = sidx;
            }

            while(nger[gidx] < sidx + k)
            {
                gidx = nger[gidx];
            }

            ans[sidx] = nums[gidx];
            sidx++;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = maxSlidingWindow(nums,k);

        for(int i =0 ; i<result.length ; i++)
        {
            System.out.println(result[i]);
        }
        System.out.println();
    }


}
