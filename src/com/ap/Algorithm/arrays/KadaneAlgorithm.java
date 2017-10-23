package com.ap.Algorithm.arrays;

/**
 * Created by APandey1 on 15-10-2017.
 */
//Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
public class KadaneAlgorithm {
    public static int maxArraySum(int []array) {
        int max_sum=Integer.MIN_VALUE, sum = 0;
        for(int a : array) {
            sum += a;
            if(max_sum < sum) {
                max_sum = sum;
            }
            if (sum < 0){
                sum =0;
            }
            System.out.println("Max sum so far : " + max_sum + ", sum : " + sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3, 9};
        maxArraySum(a);
    }
}
