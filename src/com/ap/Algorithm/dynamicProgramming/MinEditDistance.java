package com.ap.Algorithm.dynamicProgramming;

/**
 * Created by APandey1 on 09-09-2017.
 */
public class MinEditDistance {
    public static int minEditDistance(char []s1, char []s2) {
        int m = s1.length;
        int n = s2.length;
        int med[][] = new int[m+1][n+1];

        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                if(i==0)
                    med[i][j] = i;
                else if(j==0)
                    med[i][j] = j;
                else if(s1[i-1] == s2[j-1])
                    med[i][j] = med[i-1][j-1];
                else
                    med[i][j] = min(med[i-1][j], med[i][j-1], med[i-1][j-1]) +1;
            }
        }
        return med[m][n];
    }

    public static int min(int i, int j, int k) {
        if(i<j && i< k) return i;
        return j<k?j:k;
    }

    public static void main(String[] args) {
        String str1 = "march";
        String str2 = "cart";
        System.out.println( minEditDistance( str1.toCharArray() , str2.toCharArray()) );
    }
}
