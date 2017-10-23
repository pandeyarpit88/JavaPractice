package com.ap.Algorithm.string;

/**
 * Created by APandey1 on 06-10-2017.
 */
public class AllPermutationOfString {
    public static void printPermutations(String prefix, String str) {
        int n = str.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                printPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        AllPermutationOfString.printPermutations("", str);
    }
}
