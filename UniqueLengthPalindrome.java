package com.dataStructures.LeetcodeDailyChallange;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueLengthPalindrome {
    public static int countPalindromicSubsequence(String s) {
        int ans = 0;
        for (char c = 'a'; c <= 'z'; ++c) {
            int l = s.indexOf(c), r = s.lastIndexOf(c);
            Set<Character> cs = new HashSet<>();
            for (int i = l + 1; i < r; ++i) {
                cs.add(s.charAt(i));
            }
            ans += cs.size();
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = countPalindromicSubsequence(s);
        System.out.println(result);
    }
}
