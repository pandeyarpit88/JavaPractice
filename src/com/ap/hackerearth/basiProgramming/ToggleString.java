package com.ap.hackerearth.basiProgramming;

import java.util.Scanner;

/**
 * Created by APandey on 05-04-2017.
 */
public class ToggleString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		StringBuilder builder = new StringBuilder(line.length());
		for(Character c : line.toCharArray()) {
			if(Character.isUpperCase(c)) {
				builder.append(Character.toLowerCase(c));
			} else {
				builder.append(Character.toUpperCase(c));
			}
		}
		System.out.println(builder);
	}
}
