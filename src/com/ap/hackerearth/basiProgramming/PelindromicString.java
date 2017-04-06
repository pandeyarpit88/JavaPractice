package com.ap.hackerearth.basiProgramming;

import java.util.Scanner;

/**
 * Created by APandey on 05-04-2017.
 */
public class PelindromicString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		StringBuilder str = new StringBuilder(s);
		int len = str.length();
		assert 1<= len &&  len<=100;
		String strRev = str.reverse().toString();
		if (s.equals(strRev)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
