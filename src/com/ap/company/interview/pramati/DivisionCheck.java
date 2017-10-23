package com.ap.company.interview.pramati;

/**
 * Created by APandey1 on 19-09-2017.
 */
public class DivisionCheck {
    //15
    public static void main(String[] args) {
        double d = 10.0/-0;
        if(d == Double.POSITIVE_INFINITY)
            System.out.println("Positive Infinity");
        else
            System.out.println("Negative Infinity");
    }
}
