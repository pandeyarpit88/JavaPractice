package com.ap.company.interview.athena;

/**
 * Created by APandey on 22-03-2017.
 */
public class MaxMoney {
	static int maxMoney(int n, long k) {
		long sum = 0;
		int moduloConst = 1000000007;
		for (int index = 1; index <= n; index++) {
			sum += index;
			if (sum == k) {
				sum = ((long) n * (long) n + n) / 2 - 1;
				break;
			}
		}
		return (int) (sum % moduloConst);
	}

	public static void main(String[] args) {
		System.out.println(MaxMoney.maxMoney(4,6));
	}
}
