package com.dataStructures.LeetcodeDailyChallange;

public class SearchInMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length,n = matrix[0].length,i = 0,j = n - 1;
        while(i<m && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 0, 6, 8, 9, 11 },
                { 20, 22, 28, 29, 31 },
                { 36, 38, 50, 61, 63 },
                { 64, 66, 100, 122, 128 } };

        int target = 31; // element to search
       boolean result =  searchMatrix(matrix,target);
       System.out.println(result);
    }
}
