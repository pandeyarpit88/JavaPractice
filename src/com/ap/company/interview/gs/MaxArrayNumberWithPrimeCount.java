package com.ap.company.interview.gs;

import java.util.Comparator;

/**
 * Created by APandey1 on 24-09-2017.
 */
public class MaxArrayNumberWithPrimeCount {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,31,1,3,12,4,2,1,3,4,23,44,32,31,5,3,5,5,6,7,8,89,3,89,98,89,88,89};
        for(int num : arr) {
            

        }
    }
}

class ArrayCount implements Comparable<ArrayCount> {

    int number;
    int numberCount;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public void setNumberCount(int numberCount) {
        this.numberCount = numberCount;
    }

    @Override
    public int compareTo(ArrayCount o) {
        return this.numberCount > o.getNumberCount() ? 1 : -1;
    }
}
