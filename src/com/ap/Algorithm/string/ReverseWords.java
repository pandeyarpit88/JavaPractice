package com.ap.Algorithm.string;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by APandey on 06-04-2017.
 */
//https://www.hackerrank.com/contests/codejam/challenges/reverse-words
public class ReverseWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		scanner.nextLine();
		for(int j=0;j<tests;j++) {
			String str = scanner.nextLine();
			String strArr[] = str.split(" ");
			for(int i=0; i<strArr.length; i++) {
				String text = new StringBuffer(strArr[i]).reverse().toString();
				System.out.print(text.substring(0, 1).toUpperCase() + text.substring(1) + " ");
			}
			System.out.println();
		}
	}
}
