package com.ap.hackerearth.basiProgramming;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by APandey on 05-04-2017.
 */
public class CountNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTestCases = scanner.nextInt();
		//String arr[] = new String[numOfTestCases];
		Pattern p = Pattern.compile("\\d+");
		for(int i=0; i<numOfTestCases; i++) {
			int count =0;
			int num = scanner.nextInt();
			scanner.nextLine();
			String s = scanner.nextLine();
			assert s.length() == num;
			Matcher m = p.matcher(s);
			while(m.find()) {
				count++;
			}
			System.out.println(count);
		}
	}
}
