package com.dataStructures.LeetcodeDailyChallange;

import java.util.Scanner;

public class Problem1105 {

        public static int minHeightShelves(int[][] books, int shelfWidth) {
            int n = books.length;
            int[] f = new int[n + 1];
            for (int i = 1; i <= n; ++i) {
                int w = books[i - 1][0], h = books[i - 1][1];
                f[i] = f[i - 1] + h;
                for (int j = i - 1; j > 0; --j) {
                    w += books[j - 1][0];
                    if (w > shelfWidth) {
                        break;
                    }
                    h = Math.max(h, books[j - 1][1]);
                    f[i] = Math.min(f[i], f[j - 1] + h);
                }
            }
            return f[n];
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int width = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int array[][] = new int[m][n];
            System.out.println("Enter the elements of the array: ");

            for (int i = 0; i < m; i++)
            {
                for(int j =0; j<n ; j++)
                {
                    array[i][j] = sc.nextInt();
                }
            }

            int output = minHeightShelves(array , width);
            System.out.println(output);


        }

}
