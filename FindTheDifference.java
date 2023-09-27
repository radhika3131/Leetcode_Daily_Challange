package com.dataStructures.LeetcodeDailyChallange;
import java.util.Arrays;
import java.util.Set ;
import java.util.HashSet;
import java.util.*;

public class FindTheDifference {

    //The time complexity of the above code is O(n) because we are traversing the strings only once.
    // Here n is the length of the given string.
        public static char findTheDifference(String s, String t) {
            int[] count = new int[26];
            char[] S = s.toCharArray(), T = t.toCharArray();
            for(int i=0;i<S.length;i++) count[S[i]-'a']++;
            for(int i=0;i<T.length;i++) count[T[i]-'a']--;
            for(int i=0;i<26;i++) if(count[i] !=0) return (char)(i+'a');
            return '\0';
           // The space complexity of the above code is O(1) because we are using constant space for frequency array.
        }
        public static void main(String[] args) {
            String s="abcd",t="abcde";
            char ans=findTheDifference(s,t);
            System.out.println(ans);
        }

}
