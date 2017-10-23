package com.ap.company.interview.pramati;

/**
 * Created by APandey1 on 18-10-2017.
 */
public class Shaktiman {
    static int shaktiman(int [] power){
        int initialCharge = 0;
        int sum =0;
        for(int num : power) {
            sum += num;
            if(sum < initialCharge)
                initialCharge = sum;
        }
        return -(initialCharge) +1;
    }
    public static void main(String[] args) {

        //int [] arr = {-5, 4, -2, 3, 1, -1, -6, -1, 0, 5};
        int [] power = {-5,4,-2,3,1};
        System.out.println(shaktiman(power));
    }
}
