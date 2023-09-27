package com.dataStructures.LeetcodeDailyChallange;

import java.util.Scanner;

public class Problem880 {
    public static String  decodeAtIndex(String s, int k) {
        long size = 0; // Length of decoded `s`

        for (final char c : s.toCharArray())
            if (Character.isDigit(c))
                size *= c - '0';
            else
                ++size;

        for (int i = s.length() - 1; i >= 0; --i) {
            k %= size;
            if (k == 0 && Character.isAlphabetic(s.charAt(i)))
                return s.substring(i, i + 1);
            if (Character.isDigit(s.charAt(i)))
                size /= s.charAt(i) - '0';
            else
                --size;
        }

        throw new IllegalArgumentException();
    }

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();
        System.out.println("Enter the value of String:");
        String s = sc.nextLine();

        String result =  decodeAtIndex(s,k);
        System.out.println(result);

    }

}
