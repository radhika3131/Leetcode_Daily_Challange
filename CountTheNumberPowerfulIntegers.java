package com.dataStructures.LeetcodeDailyChallange;

public class CountTheNumberPowerfulIntegers {
    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        long count =0;
        for(long i = start ; i<= finish ; i++)
        {
            String temp = Long.toString(i);
            if(temp.endsWith(s) && ALLDigitLimit(temp , limit))
            {
                count++;
            }
        }
        return count;
    }

    public static boolean ALLDigitLimit(String num , int limit)
    {
        for(char digit :num.toCharArray())
        {
            int digitVal = Character.getNumericValue(digit);

            if(digitVal > limit)
            {
                return false;
            }
        }

        return true;
    }

}
