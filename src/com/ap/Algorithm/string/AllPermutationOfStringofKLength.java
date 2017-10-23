package com.ap.Algorithm.string;

/**
 * Created by APandey1 on 06-10-2017.
 */
public class AllPermutationOfStringofKLength {

    public static void printPermutationOfKLength(String str, String prefix, int k) {
        if(k ==0 ) {
            System.out.println(prefix);
            return;
        }
        for(int i=0; i<str.length(); i++)
            printPermutationOfKLength(str, prefix + str.charAt(i), k - 1);
    }

    public static void main(String[] args) {
        String str = "helloworld";
        AllPermutationOfStringofKLength.printPermutationOfKLength(str, "", 3);
    }
}
