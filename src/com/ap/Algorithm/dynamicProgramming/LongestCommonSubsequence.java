package com.ap.Algorithm.dynamicProgramming;

/**
 * Created by APandey1 on 08-09-2017.
 */
public class LongestCommonSubsequence {

    public static Integer longestSubSequence(char[] x, char[] y) {
        Integer lcs[][] = new Integer[x.length + 1][y.length + 1];
        for(int i=0; i<=x.length; i++) {
            for(int j=0; j<=y.length; j++) {
                if(i==0 || j==0)
                    lcs[i][j] = 0;
                else if(x[i-1] == y[j-1])
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                else
                    lcs[i][j] = max(lcs[i-1][j], lcs[i][j-1]);
            }
        }

        for(int i=0; i<=x.length; i++) {
            for(int j=0; j<=y.length; j++) {
                System.out.print("   " + lcs[i][j]);
            }
            System.out.println();
        }

        return lcs[x.length][y.length];
    }

    private static Integer max(int i, int j) {
        return i>j?i:j;
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(LongestCommonSubsequence.longestSubSequence(s1.toCharArray(), s2.toCharArray()));
    }
}
