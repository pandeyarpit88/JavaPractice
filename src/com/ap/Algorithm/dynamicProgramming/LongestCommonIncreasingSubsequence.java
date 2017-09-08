package com.ap.Algorithm.dynamicProgramming;

/**
 * Created by APandey1 on 08-09-2017.
 */
public class LongestCommonIncreasingSubsequence {
    public static Integer logestSequence(Integer arr[]) {
        int length = arr.length;
        Integer lis[] = new Integer[length];

        for(int i=0; i<length; i++)
            lis[i] = 1;

        for(int i=1; i<length; i++) {
            for(int j=0; j<i; j++) {
                if(arr[i] > arr[j] && lis[i]<lis[j]+1) {
                    lis[i] = lis[j]+1;
                }
            }
        }

        int max =0;
        for(int i=0; i<length; i++) {
            System.out.println(lis[i]);
            if(max < lis[i])
                max = lis[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Integer arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println("------>" + LongestCommonIncreasingSubsequence.logestSequence(arr));
    }
}
